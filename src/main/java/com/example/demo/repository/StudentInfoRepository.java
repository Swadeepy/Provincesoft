package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentInfo;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo, Integer> {

}
