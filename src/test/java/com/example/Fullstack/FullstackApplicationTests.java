package com.example.Fullstack;

import com.example.Fullstack.services.EmployeeService;
import com.example.Fullstack.services.EmployeeServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FilenameFilter;


@SpringBootTest

class FullstackApplicationTests {
	@Autowired
	EmployeeServiceImpl employeeService;
	@Test
	void contextLoads() {
	}

	


}
