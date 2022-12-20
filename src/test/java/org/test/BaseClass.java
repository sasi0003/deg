package org.test;
import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Timeout;

public class BaseClass 
{
	public  static WebDriver driver;
	 public static void ChromeBrowser() {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 return;
		 

	}
	
	
	public static WebDriver launchBrowser(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 
		}
		
		else if(bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(bname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		return driver;

}
     public static void urlLaunch(String url) {
	driver.get(url);
	driver.manage().window().maximize();
    
}	
	public static void implicityWait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
		

	}
	public static void Sendkeys(WebElement d,String value) {
		d.sendKeys(value);
	}
	public static void click(WebElement d) {
		d.click();
	}
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
   
	}
	public static String  getTitle() {
		String title = driver.getTitle();
		return title;

	}
	public static void quit() {
		driver.quit();

	}
    public static String getText(WebElement d) {
    	String text = d.getText();
		return text;
		
	}  
	public static String getAttribute(WebElement d,String s) {
		String attribute = d.getAttribute("value");
		return attribute;

	}
	public static void movetoElement(WebElement d) {
		Actions a=new Actions(driver);
		a.moveToElement(d).perform();
		

	}
	public static void dragandDrop(WebElement d,WebElement tar) {
		Actions a =new Actions(driver);
		a.dragAndDrop(d, tar).perform();
		

	}
	public static void Aclick(WebElement d) {
         Actions a =new Actions(driver);
         a.click(d).perform();
	} 
	public static void selectByIndex(WebElement d ,int a) {
       Select s=new Select(d);
       s.selectByIndex(a);
	}
	public static void SelectByValue(WebElement d,String c) {
      Select s=new Select(d);  
      s.selectByValue(c);
	}
	public static void deSelectByIndex(WebElement d,int a) {
      Select s =new Select(d);
      s.deselectByIndex(a);
      
	}
	public static void close() {
     driver.close();
	}
	public static void screenshot(String filename) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File f=new File("");
		FileUtils.copyFile(src, f);
		

	}
	
	public static void windowsHandling(String search) {
     driver.switchTo().window(search);
     
	}
	public static void switchtoFrame(WebElement index) {
      driver.switchTo().frame(index);
      
	}
		public static void getWindows() {
        driver.getWindowHandle();
		}		
		public static void defaultContent() {
        driver.switchTo().defaultContent();
		}
		public static void frameParent() {
        driver.switchTo().parentFrame();
        
		}
        public static  Set<String> allWindow() {
        Set<String> allid = driver.getWindowHandles();
		return allid;
		}
        //current window
        public static  void currentWindow() {
        String parentid = driver.getWindowHandle();
        Set<String> allid = driver.getWindowHandles();
        for(String eachid:allid) {
        	if(!parentid.equals(eachid)) {
        		driver.switchTo().window(eachid);
        	}
        }
		}
        public static  String Filecopy(String filename, String sheet,int r1,int c1) throws IOException {
           	File f =new File("C:\\Maven\\Excel\\"+filename+".xlsx");
           	FileInputStream st=new FileInputStream(f);
            Workbook wb=new XSSFWorkbook(st);
            Sheet s = wb.getSheet(sheet);
            Row r = s.getRow(r1);
            Cell c = r.getCell(c1);
            
            int ct = c.getCellType();
            String value=null;
            if(ct==1) {
               value = c.getStringCellValue();
            }
            else {
            	if(DateUtil.isCellDateFormatted(c)) {
            		Date date = c.getDateCellValue();
            		SimpleDateFormat sm=new SimpleDateFormat();
            		 value = sm.format(date);
            	}
            	else {
            		double num = c.getNumericCellValue();
            		long num1=(long)num;
            	     value = String.valueOf(num1);
            	}

            }
			return value;}}

	
	
	

	
