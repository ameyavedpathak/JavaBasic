import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Vedpathak\\Documents\\Ameya\\Softwares\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  
        // Open Page of American Airline 
		
		driver.get("https://www.aa.com/homePage.do");
     
//Find From Airport
		
         driver.findElement(By.xpath("//*[@id=\'reservationFlightSearchForm\']/div[3]/div[1]/div/a/span[1]")).click();
         driver.findElement(By.xpath("//*[@id=\'countryCode\']")).click();

// Select the Country
         
         Select s = new Select(driver.findElement(By.xpath("//*[@id='countryCode']")));
         s.selectByValue("US");
         
// Select the State
         
         driver.findElement(By.id("stateCode")).sendKeys("KANSAS");

//Select Local Airport
         
         driver.findElement(By.xpath("//*[@id=\'airport_ICT\']/span[1]")).click();
         driver.findElement(By.xpath("//*[@id=\'airport_ICT\']/span[1]")).click();
          
//////////////////////////////////////////////////////////////////////////////////////////////////////////         
         
//Find From Airport
 		
         driver.findElement(By.xpath("//*[@id=\'reservationFlightSearchForm\']/div[3]/div[2]/div/a/span[1]")).click();
         driver.findElement(By.xpath("//*[@id=\'countryCode\']")).click();

// Select the Country
         
         Select r = new Select(driver.findElement(By.xpath("//*[@id='countryCode']")));
         r.selectByValue("US");
         
// Select the State
         
        driver.findElement(By.id("stateCode")).sendKeys("Texas");

//Select Local Airport
         
         driver.findElement(By.xpath("//*[@id=\'airport_DAL\']/span[1]")).click();
         //driver.findElement(By.xpath("//*[@id=\'airport_DAL\']/span[1]")).click(); 
         

//Select number of Passenger
         
         Select p = new Select(driver.findElement(By.xpath("//*[@id=\'flightSearchForm.adultOrSeniorPassengerCount\']")));
         p.selectByValue("2");
         
         
         
//Select Date of Travel
                 
       
         driver.findElement(By.xpath("//*[@id='aa-leavingOn']")).clear();
         driver.findElement(By.xpath("//*[@id='aa-leavingOn']")).sendKeys("08/30/2018");
         
         
//Select Date of Return
         
         driver.findElement(By.xpath("//*[@id=\'aa-returningFrom\']")).clear();
         driver.findElement(By.xpath("//*[@id=\'aa-returningFrom\']")).sendKeys("08/31/2018");
         

//Submit the interests of Travel         
         
         driver.findElement(By.xpath("//*[@id=\'flightSearchForm.button.reSubmit\']")).click();
         
         

	}

}
