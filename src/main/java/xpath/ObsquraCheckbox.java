package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObsquraCheckbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement textfield=driver.findElement(By.xpath("//input[@class='form-control']"));
		textfield.sendKeys("Reshma");
		WebElement clickbutton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickbutton.click();
		
		
		

	}

}
