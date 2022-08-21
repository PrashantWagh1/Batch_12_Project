package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {

	public static void main(String[] args) throws Exception {

		
		// Browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");  //url
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);  // facebook log in or sign up
		
		String url=driver.getCurrentUrl();  // https://www.facebook.com/
		System.out.println(url);
		
		driver.navigate().to("https://mvnrepository.com/");
		Thread.sleep(5000);  // 5 sec
		driver.navigate().back();
		Thread.sleep(5000);  // 5 sec
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
		
		// what is difference between get and navigate method
		
		
		
	}

}
