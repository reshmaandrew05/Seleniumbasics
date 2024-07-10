package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathAtribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		WebElement forgotlink=driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate/?')]"));
		forgotlink.click();
		

	}

}
