package com.qincan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.qincan.Application;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages="com.qincan.mapper")
@ComponentScan(basePackages= {"com.qincan", "org.n3r.idworker"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
