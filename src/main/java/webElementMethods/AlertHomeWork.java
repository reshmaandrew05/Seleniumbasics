package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHomeWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement button1=driver.findElement(By.xpath("//button[text()='Click me!']"));
		button1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement button2=driver.findElement(By.xpath("//button[@onClick='jsConfirm()']"));
		button2.click();
		Thread.sleep(2000);
		String s=driver.switchTo().alert().getText();
		Thread.sleep(2000);
		System.out.println(s);
		driver.switchTo().alert().dismiss();
		WebElement button3=driver.findElement(By.xpath("//button[@onClick='jsPrompt()']"));
		button3.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("I am Reshma");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		

	}

}
