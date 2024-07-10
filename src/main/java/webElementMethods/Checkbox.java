package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		boolean b1=checkbox1.isSelected();//check whether radio button or check box checked or not
		System.out.println(b1);
		WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		boolean b2=checkbox2.isSelected();
		System.out.println(b2);
		if(b1==false)
		{
			checkbox1.click();
		}
		if(b2==false)
		{
			checkbox2.click();
		}
		boolean chk1=checkbox1.isDisplayed();//check whether web element present or not
		System.out.println(chk1);
		boolean chk2=checkbox2.isDisplayed();
		System.out.println(chk2);
		boolean checkboxenable1=checkbox1.isEnabled();
		System.out.println(checkboxenable1);
		
		}

}
