package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		//WebElement middle1=driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]"));
		//System.out.println(middle1.getText());
		driver.switchTo().frame("frame-middle");
		WebElement middle=driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]"));
		System.out.println(middle.getText());
	}

}
