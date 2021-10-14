package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitDemoEaseMytrip {
	
  
	    public static void main(String[] args) throws InterruptedException {
	    	
	    	String projectPath = System.getProperty("user.dir");
	    	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
	    	WebDriver driver = new ChromeDriver(); 
	    	
         
	        driver.manage().window().maximize();  
	        
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	        
	        driver.get("https://www.easemytrip.com/");          
	        driver.findElement(By.id("FromSector_show")).sendKeys("Delhi",Keys.ENTER);          
	driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai",Keys.ENTER);  
	        driver.findElement(By.id("ddate")).click();  
	        driver.findElement(By.id("snd_4_08/08/2019")).click();  
	        driver.findElement(By.className("src_btn")).click();  
	        driver.findElement(By.xpath("//button[text()='Book Now']")).click();      
	    }  
	}  


