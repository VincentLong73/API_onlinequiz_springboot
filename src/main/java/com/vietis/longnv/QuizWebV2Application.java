package com.vietis.longnv;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.vietis.longnv"})
@EntityScan(basePackages = {"com.vietis.longnv.entity"})
public class QuizWebV2Application {

	
	public static void main(String[] args) {
		SpringApplication.run(QuizWebV2Application.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		
		return new ModelMapper();
	}

}
