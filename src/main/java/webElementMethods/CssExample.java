package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		driver.manage().window().maximize();
		WebElement button1=driver.findElement(By.xpath("//button[@id='normal-btn-success']"));
		System.out.println(button1.getCssValue("color"));
		System.out.println(button1.getCssValue("font-size"));
		System.out.println(button1.getCssValue("font-style"));
		System.out.println(button1.getCssValue("background-color"));
		System.out.println();
		WebElement button2=driver.findElement(By.xpath("//button[@class='btn btn-primary btn-danger btn-block']"));
		System.out.println(button2.getCssValue("background-color"));
		System.out.println(button2.getCssValue("font-size"));
		System.out.println(button2.getCssValue("font-style"));
		System.out.println(button2.getCssValue("color"));
	}

}
