package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssProperty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/window-popup.php");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		String color=button.getCssValue("background-color");
		System.out.println(color);
		String fontcolor=button.getCssValue("color");
		System.out.println(fontcolor);
		System.out.println(button.getCssValue("font-size"));
		System.out.println(button.getCssValue("font-style"));
	}

}
