package com.MouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Operation {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		 String url="https://jqueryui.com/droppable/";
		 
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get(url);
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 // switching into a frame of the webpage
		 
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));	 
		 
		 // id="draggable" - property of "Drag Me to My Target" Element
 WebElement drag_Element=driver.findElement(By.id("draggable"));
 
 // id="droppable" - property of "Drop Here" Element
 
 WebElement drop_Element=driver.findElement(By.id("droppable"));
 
 	Actions act = new Actions(driver);
 	act.dragAndDrop(drag_Element, drop_Element).perform();
 	
 	// Switching back to default webPage from the Frame 
 	driver.switchTo().defaultContent();

 	// <a href="https://jqueryui.com/resizable/">Resizable</a>
 	
 	driver.findElement(By.linkText("Resizable")).click();
 	
	}

}
