package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestforgitApplication {

	@Autowired
	 Counting ct;  
	
	public static void main(String[] args) {
		SpringApplication.run(TestforgitApplication.class, args);
		TestforgitApplication.TestMsg("Wellcome to Git Test");
		System.out.println("Thirtd Commit");
		//ct.Count();
	}
	  
	public static void TestMsg(String s)
	{
		System.out.println(s);
	}
}
   