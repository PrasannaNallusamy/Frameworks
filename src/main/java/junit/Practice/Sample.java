package junit.Practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample {

	// All method Should be public
	//	@BeforeClass @AfterClass should be static

	@Before
	public void before() {
		System.out.println("method started");
	}

	@Test
	public void test1() {
		System.out.println("Test-1 executed");
	}

	@Test
	public void test2() {
		System.out.println("Test-2 executed");
	}

	@After
	public void after() {
		System.out.println("method Completed");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("==============Test Completed==============");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("==============Test Started==============");

	}

}
