package com.appium.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class Amazon {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		// capability.setCapability(MobileCapabilityType.APP,
		// "C:\\APK\\Amazon_App.apk");
		capability.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		capability.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");

		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, capability);
		
		TouchAction action = new TouchAction(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("com.amazon.mShop.android.shopping:id/sso_continue")).click();

		driver.findElement(By.id("com.amazon.mShop.android.shopping:id/chrome_search_hint_view")).sendKeys("Paper");

		driver.findElement(By.xpath("//android.widget.Button[@text='paper towels']")).click();
	
	
		
	}

}
