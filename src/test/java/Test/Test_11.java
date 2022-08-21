package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_11 {

	public static void main(String[] args) throws Exception {
		
		// Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Identify the WebElement
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		
		// txt_email.sendKeys("Test");

	String path="C:\\Users\\Dell\\eclipse-workspace\\Batch_12_Project\\TestData\\Data.xlsx";
	FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();  // 0,0-->Test
	System.out.println(data_1);                                                       
	
	String data_2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();  // 0,1-->
	System.out.println(data_2);
	
	String data_3=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
	System.out.println(data_3);
	
    // Sending Test Data from Excel to WebElement
	txt_email.sendKeys(data_1);
	txt_password.sendKeys(data_2);
	
	double data_4=wb.getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue(); // 0,3-->1234567
	System.out.println(data_4);  // 1234567.0
	
	String data_4_S=String.valueOf(data_4);
	String data=data_4_S.replace(".0", "");
	System.out.println(data);
	
	txt_password.sendKeys(data);
	
	
	
	
	
	}

}
