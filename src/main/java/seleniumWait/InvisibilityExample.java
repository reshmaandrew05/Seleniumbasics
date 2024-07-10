package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvisibilityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
		driver.manage().window().maximize();
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement stratdownloadbutton = driver.findElement(By.xpath("//button[@id='downloadButton']"));
		wait.until(ExpectedConditions.elementToBeClickable(stratdownloadbutton));
		stratdownloadbutton.click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Cancel Download')]")));
		WebElement message=driver.findElement(By.xpath("//div[contains(text(),'Complete!')]"));
		
		/*FluentWait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(30))
		            .pollingEvery(Duration.ofSeconds(2))
		            .ignoring(ElementNotInteractableException.class);*/
		

	}

}
