package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
       ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("QA");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Joseph");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("A");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Tester");
	    driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("QA");
	    driver.findElement( By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Test User Creation");
	    driver.findElement(By.xpath("//input[@name='primaryEmail']")).sendKeys("qatest@testmail.com");
	    
	    WebElement statedropdown = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
	    
	    Select state = new Select(statedropdown);
	    state.selectByVisibleText("New York");
	    
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
	    String title = driver.getTitle();
	    
	    System.out.println(title);	
	    
	    driver.close();

	}

}
