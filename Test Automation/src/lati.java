import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class lati {

@Test
public void main() throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://lms.latitudelearning.com");

//email
  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlLogin_sID']")).sendKeys("MINDS");
  //passwrd
  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlLogin_sPassword']")).sendKeys("Minds123");
  //button
  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlLogin_cmdLogin']")).click();
  Thread.sleep(4000);
  driver.findElement(By.xpath("//a[@title='Administration']")).click();
  Thread.sleep(5000);
  
  //Users
  driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection18_SectionHeader']")).click();
  Thread.sleep(3000);
  //Add User
  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/span[2]/div[34]/div[2]/a[1]")).click();
  Thread.sleep(3000);
  
  //Username
  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_fsGeneralInfo_ctlUserGeneralInfo_txtUserName']")).sendKeys("0022");
  Thread.sleep(3000);
  //Firstname
  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_fsGeneralInfo_ctlUserGeneralInfo_txtFirstName']")).sendKeys("Md");
  Thread.sleep(3000);
  //lastname
  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/fieldset[1]/div[1]/dl[3]/dd[1]/input[1]")).sendKeys("Asif");
  Thread.sleep(3000);
  //email
  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_fsGeneralInfo_ctlUserGeneralInfo_txtEmail']")).sendKeys("Uzdodo@gmail.com");
  Thread.sleep(3000);
  //password
  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_fsGeneralInfo_ctlUserPassword_txtPassword']")).sendKeys("Minds123");
  Thread.sleep(3000);
  //confirm password
  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_fsGeneralInfo_ctlUserPassword_txtPasswordConfirm']")).sendKeys("Minds123");
 
  
  JavascriptExecutor js1=(JavascriptExecutor)driver;
  js1.executeScript("window.scrollBy(200,500)");
  System.out.println("scrolled Down");
  Thread.sleep(5000);
  
  //Additional info
  //driver.findElement(By.xpath("//img[@id='ctlTemplate_regMainBody_pnlUserAdditionalInfo_plusMinusImage']")).click();
  
  
  //Add User
  driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_btnSubmit']")).click();
  

}





}
