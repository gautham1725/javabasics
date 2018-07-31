package com.jnuit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumExamples {

	@Test
	void test() {
		
		JunitExamples t1 = new JunitExamples();
		int op = t1.sum(5, 10);
		assertEquals(15 , op);
		
	}
	
	

}
