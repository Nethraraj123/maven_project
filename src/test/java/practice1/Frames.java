package practice1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/dialog/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        
        driver.switchTo().defaultContent();//come back from frame
        driver.findElement(By.xpath("//a[text()='Demos']")).click();

	}

}
