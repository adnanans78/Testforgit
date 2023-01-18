package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestC {

	@RequestMapping("/Test")
	public void Called()
	{
		
		System.out.println("Testing here");
		System.out.println("Second Testing here");  
		     
	} 
	
	
}
 