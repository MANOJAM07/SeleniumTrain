package p1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver; 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Admin Login')]")).click();
		driver.findElement(By.id("Email")).sendKeys("praneethkumar1821@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Praneeth@123");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[text()='My Profile']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//button)[2]")).click();
	    Thread.sleep(3000);
        WebElement element=driver.findElement(By.xpath("//input[@name='Last Name']"));
        Thread.sleep(2000);
        js.executeAsyncScript("arguments[0].value='iso';", element);
       Thread.sleep(8000);
    	driver.findElement(By.xpath("//button[@name='Submit']")).click();
    	Thread.sleep(6000);
    driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
    driver.findElement(By.xpath("//li[text()='My Profile']")).click();
	}

}
