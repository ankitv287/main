package com.nagarro.azureAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureAssignmentApplication {
	
	public String message() {
		return "Contratulations Your Code Deployed Succussfully on Azure";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureAssignmentApplication.class, args);
	}

}
