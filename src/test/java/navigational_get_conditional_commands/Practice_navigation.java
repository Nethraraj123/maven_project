package navigational_get_conditional_commands;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//Navigates to this url-->
		//URL obj=new URL("https://demo.opencart.com/");//But most time we use String type URL enclosed in String literals
		//driver.get(obj);//here get method cannot use URL type object it accepts only String URL
		
		
		driver.navigate().to("https://demo.opencart.com/");//On other hand navigate().to() allows URL type object and String form URL 
		driver.manage().window().maximize();

		//navigate()=An abstraction allowing the driver to access the browser's history and to navigate to a givenURL.
		System.out.println("Get Current URL======> " + driver.getCurrentUrl()); //Get a string representing the current URL that the browser is looking at.
		System.out.println("ID====> " +driver.getWindowHandle()); 
		
		Thread.sleep(3500);
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");  //Redirects to new url within the same tab
		System.out.println("New page url====> " + driver.getCurrentUrl());
		
		driver.navigate().back();//To redirect to first website opencart
		System.out.println("Current URL after back action======> " + driver.getCurrentUrl()); //Get a string representing the current URL that the browser is looking at.
		
		Thread.sleep(4000);
		driver.navigate().forward();//To redirect to frame.html
		System.out.println("URL After Forward button click===> " +driver.getCurrentUrl());
		System.out.println("title of the webpage==> " +driver.getTitle());
		
		Thread.sleep(4000);
		driver.navigate().refresh();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		
	

		

	}

}