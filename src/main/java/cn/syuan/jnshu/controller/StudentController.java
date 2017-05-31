package cn.syuan.jnshu.controller;  
  
import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.ResponseBody;  
  
import cn.syuan.jnshu.model.EntryForm;  
import cn.syuan.jnshu.service.StudentService;  
  
@Controller  
@RequestMapping("/student")  
public class StudentController {  
      
    @Resource  
    private StudentService studentService;  
  
    @RequestMapping("/showStudent")  
    public String toIndex(HttpServletRequest request, Model model) {  
        Integer studentId = new Integer(request.getParameter("id"));  
        EntryForm student = studentService.getStudentById(studentId);  
        model.addAttribute("student", student);  
        return "showStudent";  
    }  
  
    @RequestMapping(value = "/info/{studentId}", method = RequestMethod.GET)
    @ResponseBody
    public  EntryForm getStudentInfo(@PathVariable String studentId, HttpServletRequest request,  
            HttpServletResponse response) throws Exception {  
  
        EntryForm student = studentService.getStudentById(new Integer(studentId));  
        response.setContentType("text/json"); 
        response.setCharacterEncoding("UTF-8");

        return student;  
  
    }  

    @RequestMapping(value="/info/{entryForm}", method = RequestMethod.PUT)
    @ResponseBody
    public int updateStudentInfo(@PathVariable EntryForm entryForm ,HttpServletRequest request,
            HttpServletResponse response) throws Exception{


        EntryForm student=studentService.getStudentById(entryForm.getId());
        student.setName(entryForm.getName());
        student.setCreateTime(entryForm.getCreateTime());
        student.setQq(entryForm.getQq());
        student.setMajor(entryForm.getMajor());
        student.setStartDate(entryForm.getStartDate());
        student.setSchool(entryForm.getSchool());
        student.setOnlineclass(entryForm.getOnlineclass());
        student.setOnlineno(entryForm.getOnlineno());
        student.setRecommender(entryForm.getRecommender());
        student.setCensor(entryForm.getCensor());

        return 0;
    }
    
    @RequestMapping(value="/info/{studentId}", method = RequestMethod.POST)
    @ResponseBody
    public int createStudentInfo(@PathVariable String studentId, HttpServletRequest request,
                                 HttpServletResponse response) throws Exception{

        int student=studentService.addStudent();

        return student;
    }
    
    @RequestMapping(value="/info/{studentId}", method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteStudentInfo(@PathVariable String studentId, HttpServletRequest request,
                                 HttpServletResponse response) throws Exception{

        

        return 0;
    }
}  