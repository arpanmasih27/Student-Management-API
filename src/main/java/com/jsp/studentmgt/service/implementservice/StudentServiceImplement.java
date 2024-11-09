package com.jsp.studentmgt.service.implementservice;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jsp.studentmgt.entity.Student;
import com.jsp.studentmgt.mapping.StudentMapper;
import com.jsp.studentmgt.repositories.StudentReposetory;
import com.jsp.studentmgt.service.studentservice.StudentService;
import com.jsp.studentmgt.studentDTO.Studentdto;

@Service
public class StudentServiceImplement implements StudentService{
	
	@Autowired
	private StudentReposetory stdrepo;

	@Override
	public String addStudent(Studentdto s) {
		Student std = StudentMapper.maptostudent(s);
		stdrepo.save(std);
		return "Data saved";
	}


	@Override
	public List<Studentdto> findall() {
		List<Student> list = stdrepo.findAll();
		List<Studentdto> stddto = new ArrayList<>();
		for (Student s : list) {
			stddto.add(StudentMapper.maptostudentdto(s));
		}
		// TODO Auto-generated method stub
		return stddto;
	}

	@Override
	public Studentdto updateStudent(Studentdto s) {
		Student std = StudentMapper.maptostudent(s);
		if(stdrepo.existsById(std.getId())){
			stdrepo.save(std);
		}else throw new NullPointerException();
		
		// TODO Auto-generated method stub
		return StudentMapper.maptostudentdto(std);
	}

	@Override
	public String delete(int id) {
		if(stdrepo.existsById(id)){
			stdrepo.deleteById(id);
		}else throw new NullPointerException();
		// TODO Auto-generated method stub
		return "Data deleted";
	}

	

}
