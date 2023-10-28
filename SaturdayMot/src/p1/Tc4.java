package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc4 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://shoppersstack.com/");
        WebElement login_btn = driver.findElement(By.xpath("//button[text()='Login']"));
        if(login_btn.isDisplayed())
        	login_btn.click();
        WebElement adminLogin_btn = driver.findElement(By.xpath("//button[text()='Admin Login']"));
        if(adminLogin_btn.isDisplayed())
        	adminLogin_btn.click();
        WebElement email = driver.findElement(By.id("Email"));
        if(email.isDisplayed())
        	mailto:email.sendKeys("praneethkumar1821@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        if(password.isDisplayed())
        	password.sendKeys("Praneeth@123");
        WebElement login = driver.findElement(By.id("Login"));
        if(login.isDisplayed())
        	login.click();
        WebElement merchantstext = driver.findElement(By.xpath("//h6[text()='Approved Merchants']"));
        if(merchantstext.isDisplayed())
        	System.out.println("Approved merchants list is displayed.");
        WebElement filters = driver.findElement(By.xpath("//button[@aria-label=\"Show filters\"]"));
        filters.click();
        WebElement columns = driver.findElement(By.xpath("(//select)[2]"));
        Select obj = new Select(columns);
        obj.selectByValue("companyPhone");
        WebElement operator = driver.findElement(By.xpath("(//select)[3]"));
        Select obj1 = new Select(operator);
        obj1.selectByValue("isEmpty");
	}
	}


