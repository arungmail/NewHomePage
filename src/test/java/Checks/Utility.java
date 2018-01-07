package Checks;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.platform.FileUtils;

import BasePackage.DriverClass;
import Checks.Elements;

public class Utility extends DriverClass{
	Elements ele = new Elements ();
	
	
	//Select item from drop down by index number 
	public void selectvalueByIndex(WebElement element, int no)
	{
		Select select = new Select (element);
		select.selectByIndex(no);
	}
	//Select item from drop down by visible text 
	public void selectValueByVisibleText(WebElement element, String valueToSet)
	{
	Select select = new Select (element);
	select.selectByVisibleText(valueToSet);	
	}
	
	public void selectValueByValue (WebElement element, String valueToSet){
		
	}
	public String getValidationMessage (WebElement element){
		WebElement element1 = driver.findElement((By) element);
		String error = element1.getText();
		return error;
	}
	public void uploadImages (String path) throws IOException, InterruptedException{
		//Thread.sleep(5000);
		Runtime.getRuntime().exec(path);
	}
	
	public void editOrDelete (WebElement element,String action,String name) throws InterruptedException{
		WebElement entries = driver.findElement(ele.Entries);
		selectValueByVisibleText(entries, "100");
		Thread.sleep(5000);
		driver.findElement(ele.Search).clear();
		driver.findElement(ele.Search).sendKeys(name);
		Thread.sleep(5000);
		WebElement table = element;
		List <WebElement> row = table.findElements(By.tagName("tr"));
		row.size();
		for (int i=0;i<row.size();i++){
			List <WebElement> col = row.get(i).findElements(By.tagName("td"));
			col.size();
			for (int j=0;j<col.size();j++){
				String allContents = col.get(j).getText();
				System.out.println(allContents);
				if (allContents.equals(name)){
					String xp1 = "";
					String xp2 = "";
					WebElement actions = driver.findElement(By.xpath(".//*[@id='bannerstable']/tbody/tr/td[9]"));
					if (action.equals("Edit")){
						actions.findElement(ele.Edit).click();
						System.out.println("Clicking on eidt ");
					}
					else {
						actions.findElement(ele.Delete).click();
						
					}
					
					
				}
				
			}
			
		}
		
		
	}
	
	public void editOrDelete (String action,String name) throws InterruptedException{
		WebElement entries = driver.findElement(ele.Entries);
		selectValueByVisibleText(entries, "100");
		Thread.sleep(5000);
		driver.findElement(ele.Search).clear();
		driver.findElement(ele.Search).sendKeys(name);
		Thread.sleep(5000);
		if (action.equals("Edit")){
			driver.findElement(ele.Edit).click();
			System.out.println("Edit buttton present ");
		}
		else {
			driver.findElement(ele.Delete).click();
		}
		
	}
	
	public void clickOKButtonOnAlertBox (){
		Alert alert = driver.switchTo().alert();
		// Get the text of the alert or prompt
		alert.getText();  
		System.out.println(alert.getText());
		// And acknowledge the alert (equivalent to clicking "OK")
		alert.accept();
	}
	
}

