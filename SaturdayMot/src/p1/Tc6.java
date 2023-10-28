package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Tc6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get("https://shoppersstack.com/");
        WebElement login_btn = driver.findElement(By.xpath("//button[text()='Login']"));
        if(login_btn.isDisplayed())
        	login_btn.click();
        WebElement adminLogin_btn = driver.findElement(By.xpath("//button[text()='Admin Login']"));
        if(adminLogin_btn.isDisplayed())
        	adminLogin_btn.click();
        WebElement email = driver.findElement(By.id("Email"));
        if(email.isDisplayed())
        	email.sendKeys("praneethkumar1821@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        if(password.isDisplayed())
        	password.sendKeys("Praneeth@123");
        WebElement login = driver.findElement(By.id("Login"));
        if(login.isDisplayed())
        	login.click();
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
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
		String  first=driver.findElement(By.id("Phone Number")).getText();
		if(first.equals("8374655342")) {
			System.out.println("phone number changed");
		}
		else
			System.out.println("phone number not changed");
	}

}
