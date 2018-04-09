package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void LoginTest() {
		System.out.println("Login Test =");
		int i =10/0;
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void Homepage() {
		System.out.println("Homepage Test =");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("Search Test =");
		}
	
	
	@Test
	public void RegistrationTest() {
		System.out.println("Registration Test =");
		}
}
