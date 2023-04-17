package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Joseph");
	    driver.findElement(By.id("lastNameField")).sendKeys("A");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Tester");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("New");
	    driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("QA");
	    driver.findElement( By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Test User Creation");
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("qatest1@testmail.com");
	    
	    WebElement statedropdown = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
	    
	    Select state = new Select(statedropdown);
	    state.selectByVisibleText("New York");
	    
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement( By.xpath("//textarea[@id='updateContactForm_description']")).clear();
	    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Cleared the Description and added this comment as Important Note");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	    
	    String title = driver.getTitle();
	    
	    System.out.println(title);	
	    
	    //driver.close();

	}

}
