package com.jackson.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Runner {

	public static void main(String[] args) {
		
		try {
			
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map/convert to Java POJO:
			// data/sample-lite.json
			Student st = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			
			// print first/last name
			System.out.println("First name: " +st.getFirstName() );
			System.out.println("Last name: " +st.getLastName());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
