package demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo1.Driversclass;

public class Propertiesclass extends Driversclass{
	
	@FindBy(xpath="//*[@id=\"u_0_l\"]")public WebElement Firstname;
	@FindBy(xpath="//*[@id=\"u_0_n\"]")public WebElement lastname;
	@FindBy(xpath="//*[@id=\"u_0_q\"]")public WebElement phoneno;
	@FindBy(xpath="//*[@id=\"u_0_x\"]")public WebElement password;
	@FindBy(xpath="//*[@id=\"day\"]")public WebElement Day;
	@FindBy(xpath="//*[@id=\"month\"]")public WebElement month;
	@FindBy(xpath="//*[@id=\"year\"]")public WebElement year;
	@FindBy(xpath="//*[@id=\"u_0_11\"]/span[1]/label")public WebElement type;
	@FindBy(xpath="//*[@id=\"u_0_15\"]")public WebElement signup;
	
	public Propertiesclass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void UserLogin()
	{
		Firstname.sendKeys("ishithakhan");
		lastname.sendKeys("khan");
		phoneno.sendKeys("9640272999");
		password.sendKeys("Lovely@5566");
		Day.sendKeys("20");
		month.sendKeys("7");
		year.sendKeys("1994");
		type.click();
		signup.click();
	}
	}
	
	
	

