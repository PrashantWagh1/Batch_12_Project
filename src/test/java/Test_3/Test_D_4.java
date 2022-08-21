package Test_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_D_4 {
	
	@Test
	public void verify_001() throws Exception  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Scroll By Pixel
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-500)", "");
		
		
		Thread.sleep(5000);
		//Scroll By Element
		WebElement english=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		js.executeAsyncScript("arguments[0].scrollIntoView()", english);
		
		custom_ScrollByElement(driver, english);
		
	
	}
	public static void custom_ScrollByElement(WebDriver driver,WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].scrollIntoView()", element);
		
	}
	

}
