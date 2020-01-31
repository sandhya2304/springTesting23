package com.sandhya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestingApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringTestingApplication.class, args);
		
		System.out.println("hello heroku...  :) ");
	}

}
