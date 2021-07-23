package pac.practice;


		import java.net.MalformedURLException;
		import java.net.URL;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.remote.DesiredCapabilities;

		import io.appium.java_client.MobileElement;
		import io.appium.java_client.android.AndroidDriver;
		import io.appium.java_client.android.AndroidElement;

		public class CalculatorTap {

			public static void main(String[] args) throws MalformedURLException, InterruptedException {
				DesiredCapabilities dc=new DesiredCapabilities();
				dc.setCapability("deviceName", "Samsung j2 pro");
				dc.setCapability("automationName", "appium");
				dc.setCapability("platformName", "Android");
				dc.setCapability("platformVersion", "6.0.1");
				dc.setCapability("UDID", "420008249b468400");
				dc.setCapability("appPackage", "com.sec.android.app.popupcalculator");
				dc.setCapability("appActivity", ".Calculator");
				
				URL url=new URL("http://localhost:4723/wd/hub");
				
				AndroidDriver driver=new AndroidDriver(url,dc);
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				 MobileElement button = (MobileElement) driver.findElement(By.id("android:id/button1"));
				 driver.tap(1, button, 500);
				
				 MobileElement eight = (MobileElement) driver.findElement(By.id("com.sec.android.app.popupcalculator:id/btn_8_s"));
				 driver.tap(1, eight, 500);
				Thread.sleep(1000);
				
				AndroidElement multiply=(AndroidElement) driver.findElementByAccessibilityId("multiply");
				driver.tap(1, multiply, 500);
				 Thread.sleep(1000);
				 
				 MobileElement five=(MobileElement) driver.findElement(By.id("com.sec.android.app.popupcalculator:id/btn_5_s"));
				 driver.tap(1, five, 500);
				 Thread.sleep(1000);
				 
				 MobileElement equals=(MobileElement) driver.findElementByAccessibilityId("equals");
				 driver.tap(1, equals, 500);
				 Thread.sleep(1000);
				 
				
				String result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/result")).getText();
				 Thread.sleep(1000);
				 
				System.out.println(result);
				
				
				
				
				

			}

		}
	}

}
