package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ObsquraLaunch {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		System.out.println("url: "+driver.getCurrentUrl());
		System.out.println("Title: "+driver.getTitle());
		
		

	}
}
