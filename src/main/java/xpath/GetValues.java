package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement field=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		String s=field.getTagName();
		System.out.println(s);
		String atribute=field.getAttribute("class");
		System.out.println(atribute);
		String id=field.getAttribute("id");
		System.out.println(id);
		
	}

}
