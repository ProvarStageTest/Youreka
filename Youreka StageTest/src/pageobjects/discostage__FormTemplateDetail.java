package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Discostage__ Form Template Detail"                                
               , summary=""
               , page="FormTemplateDetail"
               , namespacePrefix="discostage"
               , object="discostage__Form_Template__c"
               , connection="Stagetest"
     )             
public class discostage__FormTemplateDetail {

	@ButtonType()
	@FindBy(css = "button.slds-button.slds-button_icon-more")
	public WebElement Form_Template_Gear_Button;
	@LinkType()
	@FindBy(css = "li.slds-dropdown__item.slds-show a")
	public WebElement Form_Template_Publish_Button;
	@ButtonType()
	@FindBy(css = "button.button-centered.slds-button.slds-button_brand.slds-show")
	public WebElement New_Form_Button;
	
}
