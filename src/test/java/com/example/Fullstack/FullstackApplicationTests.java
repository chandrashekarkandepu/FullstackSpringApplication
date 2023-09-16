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

	@Test
	public void imageForLoop(){

		String folderPath = "/Users/chandrashekarkandepu/Downloads/FullstackApplication/Fullstack/src/test/resources/static"; // Replace with the actual folder path

		File folder = new File(folderPath);

		if (folder.exists() && folder.isDirectory()) {
			File[] imageFiles = folder.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					String lowercaseName = name.toLowerCase();
					return lowercaseName.endsWith(".jpg") || lowercaseName.endsWith(".png"); // Add more extensions if needed
				}
			});

			if (imageFiles != null) {
				for (File imageFile : imageFiles) {
					// Process the image file (perform actions as needed)
						System.out.println("Processing image file: " + imageFile.getName());
					Assertions.assertEquals(1,1,"matched");

				}
			} else {
				System.out.println("No image files found in the folder.");
			}
		} else {
			System.out.println("The folder does not exist or is not a directory.");
		}
		System.out.println(employeeService.getTxt());

	}
	@Test
	public void gettext(){
		System.out.println(employeeService.getTxt());
	}


}
