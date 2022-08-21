package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_10 {   // screenshot

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		
		txt_email.sendKeys("Test@gmail.com");
		txt_password.sendKeys("12345678");
		btn_login.click();
		
		String path="C:\\Users\\Dell\\eclipse-workspace\\Batch_12_Project\\Sreenshot";
		
		String rm=RandomString.make(3);   // pqr ,vlc
		
	    TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\+rm+.png");
		FileUtils.copyFile(src, destn);
		
		//Date--->simple date format
		
		
		
		
		
		
		
		
		
		
		

	}

}
