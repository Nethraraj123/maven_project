package navigational_get_conditional_commands;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_new_window_and_tab {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		System.out.println("title of the page: "+driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.facebook.com/");
		System.out.println("title of the page: "+driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://demo.automationtesting.in/Frames.html");
		
		Set<String> handles=driver.getWindowHandles();//unique perpose
		
		List<String> list=new ArrayList<String>(handles);//maintain the insertion order
		
		String parentWindowId=list.get(0);
		String childWindowId=list.get(1);
		
		System.out.println(parentWindowId +" and " +childWindowId);
		
		String t=driver.getCurrentUrl();
		System.out.println("current Url"+t);
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("current page url: " +driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
