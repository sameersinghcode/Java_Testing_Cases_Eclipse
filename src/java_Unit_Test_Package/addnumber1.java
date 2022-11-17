package java_Unit_Test_Package;

import static org.junit.Assert.*;

import org.junit.Test;

public class addnumber1 {

	@Test
	public void test() {
		Java_Unit_TestFunctions junit = new Java_Unit_TestFunctions();
		int result = junit.addnumber(100, 200);
		assertEquals (300, result);
	}

}
