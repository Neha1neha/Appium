package pac.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ApiDemo2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Samsung j2 pro");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "6.0.1");
		dc.setCapability("UDID", "420008249b468400");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		Thread.sleep(1000);
		MobileElement button = (MobileElement) driver.findElement(By.id("android:id/button1"));
		Thread.sleep(1000);
		
		 List<WebElement> options = driver.findElements(By.className("android.widget.TextView"));
		 for(int i=1; i<options.size(); i++)
		 {
			 System.out.println(options.get(i).getText());
		 }
		
		
		
		
		
	}

}