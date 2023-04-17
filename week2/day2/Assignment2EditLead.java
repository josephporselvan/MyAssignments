package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Joseph");
		driver.findElement(By.id("ext-gen334")).click();
		driver.findElement(By.xpath("((//table[@class='x-grid3-row-table']//a)[1]")).click();
		
        String title1 = driver.getTitle();
	    
	    System.out.println(title1);
	    
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("New Company");
	    driver.findElement(By.linkText("Update")).click();
	    driver.findElement(By.xpath("//span[contains(text(), 'New Company')]"));
	    
	    driver.close();

	}

}
