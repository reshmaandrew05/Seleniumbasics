package keyBoardInteractions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassExample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Robot robot=new Robot(); // Create an instance of Robot class
		robot.keyPress(KeyEvent.VK_DOWN); // Simulate pressing the down arrow key

		robot.keyPress(KeyEvent.VK_DOWN); //press down arrow again

	}

}
