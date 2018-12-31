package com.auto.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\geckdriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	String baseUrl ="http://hmt-qa-test.s3-website.ap-south-1.amazonaws.com/";
	 driver.get(baseUrl);  
	 
	 WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name *']"));
	 firstName.sendKeys("abcdef"); 
	 WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name *']"));
	 lastName.sendKeys("cde"); 
	 WebElement guardiansName = driver.findElement(By.xpath("//input[@placeholder='Gardians Name *']"));
	 guardiansName.sendKeys("xyz"); 
	 WebElement guardianContact = driver.findElement(By.xpath("//input[@placeholder='Gardians Contact*']"));
	 guardianContact.sendKeys("0712345678"); 
	 WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your Email *']"));
	 email.sendKeys("abc@gmail.com"); 
	 WebElement phone = driver.findElement(By.xpath(" //input[@placeholder='Your Phone *']"));
	 phone.sendKeys("0713456783"); 
	 Select gender = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
	 gender.selectByVisibleText("Male"); 
	 WebElement address = driver.findElement(By.xpath("//input[@placeholder='Enter Your Address *']"));
	 address.sendKeys("23,mahavila,colombo"); 
	 WebElement register = driver.findElement(By.xpath("//input[@value='Register']"));
	 register.click();
	 
	// driver.close();
}
}
