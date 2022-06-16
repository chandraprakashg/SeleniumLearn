package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGooglepage {

	public static void main(String[] args) {
		// Edited in Github
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		//To google the w3schools by press Enter key
		driver.findElement(By.name("q")).sendKeys("w3schools"+Keys.ENTER);
	}

}

