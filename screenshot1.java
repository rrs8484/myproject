package alerthandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplealert {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\test\\alerthandling\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
Thread.sleep(5000);
Alert simplealert= driver.switchTo().alert();
simplealert.accept();
driver.quit();
}      
}

