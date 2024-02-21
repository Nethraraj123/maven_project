package navigational_get_conditional_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindow_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    //Get the title of page
		driver.manage().window().maximize();
		System.out.println("Title===> " +driver.getTitle());
		Thread.sleep(5000);
		//Redirect to new tab
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//Now Retrive the Window IDs of both the tab by using get.WindowHandles();
		//This window id browser creates dynamically.
		Set<String>window_id=driver.getWindowHandles();
		
		//To display ids we use loop to print the dynamic ids of multiple windows
		//Now if we want to get title/capture the title of second tab which not possible directly cause driver instance is still focusing on parent window or first window
		//To shift the focus to current open tab which is on line no 21 use switch command
		System.out.println("Titles of the both pages===========================>");
		for(String id:window_id) {
			System.out.println("Window ID for both tabs ===> " +id);
			//1st approch
//			driver.switchTo().window(id);
//			System.out.println(driver.getTitle());
//			
			//2nd approch
			System.out.println(driver.switchTo().window(id).getTitle());
		}
		
		
	}

}