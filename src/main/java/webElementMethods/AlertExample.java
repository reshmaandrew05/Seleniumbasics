package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().window().maximize();
			WebElement button1=driver.findElement(By.xpath("//button[@onClick='jsAlert()']"));
			button1.click();
			driver.switchTo().alert().accept();
			WebElement button2=driver.findElement(By.xpath("//button[@onClick='jsConfirm()']"));
			button2.click();
			String s=driver.switchTo().alert().getText();
			System.out.println(s);
			
			driver.switchTo().alert().dismiss();
			
			WebElement button3=driver.findElement(By.xpath("//button[@onClick='jsPrompt()']"));
			button3.click();
			driver.switchTo().alert().sendKeys("Hai good  morning");
			driver.switchTo().alert().accept();

	}

}
