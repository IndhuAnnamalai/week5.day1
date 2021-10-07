package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIncident extends BaseClass{

	@Test
public void deleteIncident() throws InterruptedException {
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame);
		System.out.println("Inside the frame");
		//Thread.sleep(1000);
//      driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incidentNumber);
		//driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incidentNumber,Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010023",Keys.ENTER);
		System.out.println("Search successful");
		driver.findElement(By.linkText("INC0010023")).click();
		driver.findElement(By.id("sysverb_delete")).click();
		System.out.println("Warning");
		
		/*
		 * WebElement frame1 =
		 * driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		 * driver.switchTo().frame(frame1);
		 */
		 // driver.findElement(By.xpath("//button[@id='cancel_button']/following-sibling::button[1]")).click();
		
		//driver.findElement(By.xpath("(//button[text()='Delete'])[3]")).click();
		driver.findElement(By.id("ok_button")).click();
	
}
}
