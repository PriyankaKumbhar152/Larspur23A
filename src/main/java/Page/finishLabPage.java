package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import KeywordLab.KeywordsSwagLab;

public class finishLabPage {


	@FindBy(xpath="//a[@class=\"btn_action cart_button\"]")          //xpathforfinish
	public  WebElement Finish;
	
	@FindBy(xpath="//div[@class=\"complete-text\"]")            //xpathforgetmessage
	public static WebElement getMessage;
	
	public finishLabPage() {
		PageFactory.initElements(KeywordsSwagLab.getDriver(), this);
	}
	public void clickonfinish(Object driver) {
      Finish.click();
	}
	public static String finishPageGetMessage(String text) {
     return getMessage.getText();
	}
}


