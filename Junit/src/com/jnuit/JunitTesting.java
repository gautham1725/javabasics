package com.jnuit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTesting {

	@Test
	void test() {
		
		JunitExamples test = new JunitExamples();
		int output = test.square(6);
		assertEquals(36 , output);
	}

}
