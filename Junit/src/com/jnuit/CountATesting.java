package com.jnuit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountATesting {

	@Test
	void test() {
		
		JunitExamples t2 = new JunitExamples();
		int op1 = t2.countA("aaaa");
		assertNotEquals(3 , op1);
		
	}

}
