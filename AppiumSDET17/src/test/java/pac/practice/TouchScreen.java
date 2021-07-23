package pac.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TouchScreen {

	public static void main(String[] args) throws MalformedURLException {
		dc.setCapability("deviceName", "Samsung j2 pro");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "6.0.1");
		dc.setCapability("UDID", "420008249b468400");
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

}