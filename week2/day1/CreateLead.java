package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("QA");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Joseph");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
	    
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Tester");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
	    driver.findElement( By.id("createLeadForm_description")).sendKeys("Test User Creation");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("qatest@testmail.com");
	    
	    WebElement statedropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    
	    Select state = new Select(statedropdown);
	    state.selectByVisibleText("New York");
	    
	    driver.findElement(By.className("smallSubmit")).click();
		
	    String title = driver.getTitle();
	    
	    System.out.println(title);	
	    
	    driver.close();
		
		
	}

}
