package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWaitDemo {
	
	@Test
	public void test() throws InterruptedException {
	
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("perl");
		driver.findElement(By.name("btnK")).click();
		
		//driver.findElement(By.linkText("ABCD - NIMH Data Archive")).click();
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       WebElement linkelement = driver.findElement(By.partialLinkText("Perl Scripting Language Tutorial | Edureka"));			       
			       if (linkelement.isEnabled()) {
			    	   System.out.println("element found");
			    	   
			       }
			       return linkelement;
			     }
			   });
			   
			   
		element.click();
		Thread.sleep(2000);
		driver.close();
		
		driver.quit();
		
		
	}

}
