package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo2 {
	
	@Test
	public void test4() {
		System.out.println("--- Inside test4---");
	}
	
	@Test
	public void test5() {
		System.out.println("--- Inside test5---");
		//Assert.assertTrue(false);
	}
	
	@Test
	public void test6() {
		System.out.println("--- Inside test6---");
		//throw new SkipException("this is skip method");  
	}
	
	

}
