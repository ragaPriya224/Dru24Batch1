package drubatchTwentyFour.one.unitTestingDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

	@AfterEach
	public void afterMethod() {
		System.out.println("After method");
	}
	@BeforeEach
	public void beforeMethod() {
		System.out.println("before method");
	}
	@Test
	public void testToPrintLength() {
		System.out.println("method 1 is called");
	}
	@Test
	public void testm2() {
		System.out.println("method 2 is called");
	}

}
