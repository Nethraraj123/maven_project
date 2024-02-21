package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//creating an object for actions class
		Actions action=new Actions(driver);
		
		//source and target element / drag and drop elements
		WebElement football=driver.findElement(By.id("draggable"));
		WebElement area1=driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(football, area1).build().perform();
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		
		WebElement area2=driver.findElement(By.id("dropzone2"));
		
		action.dragAndDrop(football, area2).build().perform();
	}

}
