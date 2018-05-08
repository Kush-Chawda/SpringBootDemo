package com.knack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class AppMain extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app)
	{
		return app.sources(AppMain.class);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(AppMain.class, args);
	}

}
