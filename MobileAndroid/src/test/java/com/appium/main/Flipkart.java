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
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class Flipkart {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		// capability.setCapability(MobileCapabilityType.APP,
		// "C:\\APK\\Amazon_App.apk");
		capability.setCapability("appPackage", "com.flipkart.android");
		capability.setCapability("appActivity", "com.flipkart.android.SplashActivity");

		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, capability);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> elms = driver.findElements(By.id("com.flipkart.android:id/iv_checkbox"));
		System.out.println(elms.size());
		elms.get(3).click();

		/*
		 * WebElement EnglishRadioBtn = driver.findElement(By.xpath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.ImageView[1]"
		 * )); EnglishRadioBtn.click();
		 */

		Thread.sleep(Duration.ofSeconds(2));
		WebElement seletBtn = driver.findElement(By.id("com.flipkart.android:id/select_btn"));
		seletBtn.click();

		/*
		 * WebElement Englis =
		 * driver.findElement(By.xpath("//*[contains(text(),'English')]")); WebElement
		 * selectBtn = driver.findElement(By.id("com.flipkart.android:id/select_btn"));
		 * Englis.click(); Thread.sleep(Duration.ofSeconds(2)); selectBtn.click();
		 * 
		 * WebElement frames =
		 * driver.findElement(By.id("com.google.android.gms:id/credential_picker_layout"
		 * )); driver.switchTo().frame(frames);
		 * 
		 * WebElement value =
		 * driver.findElement(By.xpath("//*[contains(text(),'Sign up with')]"));
		 * 
		 * String data = value.toString(); System.out.println(data);
		 * 
		 * WebElement src = null; WebElement Destination = null;
		 * 
		 * driver.findElements(By.id("")).get(1);
		 * 
		 * 
		 * 
		 * TouchAction action = new TouchAction(driver);
		 * action.longPress(ElementOption.element(src)).moveTo(ElementOption.element(
		 * Destination)).release().perform();
		 */
		/*
		 * WebElement searchBar =
		 * driver.findElement(By.className("android.widget.TextView"));
		 * searchBar.sendKeys("Phone");
		 * 
		 * List<WebElement> AutoSuggesions =
		 * driver.findElements(By.className("android.view.ViewGroup")); if
		 * (AutoSuggesions.size() > 0) { for (WebElement elm : AutoSuggesions) {
		 * elm.click(); break; } }
		 * 
		 * List<WebElement> Items =
		 * driver.findElements(By.className("android.widget.TextView")); if
		 * (AutoSuggesions.size() > 0) { for (WebElement elm : Items) { elm.click();
		 * break; } }
		 * 
		 * WebElement buyNow =
		 * driver.findElement(By.xpath("//*[contains(text(),'Buy Now')]"));
		 * buyNow.click();
		 * 
		 * String str =
		 * driver.findElement(By.id("com.flipkart.android:id/title_action_bar")).getText
		 * (); System.out.println(str);
		 */

	}

}
