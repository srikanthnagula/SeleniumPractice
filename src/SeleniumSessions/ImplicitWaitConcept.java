package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");

		
		//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		

	}

}
