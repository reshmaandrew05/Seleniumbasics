package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonUsingMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement field=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		field.click();
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		button.click();
		WebElement text=driver.findElement(By.xpath("//div[@id='message-one']"));
		String textgiven=text.getText();
		System.out.println(textgiven);
		
		
		

	}

}
