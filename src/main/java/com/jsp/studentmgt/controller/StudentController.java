package com.jsp.studentmgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.studentmgt.service.studentservice.StudentService;
import com.jsp.studentmgt.studentDTO.Studentdto;

@RestController
@RequestMapping("/student_management")
public class StudentController {
	
	@Autowired
	private StudentService stdservice;
	
	@PostMapping("/Register")
	public ResponseEntity<String> addstudent(@RequestBody Studentdto std){
		System.out.println("done");
		return new ResponseEntity<String>(stdservice.addStudent(std),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/View")
	public ResponseEntity<List<Studentdto>> find(){
		return new ResponseEntity<List<Studentdto>>(stdservice.findall(),HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/Edit")
	public ResponseEntity<Studentdto> update(@RequestBody Studentdto std){
		return new ResponseEntity<Studentdto>(stdservice.updateStudent(std),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/Delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		return new ResponseEntity<String>(stdservice.delete(id), HttpStatus.ACCEPTED);
	}
}
