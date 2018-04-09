package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver2 =new ChromeDriver();
		driver2.get("https://affiliate.flipkart.com/registerme");
		System.out.println(driver2.getTitle());
		
		//1. XPATH
//		driver2.findElement(By.xpath("//*[@id=\"inputREmail\"]")).sendKeys("Tom@gmail.com");
//		driver2.findElement(By.xpath("//*[@id=\"inputREmailOtp\"]")).sendKeys("32144");
//		//2. ID
//		driver2.findElement(By.id("contactNumber")).sendKeys("470613799");
//		driver2.findElement(By.id("inputRMobileOtp")).sendKeys("45355");
		//3. Name
		driver2.findElement(By.name("inputRMobileOtp")).sendKeys("32434");
		
//		driver2.manage().window().maximize();
//		//4. LinkText - Only for Links 
//		driver2.findElement(By.linkText("here ")).click();
//		
//		//5. PartialLinkText
//		driver2.findElement(By.partialLinkText("term"));
//		
//		//6.cssSelector  - If ID is available use "#ID"  , If class is available use ".classname"
		
		driver2.findElement(By.cssSelector("#emailOtpButton")).click();;
		
		
	}

}
