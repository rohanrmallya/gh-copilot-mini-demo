package com.roro.gh.copilot.demo;

import com.roro.gh.copilot.demo.utils.BookManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.roro.gh.copilot.demo")
public class DemoApp {

	public static void main(String[] args) {

		BookManager.load();
		SpringApplication.run(DemoApp.class, args);
	}

}
