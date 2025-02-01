package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import KeywordLab.KeywordsSwagLab;

public class checkOutLabPage {

	@FindBy(xpath="//a[@class=\"btn_action checkout_button\"]")                      //xpathofcheckoutbutton
	public WebElement checkOut;
	
	@FindBy(css="input#first-name")                                         //xpathoffirstname
	public WebElement Firstname;
	
	@FindBy(css="input#last-name")
	public WebElement Lastname;                                             //xpathoflastname
	
	@FindBy(css="input#postal-code")
	public WebElement Zipcode;                                                  //xpathofzipcode
	
	
	public checkOutLabPage() {
		PageFactory.initElements(KeywordsSwagLab.getDriver(), this);
	}
	public void clickonCheckOutPage(Object driver) {
		checkOut.click();
	}
	public void clickonFirstname(String text) {
       Firstname.sendKeys(text);
	}
	public void clickonLastname(String text) {
       Lastname.sendKeys(text);
	}
	public void clickOnZipcode(String text) {
       Zipcode.sendKeys(text);
	}
		
	
	
		
	

}
