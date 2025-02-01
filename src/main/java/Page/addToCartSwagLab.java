package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import KeywordLab.KeywordsSwagLab;

public class addToCartSwagLab extends HomepageSwagLab{
	
	@FindBy(css="svg[class='svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ']")     //addtocart button
	public WebElement addToCart;
	
	@FindBy(css="a[class='btn_secondary']")                                     //xpath for continue button                         
	public WebElement continueShooping;
	
	public addToCartSwagLab() {
		PageFactory.initElements(KeywordsSwagLab.getDriver(), this);
		
	}
	public void checkAddListBagImage(Object Driver){
		 addToCart.click();
	}
	 public void checkAdddListBikeLight(Object Driver) {
		 addToCart.click();
	 }
	 public void checkAdddListBoldTShirt(Object Driver) {
		 addToCart.click();
	 }
	 public void checkAdddListFleeceJacket(Object Driver) {
		 addToCart.click();
	 }
	 public void checkAdddListOnesies(Object Driver) {
			 addToCart.click();
	 }
	 public void checkAdddListTShirtRed(Object Driver) {
			 addToCart.click();
}
}
