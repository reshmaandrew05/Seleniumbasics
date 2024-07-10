package seleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		WebElement startbutton=driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
		startbutton.click();
		Thread.sleep(10000);
		WebElement hlowrld=driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		System.out.println(hlowrld.getText());
		

	}

}
