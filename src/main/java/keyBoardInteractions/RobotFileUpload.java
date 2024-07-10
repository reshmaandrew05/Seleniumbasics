package keyBoardInteractions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotFileUpload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement inputTag=driver.findElement(By.xpath("//input[@id='file-upload']"));
		String path="C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\Reshma_obsqura\\manual\\Notes\\1.png";
        // Create an instance of Actions class
        Actions actions = new Actions(driver);
        Robot robot = new Robot();
        actions.moveToElement(inputTag).click().build().perform();
        
        // Copy the file path to the system clipboard
        StringSelection ss = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        
        // Add a small delay
        robot.delay(1000);
        
        // Move to the file input element and click to open the file upload dialog
        
     // Add a small delay
        robot.delay(1000);
        
        // Simulate Ctrl+V to paste the file path from the clipboard
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        
        // Add a small delay
        robot.delay(3000);
        
        // Simulate pressing Enter to confirm the file upload
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
