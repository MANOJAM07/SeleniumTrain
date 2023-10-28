package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("vertical-tab-2")).click();
		driver.findElement(By.id("email")).sendKeys("praneethkumar1821@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Praneeth@123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("(//div[text()='P'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
		WebElement firstname = driver.findElement(By.id("Phone Number"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='8374655342';", firstname);
		driver.findElement(By.id("Submit")).click();
		WebElement cancelbtn = driver.findElement(By.cssSelector(".Toastify__close-button.Toastify__close-button--light"));
		js.executeScript("arguments[0].click();", cancelbtn);
		driver.findElement(By.xpath("(//div[text()='P'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
		String  first=driver.findElement(By.id("Phone Number")).getText();
		if(first.equals("8374655342")) {
			System.out.println("phone number changed");
		}
		else
			System.out.println("phone number not changed");


	}

}
