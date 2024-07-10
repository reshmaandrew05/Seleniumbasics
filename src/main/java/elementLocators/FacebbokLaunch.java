package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebbokLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement emailfield=driver.findElement(By.name("email"));//name selector
		emailfield.click();
		emailfield.sendKeys("reshmaandrew93@gmail.com");
		emailfield.clear();
		WebElement emailfield1 = driver.findElement(By.cssSelector("#email"));//css selector
		emailfield1.sendKeys("reena@gmail.com");
		emailfield1.clear();
		WebElement emailfield11 = driver.findElement(By.cssSelector("#email"));
		emailfield11.sendKeys("riya@gmail.com");
		//WebElement forgotlink = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		//forgotlink.click();
		WebElement forgotlink = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		forgotlink.click();
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		login.click();
		
		}

}
