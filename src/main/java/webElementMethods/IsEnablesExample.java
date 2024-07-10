package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsEnablesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://formy-project.herokuapp.com/enabled");
		driver.manage().window().maximize();
		WebElement displayfield=driver.findElement(By.xpath("//input[@id='disabledInput']"));
		boolean fieldenabled=displayfield.isEnabled();
		System.out.println(fieldenabled);
		boolean fielddispayed=displayfield.isDisplayed();
		System.out.println(fielddispayed);

	}

}
