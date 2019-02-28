import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropBoxHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		Thread.sleep(3000);
		
		List<WebElement> list =driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		
		System.out.println(list.size());
		
		//to select all options/checkboxes from drop down 
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			// to select angular option from drop down
			//if(list.get(i).getText().contains("Angular")) {
				list.get(i).click();
				
			}
	
		}
	
}


