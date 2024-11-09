package com.jsp.studentmgt.mapping;

import com.jsp.studentmgt.entity.Student;
import com.jsp.studentmgt.studentDTO.Studentdto;

public class StudentMapper {
	public static Student maptostudent(Studentdto studentdto) {
		Student std = new Student(studentdto.getId(), studentdto.getName(), studentdto.getAge(), studentdto.getAddress());
		return std;
	}
	
	public static Studentdto maptostudentdto(Student student) {
		Studentdto stddto = new Studentdto(student.getId(), student.getName(), student.getAge(), student.getAddress());
		return stddto;
	}
}
