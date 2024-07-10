package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxLabelPrint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Lsn-User.DESKTOP-GLKVRGN\\\\Desktop\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox1=driver.findElement(By.xpath("//label[contains(text(),'Check Box One')]"));
		String c1=checkbox1.getText();
		System.out.println(c1);
		WebElement checkbox2=driver.findElement(By.xpath("//label[contains(text(),'Check Box Two')]"));
		String c2=checkbox2.getText();
		System.out.println(c2);
		WebElement checkbox3=driver.findElement(By.xpath("//label[contains(text(),'Check Box Three')]"));
		String c3=checkbox3.getText();
		System.out.println(c3);
		WebElement checkbox4=driver.findElement(By.xpath("//label[contains(text(),'Check Box Four')]"));
		String c4=checkbox4.getText();
		System.out.println(c4);
		

	}

}
