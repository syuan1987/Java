package cn.syuan.jnshu.service;  
  
import cn.syuan.jnshu.model.EntryForm;  
  
public interface StudentService {  
    EntryForm getStudentById(Integer id);
    int addStudent();
    int deleteStudentById(Integer id);
    int updateStudentById(Integer id);
}  