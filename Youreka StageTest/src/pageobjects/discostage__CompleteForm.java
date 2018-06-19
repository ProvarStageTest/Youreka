package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Discostage__ Complete Form"                                
               , summary=""
               , page="CompleteForm"
               , namespacePrefix="discostage"
               , object=""
               , connection="Stagetest"
     )             
public class discostage__CompleteForm {

	@TextType()
	@FindBy(css = ".control-group[data-question-text=\"3-Checkbox-List\"] div.slds-form-element.OR-form-element_width.formInput.answerValue.table-checkbox.undefined input[value=\"Tea\"] + span.slds-checkbox_faux")
	public WebElement _3_Checkbox_Tea;
	@TextType()
	@FindBy(css = ".control-group[data-question-text=\"3-Checkbox-List\"] div.slds-form-element.OR-form-element_width.formInput.answerValue.table-checkbox.undefined input[value=\"Coffee\"] + span.slds-checkbox_faux")
	public WebElement _3_Checkbox_Coffee;
	@TextType()
	@FindBy(css = ".control-group[data-question-text=\"3-Checkbox-List\"] div.slds-form-element.OR-form-element_width.formInput.answerValue.table-checkbox.undefined input[value=\"Soda\"] + span.slds-checkbox_faux")
	public WebElement _3_Checkbox_Soda;
	
	@ButtonType(file=true)
	@FindBy(xpath="//span[contains(@class, 'slds-file-selector__button')]")
	public WebElement Upload_Files_Button;
	
	@ButtonType()
	@FindBy(css = "#normalSaver")
	public WebElement Form_Save_Button;
	@TextType()
	@FindBy(css = "#formContent .control-group[ data-question-text=\"4-Currency\"] input.slds-input")
	public WebElement _4_CurrencyField;
	@TextType()
	@FindBy(css = ".control-group[data-question-text=\"9-E-Mail\"] input.slds-input")
	public WebElement _9_E_Mail_Field;
	@TextType()
	@FindBy(css = ".control-group[data-question-text=\"13-Percent\"] input.slds-input")
	public WebElement _13_Percent_Field;
	@TextType()
	@FindBy(css = ".control-group[data-question-text=\"11-Number\"] input.slds-input")
	public WebElement _11_Number;
	@TextType()
	@FindBy(css = ".control-group[data-question-text=\"14--Phone\"] input.slds-input")
	public WebElement _14_Phone_Field;
	@TextType()
	@FindBy(css = ".control-group[data-question-text=\"16-Url\"] input.slds-input")
	public WebElement _16_Url;
	@TextType()
	@FindBy(css = ".control-group[data-question-text=\"7-Date-Time\"] input.slds-input")
	public WebElement _7_Date_Time_Field;
	@TextType()
	@FindBy(css = ".control-group[data-question-text=\"1-Text\"] input.slds-input")
	public WebElement _1_Text_Field;
	@TextType()
	@FindBy(css = ".control-group[data-question-text=\"5-Date\"] input.slds-input")
	public WebElement _5_Date_Field;
	@TextType()
	@FindBy(css = "#formContent .control-group[data-question-text=\"12-Multi-Select-Pick\"] li.ui-widget-content.ui-selectee[data-option-value=\"Protein\"]")
	public WebElement Protein_MSPicklist;
	@TextType()
	@FindBy(css = "#formContent .control-group[data-question-text=\"12-Multi-Select-Pick\"]  li.ui-widget-content.ui-selectee[data-option-value=\"Carbs\"]")
	public WebElement Carbs_MSPicklist;
	@TextType()
	@FindBy(css = "#formContent .control-group[data-question-text=\"12-Multi-Select-Pick\"]  li.ui-widget-content.ui-selectee[data-option-value=\"Sugar\"]")
	public WebElement Sugar_MSPicklist;
	@TextType()
	@FindBy(css = "#formContent li.ui-widget-content.ui-selectee[data-option-value=\"Fat\"]")
	public WebElement Fat_MSPicklist;
	@TextType()
	@FindBy(css = "#formContent label.slds-radio input[type=\"radio\"][value=\"No\"]")
	public WebElement _15_Radio_Button_No;
	@TextType()
	@FindBy(css = "#formContent label.slds-radio input[type=\"radio\"][value=\"Yes\"]")
	public WebElement _15_Radio_Button_Yes;
	@TextType()
	@FindBy(css = "#formContent label.slds-radio input[type=\"radio\"][value=\"Maybe\"]")
	public WebElement _15_Radio_Button_Maybe;
	
