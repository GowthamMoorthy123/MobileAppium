package com.appium.main;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppuimAndroid2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		capability.setCapability(MobileCapabilityType.APP, "C:\\APK\\Amazon_App.apk");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, capability);
		
		driver.quit();
	}

}
