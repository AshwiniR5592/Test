package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		

		
		
		System.setProperty("webdriver.chrome.driver","F:\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        
		Thread.sleep(2000);
	
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.close();
		System.out.println("Successful");

	}

}
