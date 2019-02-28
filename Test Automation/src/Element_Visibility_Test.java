import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Visibility_Test {

	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
       
       
       WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
       driver.get("https://classic.crmpro.com/register/");

	//1 isDisplayed() method :applicable for all elements
       boolean b1 =driver.findElement(By.xpath("//div[@class='myButton']")).isDisplayed();
	   System.out.println(b1);//true
	
	
	//2. isEnabled() method
	 boolean b2 =driver.findElement(By.id("submitButton")).isEnabled();
	   System.out.println(b2);//false
	
	   
	   //select I agree checkbox
	   
	   driver.findElement(By.name("agreeTerms")).click();//submit button is enabled
	   
	   boolean b3 =driver.findElement(By.xpath("//div[@class='myButton']")).isDisplayed();
	   System.out.println(b3);//true
	
	   //3. isSelected() method:only applicable for checkbox,dropdown,radiobutton
	   
	  boolean b4= driver.findElement(By.name("agreeTerms")).isSelected();
	  System.out.println(b4);//true
	  
	  //de-select the Checkbox
	  
	  driver.findElement(By.name("agreeTerms")).click();
	  boolean b5= driver.findElement(By.name("agreeTerms")).isSelected();
	  System.out.println(b5);//false
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}
	
}
