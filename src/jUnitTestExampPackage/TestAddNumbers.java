package jUnitTestExampPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddNumbers {

	@Test
	void test() {
		jUnitTesting junit=new jUnitTesting();
		int result=junit.addNumbers(150, 200);
		assertEquals (350,result);
	}

}
