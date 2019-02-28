import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class latitudeLearning {
	
	
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();

      driver.manage().window().maximize();
       driver.get("https://lms.latitudelearning.com");

        driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlLogin_sID']")).sendKeys("MANI1");
        driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlLogin_sPassword']")).sendKeys("Minds123");
        driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlLogin_cmdLogin']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@title='Administration']")).click();
        Thread.sleep(3000);
         driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection4_SectionHeader']")).click();

        driver.findElement(By.xpath("//a[@id='ctlTemplate_regLeftNav_ctlMenuUser_mnuUser_MenuSection4_SectionItemsRepeater_ctl01_SectionItem']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Choose Organizations')]")).click();
       Thread.sleep(3000);
        
        //window handle
        String parent=driver.getWindowHandle();
      // This will return the number of windows opened by Webdriver and will return Set of Strings
       Set<String>s1=driver.getWindowHandles();
       //Now we will iterate using Iterator
      Iterator<String>I1=s1.iterator();

      while(I1.hasNext())
      {
       String child_window=I1.next();

      //Here we will compare if parent window is not equal to child window then we will close

     if(!parent.equals(child_window))
     {
     driver.switchTo().window(child_window);

     System.out.println(driver.switchTo().window(child_window).getTitle());

     driver.findElement(By.xpath("//input[@value='Search']")).click();
     Thread.sleep(3000);

     driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlSearchList_ctlSearchList_ctlSearchList_Results_ctl01_lnkAdd']")).click();
     Thread.sleep(3000);

     driver.findElement(By.xpath("//input[@id='ctlTemplate_regMainBody_ctlBasket_cmdCheckout']")).click();
     Thread.sleep(3000);
     
     //switch to parent window
     driver.switchTo().window(parent);
     
     //scroll down 
     JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("window.scrollBy(0,2500)");
     System.out.println("scrolled Down");
     Thread.sleep(5000);


    //click on Additional inf
     driver.findElement(By.xpath("//img[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_plusMinusImage']")).click();
      Thread.sleep(3000);

      driver.findElement(By.xpath("//textarea[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_ttNotes']")).sendKeys("CSE");
      Thread.sleep(3000);
      
      
      //JavascriptExecutor js1=(JavascriptExecutor)driver;
     // js1.executeScript("window.scrollBy(0,1000)");
      //System.out.println("scrolled Down");
      //Thread.sleep(2000);
      
      
     //calender
      driver.findElement(By.xpath("//fieldset[@id='additionalInfoFields']//dl[3]//dd[1]//img[1]")).click();
   
      driver.findElement(By.xpath("//div[@class='day day4'][contains(text(),'7')]")).click();
      Thread.sleep(3000);
      
    //JavascriptExecutor js1=(JavascriptExecutor)driver;
       //js1.executeScript("window.scrollBy(0,1000)");
       //System.out.println("scrolled Down");
       //Thread.sleep(2000);
       
       
      //2nd calender
      driver.findElement(By.xpath("//dl[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_dlOpenDateContainer']//img[@class='calButton']")).click();
      
      driver.findElement(By.xpath("//div[@class='day day6'][contains(text(),'9')]")).click();
      Thread.sleep(3000);
      
      //3re calender
      driver.findElement(By.xpath("//dl[@id='ctlTemplate_regMainBody_pnlCourseAdditionalInfo_ctlCourseAdditionalInfoEdit_dlCloseDateContainer']//img[@class='calButton']")).click();
      
      driver.findElement(By.xpath("//div[contains(text(),'12')]")).click();
      Thread.sleep(3000);
      
      
      
      
      
      
      
      
      
      
      
      
      
//driver.close();


}
      }
      
	}
}
