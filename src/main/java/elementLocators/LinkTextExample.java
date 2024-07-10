package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkTextExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement forgotlink=driver.findElement(By.linkText("Forgotten password?"));//link text selector
		forgotlink.click();
		WebElement forgotlink1=driver.findElement(By.partialLinkText("Forgotten"));//partial link text selector
		forgotlink1.click();
		

	}

}
