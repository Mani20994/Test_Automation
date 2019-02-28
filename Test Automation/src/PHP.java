import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class PHP {
public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.phptravels.net/admin");
 
 //admin back-end

 //email
 driver.findElement(By.xpath("html/body/div/form[1]/div[1]/input[1]")).sendKeys("admin@phptravels.com");
 //passwrd
 driver.findElement(By.xpath("html/body/div/form[1]/div[1]/input[2]")).sendKeys("demoadmin");
   //button
 driver.findElement(By.xpath("html/body/div/form[1]/button")).click();
 //hotels
 Thread.sleep(3000);
 driver.findElement(By.xpath("//*[@id='social-sidebar-menu']/li[7]/a")).click();
 Thread.sleep(3000);
 //hotels -sub
 driver.findElement(By.xpath("html/body/div[2]/aside/div/div[6]/div/ul/li[7]/ul/li[1]/a")).click();
 //add
 driver.findElement(By.xpath("html/body/div[2]/div/div/div/form/button")).click();
 //name
 driver.findElement(By.xpath(".//*[@id='GENERAL']/div[3]/div/input")).sendKeys("Venkatagiri");
 
 Thread.sleep(10000);
 //click from date
 driver.findElement(By.xpath("html/body/div[2]/div/div/form/div/div[1]/div/div[1]/div[7]/div[2]/input")).click();
 //date
 driver.findElement(By.xpath("html/body/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
 //to date
 driver.findElement(By.xpath("html/body/div[2]/div/div/form/div/div[1]/div/div[1]/div[7]/div[3]/input")).click();
 //date
 driver.findElement(By.xpath("html/body/div[4]/div[1]/table/tbody/tr[3]/td[5]")).click();
 //rated hotel
 //driver.findElement(By.xpath("html/body/div[2]/div/div/form/div/div[1]/div/div[1]/div[11]/div/div/ul")).click();
 //hotel
 //driver.findElement(By.xpath("html/body/div[2]/div/div/form/div/div[1]/div/div[1]/div[7]/div[1]/select")).click();
 
 Thread.sleep(10000);
 //location
 driver.findElement(By.xpath("html/body/div[2]/div/div/form/div/div[1]/div/div[1]/div[12]/div[2]/div[1]/table/tbody/tr[1]/td[2]/input")).sendKeys("Venkatagiri");
 //logout
 driver.findElement(By.xpath("html/body/div[2]/div/div/form/div/div[2]/button")).click();
 //driver.close();
 
 
 
 
 
 
 
 
 
}
}
