package jUnitTestExampPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddStrings {

	@Test
	void test() {
		/*jUnitTesting junit=new jUnitTesting();
		String result=junit.addStrings("new", "project");
		assertEquals ("newproject",result);*/
		
		jUnitTesting  junit=new jUnitTesting();
		String result=junit.addStrings("new", "project");
		assertEquals ("newproject",result);
	}

}
