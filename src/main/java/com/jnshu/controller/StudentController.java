package com.jnshu.controller;

import com.jnshu.model.Student;
import com.jnshu.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by Administrator on 2017/4/14.
 */

@Controller
@RequestMapping("/student")
public class StudentController {

    private Logger log = Logger.getLogger(StudentController.class);
    @Resource
    private StudentService studentService;

    //注册页面：输入学生名字和密码，点击注册，成功跳转到登陆页面
    @RequestMapping(value="/regist", method = RequestMethod.GET)
    public String Regist(){
        log.info("------>正在登录");
        return "regist";
    }
    @RequestMapping(value ="/registfrom",method = RequestMethod.POST)
    public String Regist(@ModelAttribute("stu")Student stu){
        log.info("----->"+stu);
        long createTime = System.currentTimeMillis();
        stu.setCreate_at(createTime);
        studentService.addStudent(stu);
        return "login";
    }

    //登陆页面：账户密码输入错误会刷新登陆页面重新输入，成功会进入列表
    @RequestMapping(value = "/login",method =RequestMethod.GET)
    public String Login(){
        log.info("输入登陆用户名和密码");
        return "login";
    }
    @RequestMapping(value = "/loginto",method=RequestMethod.POST)
    public String Login(@ModelAttribute("stu")Student stu){
        log.info("输入成功"+stu.toString());
        if(studentService.Login(stu.getStu_name(),stu.getStu_pwd())!=null){
            return "redirect:/student/list";
        }else{
            return "login";
        }
    }

    //显示所有学生列表
    @RequestMapping(value="/list",method =RequestMethod.GET)
    public String showStudent(Model model){
        log.info("查询所有用户信息");
        List<Student> studentList = studentService.getAllStudent();
        model.addAttribute("studentList",studentList);
        return "list";
    }

    //添加学生
    @RequestMapping(value="/add",method=RequestMethod.GET)
    public String addStudent(){
        log.info("添加用户信息");
        //返回add.jsp页面
        return "add";
    }
    @RequestMapping(value="/addStu",method=RequestMethod.POST)
    public String addStudentPost(@ModelAttribute("stu")Student stu){
        System.out.println("------>"+stu.getStu_name());
        log.info("显示用户信息"+stu);
        long createTime = System.currentTimeMillis();
        stu.setCreate_at(createTime);
        studentService.addStudent(stu);
        return "redirect:/student/list";
    }

    //删除学生
    @RequestMapping(value = "/delete/{id}",method =RequestMethod.GET)
    public String deleteStudentById(@PathVariable("id")int id){
        log.info("删除用户");
        try{
            studentService.deleteStudentById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/student/list";
    }

    //修改学生
    @RequestMapping(value="/update/{id}",method=RequestMethod.GET)
    public String updateStudentById(@PathVariable("id")int id,Model model){
        System.out.println("-------"+id);
        log.info("修改学员信息");
        model.addAttribute(id);
        return "update";
    }
    @RequestMapping(value="/updateStu",method=RequestMethod.POST)
    public String updateStndentByIdPost(@ModelAttribute("stu")Student stu){
        long updateTime = System.currentTimeMillis();
        stu.setUpdate_at(updateTime);
        studentService.updateStudentById(stu);
        System.out.println("----->"+stu);
        log.info("修改成功");
        return "redirect:/student/list";
    }
}
