package xpath;             
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObsquraExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement radiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radiobutton.click();
		WebElement clickbutton=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		clickbutton.click();
		WebElement radiobutton1=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radiobutton1.click();
		WebElement clickbutton1=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		clickbutton1.click();

	}

}
