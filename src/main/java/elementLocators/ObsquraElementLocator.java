package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ObsquraElementLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://selenium.qabible.in/simple-form-demo.php");
	    WebElement messagefield=driver.findElement(By.id("single-input-field"));
	    messagefield.sendKeys("Hello");
	    WebElement showbutton=driver.findElement(By.id("button-one"));
	    showbutton.click();

	}

}
