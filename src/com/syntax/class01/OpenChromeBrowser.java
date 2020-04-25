package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

public static void main (String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://www.facebook.com/";
	
	if(actualUrl.equalsIgnoreCase(expectedUrl)) {
		String title=driver.getTitle();
		System.out.println(title);
	}else {
		System.out.println("Wrong Url is returned");
	}
}
		
	
}
