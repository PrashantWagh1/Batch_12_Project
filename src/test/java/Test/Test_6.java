package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_6 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
		// Identify
		WebElement drp_Country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select sel=new Select(drp_Country);
		
		System.out.println(sel.getFirstSelectedOption().getText());
		// SelectBy Index
		sel.selectByIndex(8);
		
		Thread.sleep(5000);
		// SelectByValue
		sel.selectByValue("BANGLADESH");
		Thread.sleep(5000);
		
		//SelectByVisibleText
		sel.selectByVisibleText("BRAZIL");
		

		List<WebElement> list=sel.getOptions();
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			
			String text=list.get(i).getText();
			System.out.println(text);
			
			if(text.equals("BANGLADESH"))  {
				
				sel.selectByVisibleText("BANGLADESH");
				break;
			}
		}
		
		
		
		
	}

}
