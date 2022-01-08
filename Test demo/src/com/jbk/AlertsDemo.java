package com.jbk;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {

		
        System.setProperty("webdriver.chrome.driver","F:\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		//simple alert
	/*	driver.findElement(By.id("alertBox")).click();
		
		Alert simpleAlert=driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		//Thread.sleep(2000);
		
		simpleAlert.accept();
		Thread.sleep(2000);
		
		
*/
		
	
		
		//confirmation  alert
/*		driver.findElement(By.id("confirmBox")).click();
		
		Alert confirmAlert=driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		//Thread.sleep(2000);
		
		confirmAlert.dismiss();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(2000);
		
		*/
		
		
		

		//prompt  alert
		driver.findElement(By.id("promptBox")).click();
		
		Alert promptAlert=driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		//Thread.sleep(2000);
		promptAlert.sendKeys("Ready");
		promptAlert.accept();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(2000);
		driver.close();
		
	}
}
