package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		List<WebElement> menu=driver.findElements(By.xpath("//ul[@class='navbar-nav']//a"));
		int listsize=menu.size();
		System.out.println(listsize);
		for(int i=0; i<listsize; i++)
		{
			String data=menu.get(i).getText();
			System.out.println(data);
			String data1=menu.get(i).getTagName();
			System.out.println(data1);
			
		}
		for(WebElement element:menu)
		{
			String ele=element.getText();
			System.out.println(ele);
		}
		

	}

}
