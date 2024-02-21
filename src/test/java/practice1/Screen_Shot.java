package practice1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen_Shot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//To capture full page of screenshot
		//TakesScreenshot ts=(TakesScreenshot) driver;//when ever we have to give WebDriver driver=new ChromeDriver();
		
		//when ever we have to give chromedriver driver=new ChromeDriver();
		//To capture full page of screenshot stores a driver into reference varieable of screenshot
		TakesScreenshot ts= driver;
		
		//stores a screenshot inside a variable type file and parameters is outputtype
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		
		//targer location which specify the screenshot with name
		File target = new File("C:\\QCCA22\\Arrays\\PART 3\\Maven_Practice\\Screenshot\\Fullpage.png");
		
		//it si a class to store reference variable screenshot and target at single place
		FileUtils.copyFile(screenShot, target);
		

	}

}
