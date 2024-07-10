package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListPrintError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().window().maximize();
		WebElement submitbutton=driver.findElement(By.xpath("//button[text()=\"Submit form\"]"));
		submitbutton.click();
		List <WebElement> errorlist=driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		for(WebElement er:errorlist)
		{
			System.out.println(er.getText());
		}

	}

}
