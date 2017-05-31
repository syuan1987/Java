package cn.syuan.jnshu.service;  
  
import javax.annotation.Resource;

import org.springframework.stereotype.Service;  
  
import cn.syuan.jnshu.dao.EntryFormMapper;  
import cn.syuan.jnshu.model.EntryForm;


@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Resource
	private EntryFormMapper entryFormDAO;
	
	@Override
	public EntryForm getStudentById(Integer id){
		return entryFormDAO.selectByPrimaryKey(id);
	}
    
	@Override
	public int addStudent(){
		return entryFormDAO.insert();
	}

	@Override
	public int deleteStudentById(Integer id) {
		
		return entryFormDAO.deleteByPrimaryKey(id);
	}

	@Override
	public int updateStudentById(Integer id) {
		
		return entryFormDAO.updateByPrimaryKey(id);
	}
	
}
