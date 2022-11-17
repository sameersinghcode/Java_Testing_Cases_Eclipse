package java_Unit_Test_Package;

import static org.junit.Assert.*;

import org.junit.Test;

public class Addstringtest {

	@Test
	public void test() {
		Java_Unit_TestFunctions junitstring = new Java_Unit_TestFunctions();
		String result = junitstring.addstring("My", "Project");
		assertEquals ("MyProject", result);
	}

}
