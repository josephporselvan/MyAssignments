package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFaceBook {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("fName");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lName");
		driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("1212121212");
		driver.findElement(By.id("password_step_input")).sendKeys("Newtest12$");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select day = new Select(dropdown);
		
		day.selectByVisibleText("11");
		
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Apr");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1990");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		
	}

}
