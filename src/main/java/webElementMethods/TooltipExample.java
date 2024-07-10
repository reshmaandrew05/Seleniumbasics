package webElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TooltipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/window-popup.php");
		driver.manage().window().maximize();
		WebElement tooltip1=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		System.out.println(tooltip1.getAttribute("title"));
		WebElement tooltip2=driver.findElement(By.xpath("//a[@class='btn btn-success']"));
		System.out.println(tooltip2.getAttribute("title"));

	}

}
