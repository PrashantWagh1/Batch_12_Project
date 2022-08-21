package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_7 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//WebElement drp_selenium= driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		
	    // WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions act=new Actions(driver);
		
		//act.moveToElement(gmail).build().perform();
		
		//act.moveToElement(drp_selenium).click(drp_selenium).build().perform();
		
		//WebElement Rightclick= driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		//act.contextClick(Rightclick_ele).build().perform();
		
		WebElement Double_ele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(Double_ele).build().perform();
		
		driver.close();
				
				
		
		

	}

}
