package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_createnewaccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nethrar1111@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Pulwama@48");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();////a[@id='u_0_0_2D']
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nethra");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9380652971");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Pulwama@48");
		
		
		
		WebElement days=driver.findElement(By.id("day"));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("month")));
		WebElement months=driver.findElement(By.id("month"));
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("year")));
		WebElement years=driver.findElement(By.id("year"));
		
		Select day=new Select(days);
		day.selectByVisibleText("11");
		
		
		Select month=new Select(months);
		month.selectByVisibleText("Feb");
		
		Select year=new Select(years);
		year.selectByVisibleText("2010");
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@data-type='radio']//label[text()='Female']")));
		driver.findElement(By.xpath("//span[@data-type='radio']//label[text()='Female']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		//driver.findElement(By.xpath("//div[text()='An error occurred. Please try again.']")).getText();
//		Alert al=driver.switchTo().alert();
//		
//		String alertText=al.getText();
//		System.out.println(alertText);
		
		driver.findElement(By.xpath("//a[text()='Close']")).click();
		
		
		//Thread.sleep(5000);
		//driver.quit();
		
	}

}
