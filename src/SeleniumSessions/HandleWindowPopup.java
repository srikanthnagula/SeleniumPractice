package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.SingleSelectionModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		
		Set <String> handler = driver.getWindowHandles();
		Iterator<String> it= handler.iterator();
		
		String ParentWindowID = it.next();
		System.out.println("Parent Window ID is - " + ParentWindowID);
		String ChildWindowID = it.next();
		System.out.println("Child Window ID is - " + ChildWindowID);
		
		driver.switchTo().window(ChildWindowID);
		System.out.println("Child Window Popup Title " + driver.getTitle());
		driver.close();// if you use driver.quit  - it will close all windows
		
		driver.switchTo().window(ParentWindowID);
		System.out.println("Parent Window Title " + driver.getTitle());
	}

}
