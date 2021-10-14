package testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class TestngIgnoreDemo {
	
	@Ignore
	@Test
	public void test1() {
		System.out.println("i am inside test1");
	}

	@Test
	public void test2() {
		System.out.println("i am inside test2");
	}
	
	@Test
	public void test3() {
		System.out.println("i am inside test3");
	}

}
