import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScript_Executor {

public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("priya1");					
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Minds123");			
        WebElement sendIssue =(WebElement)new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/form[1]/div[1]/div[1]/input[1]")));
	//WebElement loginBtn=driver.findElement(By.xpath("//input[@value='Login']"));
        sendIssue.click();
	flash(sendIssue,driver); //highlight the element
	
	drawBroder(sendIssue,driver); //draw broder
	
	//Take screenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
	File file=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("E:\\screenb.png"));
	System.out.println("Saved the screenshot");
	

	
	//generate alert

 generateAlert(driver,"There is an issue with login button on login page");
 
 
 //click on any element by using JS executor
 clickElementJS(sendIssue,driver);
 
 //to refresh the page using selenium 
 driver.navigate().refresh();
 //refresh using JS executor
 refreshBrowserByJS(driver);
 
}
	public static void flash(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor=element.getCssValue("backgroundColor");
		
		for(int i=0;i<10;i++) {
			ChangeColor("rgb()0,200,0)",element,driver);
			ChangeColor(bgcolor,element,driver);
			
		}
		
	}
	
	public static void ChangeColor(String color,WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.backgroundColor='"+color+"'", element);
		
		try {
			Thread.sleep(20);
		}
		catch(InterruptedException e) {
			
		}
		
	}
	
	
	
	public static void drawBroder(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.broder='3px solid red'", element);
		
	
	}
	
	public static void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	
	public static void clickElementJS(WebElement element,WebDriver driver ) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("argument[0].click();",element);
	}
	
	
	public static void refreshBrowserByJS(WebDriver driver ) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		}
	
} 




