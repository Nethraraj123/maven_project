package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nested_Iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		//to focus on outer frame from webpage
		//switching to outer frame
		WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		//switching to inner frame
		WebElement innerframe=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		Thread.sleep(2000);
		//enter the name inside the textbox using sendkeys method
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nethra");
		
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.linkText("WebTable")).click();
		

	}

}
