package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignIncident extends BaseClass{

	@Test
	public void assignIncident() {
		
		driver.findElement(By.xpath("//div[text()='Open']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame);
		System.out.println("Inside the frame");
		//String incNumber = driver.findElement(By.xpath("(//a[@class='linked formlink'])[3]")).getText();
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010023",Keys .ENTER);
		driver.findElement(By.linkText("INC0010023")).click();		
		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[5]")).click();
		Set<String> winSet = driver.getWindowHandles();
		List<String> winList= new ArrayList<String>(winSet);
		driver.switchTo().window(winList.get(1));
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Software");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).click();
		driver.switchTo().window(winList.get(0));
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("activity-stream-textarea")).sendKeys("Incident assigned to Software");
		driver.findElement(By.id("sysverb_update")).click();
	}
}
