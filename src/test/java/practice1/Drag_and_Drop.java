package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();//to set the property
		WebDriver driver=new ChromeDriver();//create the object of chromedriver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//to avoid synchronization issues
		driver.get("https://jqueryui.com/droppable/");//retrive the url
		driver.manage().window().maximize();//maximize the window
		Thread.sleep(2000);
		driver.switchTo().frame(0);//switch to frame
		
		WebElement dragarea=driver.findElement(By.id("draggable"));//find the draggable element
		WebElement droparea=driver.findElement(By.id("droppable"));//find the droppable element
		Thread.sleep(2000);
		
		//creating an object for actions class
		Actions action=new Actions(driver);//create the object of actions class
		
		action.dragAndDrop(dragarea, droparea).build().perform();// here we prform the drag and drop action 
		

	}

}
