import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_BootStrap_dropdown_boxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
		Thread.sleep(3000);
		
		// drop down button click
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		Thread.sleep(3000);
	
	List<WebElement> list=driver.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));
	System.out.println(list.size());
	 
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		
		//click on perticular element
		if(list.get(i).getText().equals("Another action")) {
			list.get(i).click();
			break;
		}
	}
	
	}	
}
