package Example;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumExample {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {

		try {
			startApp();
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void startApp() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "shravani");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.neokred.corporate");
		cap.setCapability("appActivity", "com.neokred.corporate.MainActivity");
		cap.setCapability("automationName", "UiAutomator1");
		cap.setCapability("autoGrantPermissions", "true");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url, cap);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		System.out.println("App Started");

		MobileElement next1 = driver.findElement(By.xpath("//android.widget.TextView[@text='Next']"));
		next1.click();
		System.out.println("clicked successful--1");

		MobileElement next2 = driver.findElement(By.xpath("//android.widget.TextView[@text='Next']"));
		next2.click();
		System.out.println("clicked successful--2");

		MobileElement next3 = driver.findElement(By.xpath("//android.widget.TextView[@text='Next']"));
		next3.click();
		System.out.println("clicked successful--3");

		MobileElement tick = driver.findElement(By.xpath("//android.view.ViewGroup[@index='4']"));
		tick.click();
		System.out.println("clicked successful--4");

		MobileElement corp_id = driver.findElement(By.xpath("//android.widget.EditText[@text='Corporate ID']"));
		corp_id.sendKeys("NKBNKXCORPORATE");
		System.out.println("DATA ENTERED SUCCESSFULLY");

		MobileElement get_started = driver.findElement(By.xpath("//android.widget.TextView[@text='Get Started']"));
		get_started.click();
		System.out.println("Redirected to sign-in page");

		MobileElement mobile_no = driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile Number']"));
		mobile_no.sendKeys("9632065320");
		System.out.println("Mobile number entered successfully");

		MobileElement mpin = driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
		mpin.sendKeys("1111");
		System.out.println("MPIN entered successfully");

		MobileElement just_tap = driver.findElement(By.className("android.view.ViewGroup"));
		just_tap.click();
		System.out.println(" simple tap");

		MobileElement sign_in = driver.findElement(By.xpath("//android.widget.TextView[@text='Sign In']"));
		sign_in.click();
		System.out.println(" redirected to homepage");

		MobileElement wallet = driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[98,725][173,800]']"));
		wallet.click();
		System.out.println("wallet-to-wallet Transfer");

		MobileElement amount = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Amount']"));
		amount.sendKeys("1");
		System.out.println("amount entered successfully");

		MobileElement mobile = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Mobile Number']"));
		mobile.sendKeys("9790");
		System.out.println("Mobile number entered successfully");

		MobileElement tap1 = driver.findElement(By.className("android.view.ViewGroup"));
		tap1.click();
		System.out.println("simple tap");

		driver.navigate().back();

		MobileElement beneficiary = driver
				.findElement(By.xpath("//android.view.ViewGroup[@bounds='[54,545][486,620]']"));
		beneficiary.click();
		System.out.println("Beneficiary selected successfully");

		MobileElement beneficiary1 = driver
				.findElement(By.xpath("//android.view.ViewGroup[@bounds='[54,545][486,620]']"));
		beneficiary1.click();
		System.out.println("Beneficiary selected successfully");

		/*
		 * MobileElement pay =
		 * driver.findElement(By.xpath("//android.widget.TextView[@text='Pay']"));
		 * pay.click(); System.out.println("Transaction is successful");
		 * 
		 * MobileElement done = driver
		 * .findElement(By.xpath("//android.widget.TextView[@text='Done"));
		 * beneficiary1.click();
		 * System.out.println("Beneficiary selected successfully");
		 */

		driver.navigate().back();

		MobileElement bank = driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[233,725][308,800]']"));
		bank.click();
		System.out.println("wallet-to-Bank Transfer");

		driver.navigate().back();

		MobileElement dmt = driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[368,725][443,800]']"));
		dmt.click();
		System.out.println("wallet-to-Bank Transfer");
		
		driver.navigate().back();

		MobileElement transaction = driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[311,511][386,586]']"));
		transaction.click();
		System.out.println("transaction histroy");
		
		driver.navigate().back();

		MobileElement add_money = driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[152,511][227,586]']"));
		add_money.click();
		System.out.println("transaction histroy");
		
		driver.navigate().back();
		MobileElement back = driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[22,61][58,97]']"));
		back.click();
		System.out.println("go back");
		
		driver.navigate().back();
		MobileElement view_wallet_info = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[387,200][425,242]']"));
		view_wallet_info.click();
		System.out.println("view_wallet_info");
		
		
		

	}
}
