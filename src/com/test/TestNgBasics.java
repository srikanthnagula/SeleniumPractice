package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author sri
 *
 */
public class TestNgBasics {

//	@BeforeSuite
//	public void setup() {
//		System.out.println("Setup system property for chrome");
//	}
//	
//	
//	@BeforeClass
//	public void LaunchBrowser() {
//		System.out.println("Launch chrome Browser : ");
//	}
//	
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter your URL - ");
	}
	
//	@BeforeTest
//	public void login() {
//		System.out.println("Login - ");
//	}
	
	@Test
	public void GoogleTitletest() {
	System.out.println(" google title page");
	}
	
	@Test
	public void search() {
		System.out.println("Search in the app - ");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from the app - ");
	}
	
	
	
	
}
