package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver2 =new ChromeDriver();
		driver2.get("https://affiliate.flipkart.com/registerme");
		//Handling Dropdown list
		Select select = new Select(driver2.findElement(By.id("countryCode")));
		select.selectByVisibleText("India (+91)");
		
		
		
	}

}
