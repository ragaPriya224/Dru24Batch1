package com.druCare.apiDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DemoTest {

	Demo demo = new Demo();
	@Test
	void getDataLength() {
		int output = demo.dataCalculation("hello");
		assertEquals(5, output); //expectation , actual
	}
}