	@ChoiceListType(values = { @ChoiceListValue(value = "Yes", title = "\n           \t\t\t\t\tYes\n       \t\t\t\t\t"),
	@ChoiceListValue(value = "No", title = "\n           \t\t\t\t\tNo\n       \t\t\t\t\t") })
	@FindBy(css = "#formContent div.control-group[data-question-text=\"17-YesNo\"] select.formInput.answerValue.slds-select option[value=\"Yes\"]")
	public WebElement _17_Yes_No__Yes;
	@ChoiceListType(values = { @ChoiceListValue(value = "Yes", title = "\n           \t\t\t\t\tYes\n       \t\t\t\t\t"),
	@ChoiceListValue(value = "No", title = "\n           \t\t\t\t\tNo\n       \t\t\t\t\t") })
	@FindBy(css = "#formContent div.control-group[data-question-text=\"17-YesNo\"] select.formInput.answerValue.slds-select option[value=\"No\"]")
	public WebElement _17_Yes_No__No;
	
	@TextType()
	@FindBy(css = "#formContent div.control-group[data-question-text=\"10-Long-Text\"] textarea.answerValue.slds-textarea")
	public WebElement _10_Long_Text;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "Blue", title = "\n           \t\t\t\t\tBlue\n       \t\t\t\t\t"),
			@ChoiceListValue(value = "Red", title = "\n           \t\t\t\t\tRed\n       \t\t\t\t\t"),
			@ChoiceListValue(value = "Yellow", title = "\n           \t\t\t\t\tYellow\n       \t\t\t\t\t"),
			@ChoiceListValue(value = "Green", title = "\n           \t\t\t\t\tGreen\n       \t\t\t\t\t") })
	@FindBy(css = "#formContent div.control-group[data-question-text=\"6-Picklist\"] select.formInput.answerValue.slds-select option[value=\"Blue\"]")
	public WebElement _6_Picklist_Blue;
		@ChoiceListType(values = {
			@ChoiceListValue(value = "Blue", title = "\n           \t\t\t\t\tBlue\n       \t\t\t\t\t"),
			@ChoiceListValue(value = "Red", title = "\n           \t\t\t\t\tRed\n       \t\t\t\t\t"),
			@ChoiceListValue(value = "Yellow", title = "\n           \t\t\t\t\tYellow\n       \t\t\t\t\t"),
			@ChoiceListValue(value = "Green", title = "\n           \t\t\t\t\tGreen\n       \t\t\t\t\t") })
	@FindBy(css = "#formContent div.control-group[data-question-text=\"6-Picklist\"] select.formInput.answerValue.slds-select option[value=\"Green\"]")
	public WebElement _6_Picklist_Green;
		@ChoiceListType(values = {
			@ChoiceListValue(value = "Blue", title = "\n           \t\t\t\t\tBlue\n       \t\t\t\t\t"),
			@ChoiceListValue(value = "Red", title = "\n           \t\t\t\t\tRed\n       \t\t\t\t\t"),
			@ChoiceListValue(value = "Yellow", title = "\n           \t\t\t\t\tYellow\n       \t\t\t\t\t"),
			@ChoiceListValue(value = "Green", title = "\n           \t\t\t\t\tGreen\n       \t\t\t\t\t") })
	@FindBy(css = "#formContent div.control-group[data-question-text=\"6-Picklist\"] select.formInput.answerValue.slds-select option[value=\"Yellow\"]")
	public WebElement _6_Picklist_Yellow;
		@ChoiceListType(values = {
			@ChoiceListValue(value = "Blue", title = "\n           \t\t\t\t\tBlue\n       \t\t\t\t\t"),
			@ChoiceListValue(value = "Red", title = "\n           \t\t\t\t\tRed\n       \t\t\t\t\t"),
			@ChoiceListValue(value = "Yellow", title = "\n           \t\t\t\t\tYellow\n       \t\t\t\t\t"),
			@ChoiceListValue(value = "Green", title = "\n           \t\t\t\t\tGreen\n       \t\t\t\t\t") })
	@FindBy(css = "#formContent div.control-group[data-question-text=\"6-Picklist\"] select.formInput.answerValue.slds-select option[value=\"Red\"]")
	public WebElement _6_Picklist_Red;
		@TextType()
		@FindBy(css = "canvas.jSignature")
		public WebElement _8_E_signature;
		@TextType()
		@FindBy(css = ".control-group[data-question-text=\"8-E-Signature\"] div.slds-form-element.OR-form-element_width.sig-answer-container.js-sig-answer.sig-empty")
		public WebElement _8_E_Signature_Field;
	
		@ButtonType()
		@FindBy(css = "button.slds-button.slds-button_brand.js-sig-save")
		public WebElement E_Signature_Save;
	}
