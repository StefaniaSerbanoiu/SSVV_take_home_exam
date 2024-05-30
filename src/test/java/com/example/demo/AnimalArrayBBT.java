package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class AnimalArrayBBT {

	AnimalArray array;

	@BeforeEach
	void setup() {
		array = new AnimalArray(Arrays.asList(1, 2, 3, 4, 3, 2, 1, 1, 2, 3, 1));
	}

	@Test
	void tc1() {
        Assertions.assertTrue(array.findPair(1, 0));
	}

	@Test
	void tc2() {
		Assertions.assertTrue(array.findPair(0, 1));
	}

	@Test
	void tc3() {
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			array.findPair(-4, -4);
		});
	}

	@Test
	void tc4() {
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			array.findPair(0, -4);
		});
	}

	@Test
	void tc5() {
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			array.findPair(-4, 0);
		});
	}

	@Test
	void tc6() {
		Assertions.assertThrows(Exception.class, () -> {
			array.findPair(0, 0);
		});
	}

}
