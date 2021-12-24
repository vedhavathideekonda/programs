package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)


class MathUtilsTest1 {
	
 MathUtils MathUtilsTest1;
 
	@BeforeAll
     void runsbeforeallstest() 
	{
		System.out.println("@BeforeAll");
	}

	@AfterAll
	 void runsafteralltest() 
	{
		System.out.println("@AfterAll");
	}

	@BeforeEach
	void first()
	{
		MathUtilsTest1=new MathUtils();	
		System.out.println("@BeforeEach");
	}


	@AfterEach
	void last()
	{
		System.out.println("@AfterEach is cleaning up");
	}

	@Test
	void test1() {
		int expected=6;
		int actual=MathUtilsTest1.add(4, 2);
		assertEquals(expected,actual,"add two numbers");
		System.out.println("test1 pass");

	}
	
	@Test
	void test2() {
		int expected=6;
		int actual=MathUtilsTest1.sub(12, 6);
		assertEquals(expected,actual,"sub two numbers");
		System.out.println("test2 pass");

	}

}
