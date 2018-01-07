package Checks;

import org.openqa.selenium.By;

import BasePackage.DriverClass;

public class Elements extends DriverClass{
	
	public By Email = By.id("form_username_email");
	public By Password = By.id("form_password");
	public By SignInButton = By.xpath("//button[@class='btn btn-primary']");
	public By EmailValidation = By.id("email_validation");
	public By PasswordValidation = By.id("password_validation");
	public By BannerListButton = By.xpath("//a[@class='tab_1_1']");
	public By AddBannerButtton = By.xpath("//a[@class='tab_1_2']");
	public By Title = By.xpath("//input[@formcontrolname='title']");
	public By Subtitle = By.xpath("//input[@formcontrolname='sub_title']");
	public By SelectType = By.xpath("//select[@formcontrolname='type']");
	public By SelectBannerType = By.xpath(" //select[@formcontrolname='position']");
	public By URL = By.xpath("//input[@formcontrolname='url']");
	public By SelectTarget = By.xpath(" //select[@formcontrolname='target']");
	public By ExpandableURL = By.xpath("//input[@formcontrolname='expandable_url']");
	public By ExpandableText = By.xpath(" //input[@formcontrolname='expandable_text']");
	public By ExpandaImageUploadButton = By.xpath("//label[@for='banner_expandable_image_upload']");
	public By ButtonURL = By.xpath("//input[@formcontrolname='button_url']");
	public By ButtonText = By.xpath("//input[@formcontrolname='button_text']");
	public By Description = By.xpath("//input[@id='banners_description']");
	public By SelectYear = By.xpath("//select[@formcontrolname='year']");
	public By SelectPriority = By.xpath("//select[@formcontrolname='priority']");
	public By SelectStatus = By.xpath(" //select[@formcontrolname='status']");
	public By UploadImageButton = By.xpath("//label[@for='banner_image_upload']");
	public By SubmitButton = By.id("register_btn");
	public By BackButton = By.id("meet_back_btn");
	public By ManageBannerButton = By.xpath(".//*[@id='managebanners']/a");
	public By ManageHomePageButton = By.xpath(".//*[@id='homepage']/a ");
	public By ManageStatististsButton = By.xpath(".//*[@id='homepage']/ul/li[1]/a");
	public By ManageTypeBUtton = By.xpath(".//*[@id='homepage']/ul/li[2]/a");
	public By StatisticsList = By.xpath("//a[@class='tab_1_1']");
	public By AddStaticButton = By.xpath("//a[@class='tab_1_2']");
	public By StatisticsName = By.xpath("//input[@formcontrolname='name']");
	public By StatisticsIcon = By.xpath(" //input[@formcontrolname='image']");
	public By StatisticsCount = By.xpath("//input[@formcontrolname='count']");
	public By Search = By.xpath("//input[@type='search']");
	public By Entries = By.xpath("//select[@name='bannerstable_length']");
	public By Delete = By.xpath("//a[@class='delete_banner ']");
	public By Edit = By.xpath("//a[@class='edit_banner ']");
	public By StatisticsTable = By.xpath("//table[@id='statisticsstable']");
	public By BannerTable = By.xpath("//table[@id='bannerstable']");
	
	
	

}
