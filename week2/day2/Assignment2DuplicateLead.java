package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("qatest@testmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		WebElement name = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]"));
		String firstname=name.getText();
		System.out.println(firstname);

		//driver.findElement(By.id("ext-gen334")).click();
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		WebElement title=driver.findElement(By.xpath("//div[text()='Duplicate Lead']"));
		String pageTitle=title.getText();
		System.out.println(pageTitle);
		
		if(pageTitle.contains("Duplicate Lead"))
		{
			
			driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
			WebElement name1=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
			String firstname1=name1.getText();
			System.out.println(firstname1);
			
			boolean isSame = firstname.equals(firstname1);
			System.out.println(isSame);
			
			
		}
		
		else {
			System.out.println("The Duplicate Lead is not correct");
		}
		
		driver.close();
		

	}

}
