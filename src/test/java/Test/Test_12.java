package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_12 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement txt_custid=driver.findElement(By.xpath("//input[@name='cusid']"));
		txt_custid.sendKeys("123456789");
		
		WebElement btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
		btn_submit.click();
		
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();		
		System.out.println(text);        //Do you really want to delete this Customer?
		
        alt.dismiss();
		alt.accept();		
		
		Thread.sleep(3000);
		
		String text1=alt.getText();		
		System.out.println(text1);       //Customer Successfully Delete!

	}

}
