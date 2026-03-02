package junit.suit.practice;

import org.junit.After;
import org.junit.Test;

public class Test1 {

	@Test
	public void sample1() {
		System.out.println("Sample 1");
	}

	@After
	public void after() {
		System.out.println("==============================");
	}

}
