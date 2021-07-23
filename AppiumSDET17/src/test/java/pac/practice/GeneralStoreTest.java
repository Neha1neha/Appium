package pac.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreTest {
	
	// Common DC (Android or IOS)
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", " j2 pro");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "6.0.1");
		dc.setCapability("UDID", "420008249b468400");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		// Appium Server Port No.
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("neha");
		
		MobileElement gender = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale"));
		driver.tap(1, gender, 100);
		
		MobileElement StartShopBtn = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
		driver.tap(1, StartShopBtn, 100);
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"]")).click();
		//driver.tap(1, StartShopBtn, 100);//MobileElement product = (MobileElement)
		
		MobileElement checkcart = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));
		driver.tap(1, checkcart, 100);
		
		

	}

}