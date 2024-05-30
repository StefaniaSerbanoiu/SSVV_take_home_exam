package com.example.demo;

import java.util.List;



public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Given array :");
		List<Integer> givenArray = List.of(1, 2, 3, 4, 3, 2, 1, 1, 2, 3, 1);
		System.out.println(givenArray);
		AnimalArray animalArray = new AnimalArray(givenArray);
		System.out.println("Modified array: ");
		List<Integer> newArray = animalArray.beFriends();
		System.out.println(newArray);
	}

}
