package Checks;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BasePackage.DriverClass;


public class AddBanner extends DriverClass{
	Elements ele = new Elements ();
	InputValues input = new InputValues();
	Utility util = new Utility ();
	
	
	@Test(priority=1)
	public void login () throws InterruptedException{
		driver.findElement(ele.Email).sendKeys(input.email);
		driver.findElement(ele.Password).sendKeys(input.password);
		driver.findElement(ele.SignInButton).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	
	public void addFirstCommercialAd() throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.Firstcommercelad);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Commercial Ads (380 x 200)");
		driver.findElement(ele.URL).sendKeys("www.swimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "1");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
		
	
	}
	
	@Test(priority=3)
	public void addSecondCommercialAd () throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.Secondcommercelad);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Commercial Ads (380 x 200)");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "2");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
	}
	
	@Test(priority=4)
	public void addFirstFooterAd () throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.FirstFooterAd);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Footer Sliding Ads (120 * 60)");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "1");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
	}
	
	@Test(priority=5)
	public void addThirdFooterAd() throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.SecondFooterAd);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Footer Sliding Ads (120 * 60)");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "2");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
	}
	
	@Test(priority=6)
	public void addPOPUpbanner() throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.poPUpBanner);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Popup Banner (700 x 358)");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "2");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
	}
	
	@Test(priority=7)
	public void addFirstPartner () throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.FirstPartners);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Partners (300 x 135)");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "1");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
	}
	
	@Test(priority=8)
	public void addSecondpartner () throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.SecondPartner);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Partners (300 x 135)");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "2");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		driver.findElement(ele.SubmitButton).click();
	}

	@Test(priority=9)
	public void addFirstMashaBanner () throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.FirstMaschaBanner);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Mascha Banner (1075 x 400)");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "1");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
	}
	
	@Test(priority=10)
	public void addSecondMashaBanner () throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.SecondMaschaBanner);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Mascha Banner (1075 x 400)");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "2");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
	}
	

	@Test(priority=9)
	public void addFirstInsideAd () throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.FirstInsideAd);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Inside Ads (360 x 270)");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "1");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
	}
	
	@Test(priority=11)
	public void addSecondInsideAd () throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.SecondInsideAd);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Inside Ads (360 x 270)");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "2");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
	}
	
	@Test(priority=12)
	public void addBannerWithButton () throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.FirstBanner);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Banners (1920 x 1280)");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.ButtonURL).sendKeys("www.swimindia.in");
		driver.findElement(ele.ButtonText).sendKeys(input.FirstBannerText);
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "1");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
	}
	@Test(priority=13)
	public void addBannerWithoutButton () throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.SecondBanner);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Banners (1920 x 1280)");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.ButtonURL).sendKeys("www.swimindia.in");
		driver.findElement(ele.ButtonText).sendKeys(input.FirstBannerText);
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "2");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		driver.findElement(ele.SubmitButton).click();
	}
	
	@Test(priority=14)
	public void addFirstExpandableAd () throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.FirstAd);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Ads (Expandable - 1075 x 400 and small ads - 385x190 )");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.ButtonURL).sendKeys("www.swimindia.in");
		driver.findElement(ele.ButtonText).sendKeys(input.FirstBannerText);
		driver.findElement(ele.ExpandableURL).sendKeys("www.swimindia.in");
		driver.findElement(ele.ExpandableText).sendKeys("Test");
		driver.findElement(ele.ExpandaImageUploadButton).click();
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "1");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
	}
	
	@Test(priority=15)
	public void addSecondAdWithoutExpandable () throws IOException, InterruptedException{
		driver.findElement(ele.AddBannerButtton).click();
		driver.findElement(ele.Title).sendKeys(input.SecondAd);
		driver.findElement(ele.Subtitle).sendKeys("Subtitle ");
		WebElement type = driver.findElement(ele.SelectType);
		WebElement bannerType = driver.findElement(ele.SelectBannerType);
		WebElement target = driver.findElement(ele.SelectTarget);
		WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(type, "Image");
		util.selectValueByVisibleText(bannerType, "Ads (Expandable - 1075 x 400 and small ads - 385x190 )");
		driver.findElement(ele.URL).sendKeys("www.wimindia.in");
		util.selectValueByVisibleText(target, "New Tab");
		driver.findElement(ele.ButtonURL).sendKeys("www.swimindia.in");
		driver.findElement(ele.ButtonText).sendKeys(input.FirstBannerText);
		driver.findElement(ele.ExpandableURL).sendKeys("www.swimindia.in");
		driver.findElement(ele.ExpandableText).sendKeys("Test");
		driver.findElement(ele.ExpandaImageUploadButton).click();
		driver.findElement(ele.Description).sendKeys("dsgdsg");
		util.selectValueByVisibleText(priority, "2");
		util.selectValueByVisibleText(status, "ACTIVE");
		driver.findElement(ele.UploadImageButton).click();
		util.uploadImages(input.imager);
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
	}
	
	@Test(priority=16)
	public void addStatistics () throws InterruptedException{
		driver.findElement(ele.ManageHomePageButton).click();
		driver.findElement(ele.ManageStatististsButton).click();
		driver.findElement(ele.AddStaticButton).click();
		driver.findElement(ele.Title).sendKeys("dfdds");
		driver.findElement(ele.StatisticsName).sendKeys(input.StatisticsName);
		driver.findElement(ele.StatisticsIcon).sendKeys(input.StatisticsIcon);
		driver.findElement(ele.URL).sendKeys("www.swimindia.in");
		driver.findElement(ele.StatisticsCount).sendKeys("1");
		WebElement target = driver.findElement(ele.SelectTarget);
		//WebElement year = driver.findElement(ele.SelectYear);
		WebElement priority = driver.findElement(ele.SelectPriority);
		WebElement status = driver.findElement(ele.SelectStatus);
		util.selectValueByVisibleText(target, "New Tab");
		util.selectValueByVisibleText(priority, "4");
		util.selectValueByVisibleText(status, "ACTIVE");
		Thread.sleep(2000);
		driver.findElement(ele.SubmitButton).click();
		
	}	
	
}
