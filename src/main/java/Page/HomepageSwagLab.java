package Page;

import java.awt.Button;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import KeywordLab.KeywordsSwagLab;

public class HomepageSwagLab {
	//xpath for titles of product
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	public WebElement bagImage;

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	public WebElement bikeLight;

	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	public WebElement boltTShirt;

	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	public WebElement fleeceJacket;

	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
	public WebElement onesies;

	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
	public WebElement tShirtRed;  
	
	@FindBy(xpath="//select[@class=\"product_sort_container\"]")                //xpath of dropdownlist
	public WebElement dropDownList;
	
	
	@FindBy(xpath="//button[text()='ADD TO CART']")                         //xpath for addto cart
	public WebElement bagImageAddToCart;
	@FindBy(xpath="//button[text()='<- Back']")                             //xpath for back button
	public WebElement backbagImage;
	@FindBy(xpath= "//button[@class=\"btn_secondary btn_inventory\"]"  )                                                     //xpathfor remove
    public WebElement RemovebagImage;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")                           //xpath for addtocart
	public WebElement bikeLightAddToCart;                                    
	@FindBy(xpath="//button[text()='<- Back']")                               //xpath for back
	public WebElement backbikeLight;
//	@FindBy(xpath="//button[@class=\"btn_secondary btn_inventory\"]")         //xpathfor remove
//	public WebElement RemovebikeLight;
	
	
	@FindBy(xpath="//button[text()='ADD TO CART']")                            //xpathfor addtocart
	public WebElement boltTShirtAddToCart;                                   
	@FindBy(xpath="//button[text()='<- Back']")                                //xpath for back
	public WebElement backboltTShirt;
//	@FindBy(xpath="//button[@class=\\\"btn_secondary btn_inventory\\\"]")      //xpathfor remove
//  public WebElement RemoveboltTShirt;
	
	
	
	@FindBy(xpath="//button[text()='ADD TO CART']")                             //xpathfor addtocart
	public WebElement fleeceJacketAddToCart;                                 
	@FindBy(xpath="//button[text()='<- Back']")                                 //xpath for back
	public WebElement backfleeceJacket;
//	@FindBy(xpath="//button[@class=\\\"btn_secondary btn_inventory\\\"]")       //xpathfor remove
//	public WebElement RemovefleeceJacket;
	
	
	 
	@FindBy(xpath="//button[text()='ADD TO CART']")                              //xpathfor addtocart
	public WebElement onesiesAddToCart;                                      
	@FindBy(xpath="//button[text()='<- Back']")                                 //xpath for back
	public WebElement backonesies;
//	@FindBy(xpath="//button[@class=\\\"btn_secondary btn_inventory\\\"]")        //xpathfor remove
//	public WebElement Removeonesies;
	
	
	
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	public WebElement tShirtRedAddToCart;                                       //xpathfor addtocart
	@FindBy(xpath="//button[text()='<- Back']")                                  //xpath for back
	public WebElement backtShirtRed;
//	@FindBy(xpath="//button[@class=\\\"btn_secondary btn_inventory\\\"]")
//	public WebElement RemovetShirtRed;
	
	
	public HomepageSwagLab() {
		PageFactory.initElements(KeywordsSwagLab.getDriver(), this);

	}

	public void clickOnBagImage(Object driver) {
		bagImage.click();

		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(6000));
		wait.withMessage("waited to long but didnt appar");
		ArrayList exceptions = new ArrayList<Exception>();
		exceptions.add(NoSuchElementException.class);
		exceptions.add(IllegalArgumentException.class);
		wait.ignoreAll(exceptions);
		bagImageAddToCart.click();
	   // RemovebagImage.click();
	    //backbagImage.click();
	    
	}
	
	 public void selectDropDownList() {
		 dropDownList.click();
		 
		 Select select = new Select(dropDownList);
		 select.selectByVisibleText("Name (Z to A)");
	 }

	public void clickOnBikeLight(Object driver) {
		bikeLight.click();

		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.withMessage("waited to long but didnt appar");
		ArrayList exceptions = new ArrayList<Exception>();
		exceptions.add(NoSuchElementException.class);
		exceptions.add(IllegalArgumentException.class);
		wait.ignoreAll(exceptions);
		bikeLightAddToCart.click();
	//	backbikeLight.click();
	//	RemovebikeLight.click();
	}

	public void clickOnBoltTShirt(Object driver) {
		boltTShirt.click();
		FluentWait wait =new FluentWait(driver);
		 wait.withTimeout(Duration.ofSeconds(15));
		 wait.pollingEvery(Duration.ofMillis(1000));
		 wait.withMessage("waited to long but didnt appar");
		 ArrayList exceptions = new ArrayList<Exception>();
			exceptions.add(NoSuchElementException.class);
			exceptions.add(IllegalArgumentException.class);
			wait.ignoreAll(exceptions);
			boltTShirtAddToCart.click();
			 backboltTShirt.click();
		//	 RemoveboltTShirt.click();
	}

	public void clickOnFleeceJacket(Object driver) {
		fleeceJacket.click();

		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.withMessage("waited to long but didnt appar");
		ArrayList exceptions = new ArrayList<Exception>();
		exceptions.add(NoSuchElementException.class);
		exceptions.add(IllegalArgumentException.class);
		wait.ignoreAll(exceptions);
		fleeceJacketAddToCart.click();
		backfleeceJacket.click();
	//	RemovefleeceJacket.click();
		
	}

	public void clickOnOnesies(Object driver) {
		onesies.click();

		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.withMessage("waited to long but didnt appar");
		ArrayList exceptions = new ArrayList<Exception>();
		exceptions.add(NoSuchElementException.class);
		exceptions.add(IllegalArgumentException.class);
		wait.ignoreAll(exceptions);
		onesiesAddToCart.click();
		backonesies.click();
	//	Removeonesies.click();
	}

	public void clickOnTShirtRed(Object driver) {
		tShirtRed.click();

		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.withMessage("waited to long but didnt appar");
		ArrayList exceptions = new ArrayList<Exception>();
		exceptions.add(NoSuchElementException.class);
		exceptions.add(IllegalArgumentException.class);
		wait.ignoreAll(exceptions);
		tShirtRedAddToCart.click();
		backtShirtRed.click();
	//	RemovetShirtRed.click();

	}
}
