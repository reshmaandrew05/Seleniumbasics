package webElementMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		WebElement newtabbutton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		newtabbutton.click();
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> windows=driver.getWindowHandles();//this method get all tab in the program
		System.out.println(windows.size());
		Iterator<String> iterat=windows.iterator();
		while(iterat.hasNext())
		{
			System.out.println(iterat);
			String currentwindow=iterat.next();
			if(!parentwindow.equals(currentwindow))
			{
				driver.switchTo().window(currentwindow);
			}
			//System.out.println(iterat.next());
		}
		
		WebElement welcome=driver.findElement(By.xpath("//h1[contains(text(),'Welcome to Formy')]"));
		System.out.println(welcome.getText());
		driver.close();
		//WebElement alertbutton=driver.findElement(By.xpath("//button[@id='alert-button']"));
		//alertbutton.click();

	}

}
