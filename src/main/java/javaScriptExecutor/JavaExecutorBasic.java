package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutorBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("alert('Reshma')");
		//js.executeScript("window.scrollBy(0,600)");
		//js.executeAsyncScript("window.scrollBy(0,1000)");
		WebElement fb=driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
		js.executeScript("arguments[0].scrollIntoView();", fb );
		js.executeScript("arguments[0].click();",fb);

	}

}
