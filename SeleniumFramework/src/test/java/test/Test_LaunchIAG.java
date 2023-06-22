package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_LaunchIAG {

	public static void main(String[] args) {
		
		launchiag();
	}

	public static void launchiag(){
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		//driver.findElement(By.id("APjFqb")).sendKeys("iag australia");
		driver.findElement(By.name("q")).sendKeys("IAG Australia limiteds");
		//driver.findElement(By.name("btnk")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.close();
	}
}