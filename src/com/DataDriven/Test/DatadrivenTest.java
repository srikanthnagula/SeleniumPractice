package com.DataDriven.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excel.utility.Xls_Reader;

public class DatadrivenTest {

	public static void main(String[] args) {

		Xls_Reader reader = new Xls_Reader("C:\\Users\\sri\\eclipse-workspace\\SeleniumPractice\\src\\com\\testdata\\FreeCRM_TestData.xlsx");
		String firstname =reader.getCellData("Sheet1", "firstname",2);
		System.out.println(firstname);
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\Desktop\\Automation\\Selenium\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		driver.get("https://www.freecrm.com/register/");
		
		
	}

}
