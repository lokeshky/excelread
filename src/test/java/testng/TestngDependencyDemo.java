package testng;

import org.testng.annotations.Test;

public class TestngDependencyDemo {
	
	@Test(dependsOnMethods = {"test2"})
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
