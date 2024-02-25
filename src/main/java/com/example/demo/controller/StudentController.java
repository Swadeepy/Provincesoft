package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentInfo;
import com.example.demo.repository.StudentInfoRepository;

@RestController
public class StudentController {

	@Autowired
	StudentInfoRepository repo;

	@GetMapping("/studentdetails")
	public List<StudentInfo> getStudentDetails() {
		// System.out.println("student");

		List<StudentInfo> StdInfo = repo.findAll();
		return StdInfo;
	}
	
	@PostMapping("/saveStudentData")
	public ResponseEntity<StudentInfo> saveStudentDetails(@RequestBody StudentInfo studentinfo)
	{
		StudentInfo Info = repo.save(studentinfo);
	   return ResponseEntity.status(HttpStatus.CREATED).body(Info);
	}
	
	@GetMapping("/getDetailsbyID/{ID}")
	public ResponseEntity<Optional<StudentInfo>> getDetailsByID(@PathVariable int ID)
	{
		Optional<StudentInfo> Info = repo.findById(ID);
	   return ResponseEntity.ok(Info);
	}
	
	

}
