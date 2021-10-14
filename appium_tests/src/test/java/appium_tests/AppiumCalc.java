package appium_tests;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumCalc {

	WebDriver browser;
	static AppiumDriver<MobileElement> driver;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openCalculator();
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	public static void openCalculator() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Android_SDK");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		
		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement> (url, cap);
		
		System.out.println("Application Started....");
		
		MobileElement two = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
		two.click();
		
		MobileElement multiply = driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
		multiply.click();
		
		
		
	}

}
