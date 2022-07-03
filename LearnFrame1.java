package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); //Get Driver for execution
		
		
		// To open Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		//To maximize the open browser
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("Click")); // will get exception f you try to access an element inside the frame from outside
		
		// switching the context inside the frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//li[text()='Item 3']")).click();
		
		// manually switching to main page from frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Download")).click();

	}

}
