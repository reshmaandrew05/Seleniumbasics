package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObsquraTextfield {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement singlecheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singlecheckbox.click();
		WebElement multicheckbox=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		multicheckbox.click();
		
		

	}

}
