package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {


		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\sri\\eclipse-workspace\\SeleniumPractice\\src\\SeleniumSessions\\config.properties");
		prop.load(ip);
		
		System.out.println(prop.get("name"));// name is the Keyname defined in properties file
		
		String url =prop.getProperty("URL");
		System.out.println(url);
		String BrowserName =prop.getProperty("browser");
		System.out.println(BrowserName);
		
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get(url);
			
		}else if(BrowserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			driver.get(url);
			
		}else if(BrowserName.equals("IE")) {
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\IEDriverServer.exe");
			WebDriver driver =new InternetExplorerDriver();
			driver.get(url);
		}
	}
		

}
