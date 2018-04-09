package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");

		// Get the total count of links in the page 
		// Get the text of each link on the page 
		//All the Links are represented by "a"
		List <WebElement> a = driver.findElements(By.tagName("a"));
		//get the size of linkedlist
		System.out.println(a.size());
		
		for(int i=0;i<a.size();i++) {
			String linlist= a.get(i).getText();
			System.out.println(linlist);
		}
	}

}
