package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivertest {
  public static void main(String[] args) {
	
	  System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.Flipkart.com");
	  driver.quit();
	  
}
}
