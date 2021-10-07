package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateServiceNow extends BaseClass{

	@Test
	public void incidentUpdation() throws InterruptedException {
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame);
		System.out.println("Inside the frame");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010023",Keys.ENTER);
		//driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys();
		System.out.println("Search successful");
		driver.findElement(By.linkText("INC0010023")).click();
		
		
		WebElement priority = driver.findElement(By.id("incident.urgency"));
		Select dropdown = new Select(priority);
		dropdown.selectByValue("1");
		System.out.println("Priority success");
		WebElement state = driver.findElement(By.id("incident.state"));
		Select dropdown1 =new Select(state);
		dropdown1.selectByVisibleText("In Progress");
		System.out.println("State success");

		driver.findElement(By.id("sysverb_update")).click();
		
	}
}
