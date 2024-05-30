package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class AnimalArrayWBT {

	AnimalArray array;

	@BeforeEach
	void setup() {
		array = new AnimalArray(Arrays.asList(1, 2, 3, 4, 3, 2, 1, 1, 2, 3, 1));
	}

	@Test
	void tc1() {
		array.insertCow(0);
	}

	@Test
	void tc2() {
		array.insertCow(1);
	}

	@Test
	void tc3() {
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			array.insertCow(-3);
		});
	}

}
