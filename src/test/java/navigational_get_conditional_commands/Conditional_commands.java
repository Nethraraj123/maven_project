package navigational_get_conditional_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Conditional_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Conditional Commands can use return the boolean value
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    //Get the title of page
		driver.manage().window().maximize();
		System.out.println("Title===> " +driver.getTitle());
		Thread.sleep(5000);
		
		//To check whether the logo is diplayed or not we store it in the refrence varibale name logo as  WebElement type
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		//now we check its displayed or not by accessing refrence variable logo
		System.out.println("Display Status of Logo " +logo.isDisplayed());
		
		//Similarly isEnabled is used for to check inputbox/textbox,radiobutton,dropdown perform any opreation on element we can use 
		//is Selected is for radio button and dropdown

		//Enabled Status of username textbox if its not enabled then it will return false we can get better idea on searchbox
		WebElement enable=driver.findElement(By.xpath("//input[@name='username']"));
		System.out.println("Before===== " +enable.isEnabled());
		
		//Perform isSelected
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement female_button=driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		WebElement radio_button=driver.findElement(By.xpath("//input[@id='male']"));
		System.out.println("Before Clicking===");
		//It will show false in both
		System.out.println(female_button.isSelected());
		System.out.println(radio_button.isSelected());
		System.out.println("==========================================");
		
		radio_button.click();//Click operation performed on one option
		System.out.println(radio_button.isSelected());
		System.out.println(female_button.isSelected());
	}

}