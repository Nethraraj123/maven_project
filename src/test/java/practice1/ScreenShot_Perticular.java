package practice1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_Perticular {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		TakesScreenshot ts= driver;
		Thread.sleep(2000);
		
		WebElement laptop=driver.findElement(By.xpath("//a[@title='Show details for Apple MacBook Pro 13-inch']"));////div[@class='product-grid home-page-product-grid'] for all
		File screenShot=laptop.getScreenshotAs(OutputType.FILE);
		
		File target = new File("C:\\QCCA22\\Arrays\\PART 3\\Maven_Practice\\Screenshot\\Laptop.png");
		FileUtils.copyFile(screenShot, target);

	}

}
