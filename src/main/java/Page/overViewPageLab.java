package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import KeywordLab.KeywordsSwagLab;

public class overViewPageLab {
	@FindBy(xpath = "//input[@class=\"btn_primary cart_button\"]")
	public WebElement Continue;

	public overViewPageLab() {
		PageFactory.initElements(KeywordsSwagLab.getDriver(), this);

	}
	public void clickonContinue() {
		Continue.click();
	}

}
