package com.Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery_IdentifyElement_DragMeToMyTarget_And_AutomateResizableElement {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		 String url="https://jqueryui.com/droppable/";
		 
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get(url);
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	// identify the propeties of the Frame of the webPage - since elements are
		 // created in the frame 
	
	// Selenium WebDriver cannot directly identify any Element if it is created
		 // in the frame of the WebPage

//<iframe  class="demo-frame"></iframe>
		 
//WebDriver should be now instructed to first identify the frame
		// of the Webpage - and switch into it  

	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));	 
		 
		 // id="draggable" - property of "Drag Me to My Target" Element
WebElement drag_Element=driver.findElement(By.id("draggable"));

// getting the text of the Element -"Drag Me to My Target"

	String dragElement_Text=drag_Element.getText();
	System.out.println(" Drag Element Text is : "+dragElement_Text);

	driver.switchTo().defaultContent();

	// <a href="https://jqueryui.com/resizable/">Resizable</a>
	driver.findElement(By.linkText("Resizable")).click();
System.out.println(" The title of Resizable WebPage is : "+driver.getTitle());

}
}
