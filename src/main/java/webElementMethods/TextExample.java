package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String button=showmessagebutton.getText();
		System.out.println(button);
		WebElement radiobutton=driver.findElement(By.xpath("//div[contains(text(),'Radio Button Demo')]"));
		String radio=radiobutton.getText();
		System.out.println(radio);
		
		

	}

}
