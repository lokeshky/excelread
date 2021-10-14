package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemoJavaTPoint {
	
	public static void main(String[] args) throws InterruptedException  
	{  
		String projectPath = System.getProperty("user.dir");
    	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();  
	driver.manage().window().maximize();  
	driver.manage().deleteAllCookies();  
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // pageload timeout  
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
	// Implicit Wait for 20 seconds  
	driver.get("https://accounts.google.com/signin");  
	driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("JavaTpoint.com"); //Finding element and sending values  
	Thread.sleep(1000);  
	driver.findElement(By.xpath("//input[@id='login-signin']")).click(); //Clicking on the next button if element is located  
	}  

}
