package basics;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BrowserLaunch {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();// eg of runtime polymorphism
		System.setProperty("webdriver.edge.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.get(driver.getCurrentUrl());
		String title=driver.getTitle();
		System.out.println(title);
		driver.getCurrentUrl();
		String cutitle=driver.getCurrentUrl();
		System.out.println(cutitle);
		driver.getPageSource();
		System.out.println(driver.getPageSource());
		//driver.quit();
		//driver.close();
	
		

	}

}
