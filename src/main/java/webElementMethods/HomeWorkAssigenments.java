package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkAssigenments {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement malebutton=driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]"));
		WebElement femalebutton=driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]"));
		if(malebutton.isSelected()==false)
		{
			malebutton.click();
		}
		System.out.println("Male radio button is Selected: "+malebutton.isSelected());
		System.out.println("Female radio button is Selected: "+femalebutton.isSelected());
		System.out.println("Male radio button is Displayed: "+malebutton.isDisplayed());
		System.out.println("Female radio button is Displayed: "+femalebutton.isDisplayed());
		System.out.println("Male radio button is Enabled: "+malebutton.isEnabled());
		System.out.println("Female radio button is Enabled: "+femalebutton.isEnabled());
		WebElement showbutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showbutton.click();

	}

}
