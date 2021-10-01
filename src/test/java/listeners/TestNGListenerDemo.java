package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {
	
	@Test
	public void test1() {
		System.out.println("--- Inside test1---");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("project path is :"+projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
		
		driver.findElement(By.name("aaa")).sendKeys("wrong");
		driver.close();
	}
	
	@Test
	public void test2() {
		System.out.println("--- Inside test2---");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3() {
		System.out.println("--- Inside test3---");
		throw new SkipException("this is skip method");  
	}
	
	

}
