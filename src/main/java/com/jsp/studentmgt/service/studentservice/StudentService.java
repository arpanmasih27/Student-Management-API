package com.jsp.studentmgt.service.studentservice;

import java.util.List;
import com.jsp.studentmgt.studentDTO.Studentdto;


public interface StudentService {
	
	String addStudent(Studentdto s);
	List<Studentdto> findall();
	Studentdto updateStudent(Studentdto s);
	String delete(int id);

	
}
