package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.apple.com/in");
		driver.navigate().back();
		driver.navigate().refresh();

	}

}
