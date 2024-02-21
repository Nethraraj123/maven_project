package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolingdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/privacy/policy/?entry_point=facebook_page_footer");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement link=driver.findElement(By.linkText("Products"));
		
		
		
		//scroll down completly
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",link);
		link.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}
		
	}


