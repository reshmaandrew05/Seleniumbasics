package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.amazon.in/?");
		driver.manage().window().maximize();
		WebElement allbutton=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		String title=allbutton.getAttribute("title");
		System.out.println(title);*/
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		WebElement circlebutton=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		String title=circlebutton.getAttribute("title");
		System.out.println(title);
		WebElement cicrclebutton2=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-google']"));
		String title1=cicrclebutton2.getAttribute("title");
		System.out.println(title1);

	}

}
