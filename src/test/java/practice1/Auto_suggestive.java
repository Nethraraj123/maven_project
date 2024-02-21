package practice1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_suggestive {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
				
				Thread.sleep(10000);
				
				List<WebElement> suggetions = driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]"));
				System.out.println("number of suggetions: "+suggetions.size());
				
				Thread.sleep(2000);
				for (int i = 0; i < suggetions.size(); i++) {
					String suggetionText=suggetions.get(i).getText();
					
					//System.out.println(suggetionText);
					
					if (suggetionText.equals("selenium webdriver")) {//contains,equals.equalsignorecase
						
						suggetions.get(i).click();
						break;
						
						
					}
				}
				Thread.sleep(2000);
				driver.close();
			}
}

		


	


