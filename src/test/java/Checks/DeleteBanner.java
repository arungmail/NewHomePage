package Checks;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BasePackage.DriverClass;

public class DeleteBanner extends DriverClass{
	Elements ele = new Elements ();
	InputValues input = new InputValues();
	Utility util = new Utility ();
	AddBanner add = new AddBanner ();
	
	
	@Test (priority=1)
	public void deleteFirstCommercialAd () throws InterruptedException{
		add.login();
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.Firstcommercelad);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=2)
	public void deleteSecondCommercialAd() throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.Secondcommercelad);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=3)
	public void deleteFirstFooterAd() throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.FirstFooterAd);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=4)
	public void deleteSecondFooterAd() throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.SecondFooterAd);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=5)
	public void deletePopUp() throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.poPUpBanner);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=6)
	public void deleteFirstPartner() throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.FirstPartners);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=7)
	public void deleteSecondPartner() throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.SecondPartner);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=8)
	public void deleteFirstMaschaBanner() throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.FirstMaschaBanner);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=9)
	public void deleteSecondMaschaBanner() throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.SecondMaschaBanner);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=10)
	public void deleteFirstinsideAd() throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.FirstInsideAd);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=11)
	public void deleteFirstSecondAd() throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.SecondInsideAd);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=12)
	public void deleteBannerWithButton() throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.FirstBanner);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=13)
	public void deleteBannerWithOutButton() throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.SecondBanner);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=14)
	public void deleteStatistics() throws InterruptedException{
		driver.findElement(ele.ManageHomePageButton).click();
		driver.findElement(ele.ManageStatististsButton);
		WebElement table = driver.findElement(ele.StatisticsTable);
		util.editOrDelete("Delete",input.StatisticsName);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=15)
	public void deleteStanderedVideo() throws InterruptedException{
		driver.findElement(ele.ManageBannerButton).click();
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.StanderedVideo);
		util.clickOKButtonOnAlertBox();
	}
	
	@Test (priority=16)
	public void deleteFullVideo() throws InterruptedException{
		//driver.findElement(ele.ManageBannerButton).click();
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.FullVideo);
		util.clickOKButtonOnAlertBox();
	
	}
	
	@Test(priority=17)
	public void deleteGallery () throws InterruptedException{
		WebElement table = driver.findElement(ele.BannerTable);
		util.editOrDelete("Delete",input.Gallery);
		util.clickOKButtonOnAlertBox();
	}
	
	
	
	
	
	

}
