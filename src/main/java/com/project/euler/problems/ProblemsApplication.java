package com.project.euler.problems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.euler.helper.PrimeFactorHelper;

@SpringBootApplication
public class ProblemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProblemsApplication.class, args);

		System.out.println(PrimeFactorHelper.findAllPrimeFactorsForANumber(600851475143L));

	}

}
