package com.appium.main;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		// capability.setCapability(MobileCapabilityType.APP,
		// "C:\\APK\\Amazon_App.apk");
		capability.setCapability("appPackage", "com.oneplus.calculator");
		capability.setCapability("appActivity", "com.oneplus.calculator.Calculator");

		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, capability);

		WebElement num1 = driver.findElement(By.id("com.oneplus.calculator:id/digit_7"));
		WebElement num2 = driver.findElement(By.id("com.oneplus.calculator:id/digit_1"));

		WebElement plus = driver.findElement(By.id("com.oneplus.calculator:id/op_add"));

		WebElement equals = driver.findElement(By.id("com.oneplus.calculator:id/eq"));

		WebElement Results = driver.findElement(By.id("com.oneplus.calculator:id/result"));

		// To click first element
		num1.click();

		// To click +

		plus.click();

		// To click seacond element
		num2.click();

		// To click qual
		equals.click();

		// driver.quit();

		// To get result
		System.out.println(Results.getText());
	}

}
