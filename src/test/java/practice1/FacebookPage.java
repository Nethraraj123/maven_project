package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookPage {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("nethra@gmail.com");
	        Thread.sleep(4500);
	        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	        Thread.sleep(4000);
	        
	        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));//Declaration Command for Explicit Wait Condition
	        //Usage command for Explicit wait condition
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname']")));
	        //After the above line default condition will be 0 and again webelemnt try to find new web element from 0 seconds
	        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nethra");
	        Thread.sleep(4200);
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='lastname']")));
	        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
	    }

	
	}

