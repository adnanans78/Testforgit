package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestforgitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestforgitApplication.class, args);
		TestforgitApplication.TestMsg("Wellcome to Git Test");
		System.out.println("Thirtd Commit");
	}
	  
	public static void TestMsg(String s)
	{
		System.out.println(s);
	}
}
   