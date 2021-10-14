package wait;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemoTestProject {
	
	WebDriver driver=null;
	
	@Test
	public void demoExplicitWait () throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	  driver.get("https://testproject.io/");
	  Thread.sleep(2000);
	  driver.findElement(By.id("menu-item-901")).click();
	  
	  WebDriverWait wait = new WebDriverWait(driver, 5);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tp-forgot-password")));
	  driver.findElement(By.id("tp-forgot-password")).click();
	}

}
