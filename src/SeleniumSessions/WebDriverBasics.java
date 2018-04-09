package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//Firefox browser
		//Gecko driver
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();  // Launches Firefox
//		driver.get("http://google.com");  // Enter google.com on browser
//		driver.quit();
//		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver2 =new ChromeDriver();
		driver2.get("http://google.com");
		System.out.println(driver2.getTitle());
		
		if(driver2.getTitle().equals("Google")) {
			System.out.println("Title Name displayed correctly");
		}else {
			System.out.println("Incorrect title name isdisplayed as" + driver2.getTitle() );
		}
		
		System.out.println(driver2.getCurrentUrl());
		//System.out.println(driver2.getPageSource());
		driver2.quit();
		
		
		
//		System.setProperty("webdriver.IE.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\IEdriverserver.exe");
//		WebDriver driver3 =new IEDriver();
//		driver3.get("http://google.com");
//		driver3.quit();
//		
	}

}
