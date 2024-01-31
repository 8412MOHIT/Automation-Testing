package SeleniumLinerProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class Automation {
	public void Silver() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver\\","D:\\Auto\\Automations\\chromedriver_win32 (1)\\ChromeDriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
        //OPEN APPLICATICATION
        driver.get("http://sampleapp.tricentis.com/101/index.php#");
      
      
        //OPEN AUTOMOBILE FUNCTION
	       driver.findElement(By.partialLinkText("Automobile")).click();  
	    
	    
	       //ENTER VEHICLE DATA
	       
	       WebElement au=driver.findElement(By.id("make"));
	       Select model=new Select(au);
	       model.selectByVisibleText("Porsche");
	       driver.findElement(By.id("engineperformance")).sendKeys("309");
	       driver.findElement(By.id("dateofmanufacture")).sendKeys("06/23/2023");
	       driver.findElement(By.id("numberofseats")).sendKeys("2");
	       driver.findElement(By.id("fuel")).sendKeys("Petrol");
	       driver.findElement(By.id("listprice")).sendKeys("95000");
	       driver.findElement(By.id("licenseplatenumber")).sendKeys("44.NH.48");
	       driver.findElement(By.id("annualmileage")).sendKeys("1500");
	      
	       driver.findElement(By.id("nextenterinsurantdata")).click();
	       
	       
	       //ENTER INSURANT DATA
	       
	       driver.findElement(By.id("firstname")).sendKeys("Mohit");
	       driver.findElement(By.id("lastname")).sendKeys("Salunkhe");
	       driver.findElement(By.id("birthdate")).sendKeys("11/26/1993");
	       driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[2]/div[4]/p/label")).click();
	       driver.findElement(By.id("streetaddress")).sendKeys("Dmartroad,Karvenager,Pune");  
	       driver.findElement(By.id("country")).sendKeys("India");
	       driver.findElement(By.id("zipcode")).sendKeys("411038");
	       driver.findElement(By.id("city")).sendKeys("Pune");
	       driver.findElement(By.id("occupation")).sendKeys("Farmer");
	       driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[2]/div[10]/p/label[3]")).click();
	       driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[2]/div[10]/p/label[5]")).click();
		   driver.findElement(By.id("website")).sendKeys("www.porsche.com");
	       
		   driver.findElement(By.id("nextenterproductdata")).click();
	        
	        
	        
	       //ENTER PRODUCT DATA
	        
	       driver.findElement(By.id("startdate")).sendKeys("05/16/2024");
	       driver.findElement(By.id("insurancesum")).sendKeys("20000000");
	       driver.findElement(By.id("meritrating")).sendKeys("Bonus 1");
	       driver.findElement(By.id("damageinsurance")).sendKeys("Full Coverage");
	       driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[3]/div[5]/p/label")).click();
	       driver.findElement(By.id("courtesycar")).sendKeys("Yes");
	       
	       driver.findElement(By.id("nextselectpriceoption")).click();
	        
	        
	       
	       //SELECT PRICE OPTION
	        
	      // WebElement silver=driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span"));
	     //  silver.click();
	       String expPrice="247.00", actPrice,expClaim= "No",actClaim, expDis= "No",actDis,expWorld="No",actWorld;
	       
	       actPrice=driver.findElement(By.xpath("//*[@id=\"selectsilver_price\"]")).getText();
	       actClaim=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]")).getText();
	       actDis=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[2]")).getText();
	       actWorld=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[2]")).getText();
	       
	       
	       if (expPrice.equals(actPrice) && expClaim.equals(actClaim) && expDis.equals(actDis) && expWorld.equals(actWorld))    		   
	    		   
	       {
	    	   driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")).click();
	       }
	       else 
	       {
			System.out.println("We can't process");
		   }
	    		 
	    	  
	       driver.findElement(By.id("nextsendquote")).click();  
	    
	        
	        
	       //SEND QUOTE
	        
	       driver.findElement(By.id("email")).sendKeys("84mohitsalunkhe@gmail.com");
	       driver.findElement(By.id("phone")).sendKeys("9007795094");
	       driver.findElement(By.id("username")).sendKeys("MAS8412");
	       driver.findElement(By.id("password")).sendKeys("Password@101");
	       driver.findElement(By.id("confirmpassword")).sendKeys("Password@101");
	       driver.findElement(By.id("Comments")).sendKeys("Happy Path");
	       
	       driver.findElement(By.id("sendemail")).click();
	        
	        
	        
	       //SENDING E-MAIL SUCCESS
	        
	       Thread.sleep(10000);
		   WebElement msg = driver.findElement(By.xpath("/html/body/div[4]/h2"));
		   System.out.println("The send email msg is: "+msg.getText());
		   driver.findElement(By.className("confirm")).click();
	        
	      
	       //GO TO HOME PAGE
	        
	       driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[5]/section/div[8]/div/div/div/div/a")).click();
            
	       driver.quit();
	}
	public abstract void Gold()throws InterruptedException;
	public abstract void Platinum()throws InterruptedException;
	public abstract void Ultimate()throws InterruptedException;
}
