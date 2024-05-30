package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AnimalArrayIntegrationTesting {
	@Test
	void tc1() {
		var array = new AnimalArray(Arrays.asList(1,2,3,4));
		Assertions.assertArrayEquals(
				new Integer[] {1,4,2,4,3,4},
				array.beFriends().toArray()
		);
	}
	@Test
	void tc2() {
		var array = new AnimalArray(Arrays.asList(3,4,4,1));
		Assertions.assertArrayEquals(
				new Integer[] {3,4,4,1},
				array.beFriends().toArray()
		);
	}
	@Test
	void tc3() {
		var array = new AnimalArray(Arrays.asList(1, 2, 3, 2, 3, 1));
		Assertions.assertArrayEquals(
				new Integer[] {1, 4, 2, 4, 3, 4, 2, 4, 3, 1},
				array.beFriends().toArray()
		);
	}
	@Test
	void tc4() {
		var array = new AnimalArray(Arrays.asList(1, 2, 3, 2));
		Assertions.assertArrayEquals(
				new Integer[] {1, 4, 2, 4, 3, 4, 2},
				array.beFriends().toArray()
		);
	}
	@Test
	void tc5() {
		var array = new AnimalArray(List.of());
		Assertions.assertArrayEquals(
				new Integer[] {},
				array.beFriends().toArray()
		);
	}
	@Test
	void tc6() {
		var array = new AnimalArray(List.of(1));
		Assertions.assertArrayEquals(
				new Integer[] {1},
				array.beFriends().toArray()
		);
	}
	@Test
	void tc7() {
		var list = new ArrayList<Integer>();
		for (int i = 0; i < 10000; i++) {
			list.add((i % 2) + 1);
		}
		var array = new AnimalArray(list);
		var result = new ArrayList<Integer>();
		for (int i = 0; i < 10000; i++) {
			result.add((i % 2) + 1);
			if (i != 9999)
				result.add(4);
		}
		Assertions.assertArrayEquals(result.toArray(), array.beFriends().toArray());
	}

}
