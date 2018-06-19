package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Discostage__ TB_ Simple Discovery Rules"                                
               , summary=""
               , page="TB_SimpleDiscoveryRules"
               , namespacePrefix="discostage"
               , object=""
               , connection="Stagetest"
     )             
public class discostage__TB_SimpleDiscoveryRules {

	@TextType()
	@FindBy(xpath = "//*[@id=\"available-questions\"]/li[1]/div[2]")
	public WebElement Simple_Discovery_Drag;
	@TextType()
	@FindBy(css = "ul.discovery-list.list-group.ui-sortable")
	public WebElement Simple_Discovery_Drop_Field;
	
}
