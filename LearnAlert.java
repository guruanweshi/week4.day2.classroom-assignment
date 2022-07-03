package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); //Get Driver for execution
		
		
		// To open Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Alert.html");
		
		//To maximize the open browser
		driver.manage().window().maximize();
		
		// simple alert
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		//Handling the alert- switch context from browser to alert
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		// click on the single button since it is a simple alert you can use accept() or dismiss() function
		alert.accept();
		
		//checking control is back to browser
		System.out.println(driver.getTitle());
		
		//confirm alert
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		//checking control is back to browser
				System.out.println(driver.getTitle());
		
		// prompt alert
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("IIT");
		alert2.accept();
		
		//checking control is back to browser
				System.out.println(driver.getTitle());
				
				
	 // No alert exception
				//Alert alert3 = driver.switchTo().alert();	
				
	// Unhandled alert exception
				driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
				System.out.println(driver.getTitle());
	}

}
