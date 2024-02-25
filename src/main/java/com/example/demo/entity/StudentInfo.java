package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="studentsinfo")
public class StudentInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StudentID")
	private int studentID;
	
	@Column(name = "StudentName")
	private String studentname;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Phone")
	private String phone;

	public StudentInfo() {
		super();
	}

	public StudentInfo(String studentname, String address, String email, String phone) {
		super();
		this.studentname = studentname;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "StudentInfo [studentID=" + studentID + ", studentname=" + studentname + ", address=" + address
				+ ", email=" + email + ", phone=" + phone + "]";
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
