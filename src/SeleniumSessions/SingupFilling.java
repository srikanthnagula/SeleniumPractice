package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingupFilling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://affiliate.flipkart.com/registerme");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputREmail")).sendKeys("Tom@gmail.com");;
		driver.findElement(By.name("inputREmailOtp")).sendKeys("345450");;
		Select select =new Select(driver.findElement(By.id("countryCode")));
		select.selectByVisibleText("Canada (+1)");
		driver.findElement(By.cssSelector("#contactNumber")).sendKeys("470613799");;
		driver.findElement(By.xpath("//*[@id=\"inputRMobileOtp\"]")).sendKeys("470613");;
		driver.findElement(By.id("inputRPassword")).sendKeys("TomName");;
		driver.findElement(By.id("inputRConfPassword")).sendKeys("TomName");;
		driver.findElement(By.id("newsletterCheckbox")).click();
		driver.findElement(By.id("tnc")).click();
		driver.findElement(By.id("submitRegister")).click();
		
		driver.close();

		

	}

}
