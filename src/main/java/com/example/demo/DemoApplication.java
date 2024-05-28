package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;



public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		List<Integer> givenArray = List.of(1, 2, 3, 4, 3, 2, 1, 1, 2, 3, 1);
		AnimalArray animalArray = new AnimalArray(givenArray);
		List<Integer> newArray = animalArray.beFriends();
		System.out.println(newArray);
	}

}
