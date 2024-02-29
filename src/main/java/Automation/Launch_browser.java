package Automation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_browser {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("hello");
 
@Test

public void LoginwithValidCredentials() throws Exception {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	driver.close();

}

@Test
public void LoginWithValidUsernameInvalidPassword() throws Exception {
	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ere");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	driver.close();

}
}
