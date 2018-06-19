package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Discostage__ New Form Wizard"                                
               , summary=""
               , page="NewFormWizard"
               , namespacePrefix="discostage"
               , object="discostage__Form__c"
               , connection="Stagetest"
     )             
public class discostage__NewFormWizard {

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-card\")]/div[2]/div[1]/dl/dd/span/a")
	public WebElement CoffeeCountLookup;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-card__body\")]/div[2]/dl/dd/span/a")
	public WebElement CoffeeProductsLookup;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-card__body\")]/div[3]/dl/dd/span/a")
	public WebElement Form_Account_Lookup;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-card__body\")]/div[4]/dl/dd/span/a")
	public WebElement Form_Contact_Field;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-card__body\")]/div[5]/dl/dd/span/a")
	public WebElement Form_Lead_Field;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-card__body\")]/div[6]/dl/dd/span/a")
	public WebElement Form_Opportunity_Field;
	@ButtonType()
	@FindBy(css = "button.slds-button.slds-button--brand")
	public WebElement completeTheNewForm;
	
}
