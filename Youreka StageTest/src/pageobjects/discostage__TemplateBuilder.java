package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Discostage__ Template Builder"                                
               , summary=""
               , page="TemplateBuilder"
               , namespacePrefix="discostage"
               , object=""
               , connection="Stagetest"
     )             
public class discostage__TemplateBuilder {
// FORM TEMPLATE NAME FIELD
	@TextType()
	@FindBy(css = "#formTemplateName")
	public WebElement Form_Template_Name_Field;
	
// TEMPLATE PROPERTIES OKAY BUTTON
	@ButtonType()
	@FindBy(css = "button.questionModalSave.slds-button.slds-button_neutral.slds-button_brand")
	public WebElement Template_Properties_Okay_Button;
	
// SECTION DROPPABLE OBJECT
	@ButtonType()
	@FindBy(css = "div.OR-button__draggable.slds-button.slds-button_neutral.OR-draggable_background.newSection")
	public WebElement Section_Droppable_Objects;
	

// SECTION NAME EDIT FIELD
	@TextType()
	@FindBy(css = "#sectionName") 
	public WebElement Section_Name_Edit_Field;
	
// SECTION SAVE BUTTON	
	@ButtonType()
	@FindBy(css = "button.questionModalSave.slds-button.slds-button_neutral.slds-button_brand")
	public WebElement Section_Save_Button;
	
// QUESTION DROPPABLE OBJECT	
	@ButtonType()
	@FindBy(css = "div.OR-button__draggable.slds-button.slds-button_neutral.OR-draggable_background.newQuestion")
	public WebElement Question_Droppable_Object;
	
// SECTION DROP AREAS 	
	@TextType()
	@FindBy(css = "ul.section-list.list-group.ui-sortable")
	public WebElement Section_Drop_Area;
	
	@TextType()
	@FindBy(css = "ul li[data-section-name=\"A\"]")
	public WebElement Section_A_Question_Drop_Area;
	
	@TextType()
	@FindBy(css = "ul li[data-section-name=\"B\"]")
	public WebElement Section_B_Question_Drop_Area;
	
	@TextType()
	@FindBy(css = "ul li[data-section-name=\"C\"]")
	public WebElement Section_C_Question_Drop_Area;

// QUESTION TEXT EDIT FIELD	
	@TextType()
	@FindBy(css = "#question-name-input")
	public WebElement Question_Text_Edit_Field;
	
//	QUESTION SAVE BUTTON
	@ButtonType()
	@FindBy(css = "button.questionModalSave.slds-button.slds-button_neutral.slds-button_brand")
	public WebElement Question_Save_Button;
	
// ADD NEW CHECKBOX VALUE
	@ButtonType()
	@FindBy(css = "#addAnotherValue")
	public WebElement Checkbox_Add_Another_Value;
	
//	List Option: 1	
	@TextType()
	@FindBy(css = "#edit_question_option_0")
	public WebElement List_Option_1;
	
//	List Option: 2
	@TextType()
	@FindBy(css = "#edit_question_option_1")
	public WebElement List_Option_2;
	
// List Option: 3
	@TextType()
	@FindBy(css = "#edit_question_option_2")
	public WebElement List_Option_3;
	
// List Option: 4
	@TextType()
	@FindBy(css = "#edit_question_option_3")
	public WebElement List_Option_4;
	
	
// CURRENCY: NUMBER OF INTEGER PLACES	
	@TextType()
	@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required input.slds-input[name=\"editIntegerLength\"]")
	public WebElement Currency_Number_of_Integer_Places;
	
// CURRENCY: NUMBER OF DECIMAL PLACES
	@TextType()
	@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required input.slds-input[name=\"editDecimalLength\"]")
	public WebElement Currency_Number_of_Decimal_Places;
	
// TEMPLATE BUILDER SAVE BUTTON	
	@ButtonType()
	@FindBy(css = "#quickSaveBtn")
	public WebElement Template_Builder_Save_Button;
	
// TEMPLAT BUILDER CLOSE BUTTON	
	@ButtonType()
	@FindBy(css = "#closeBtn")
	public WebElement Template_Builder_Close_Button;
		
// DROP DOWN QUESTION TYPE
		@ChoiceListType(values = { @ChoiceListValue(value = "string:Attachment/Photo", title = "Attachment/Photo"),
			@ChoiceListValue(value = "string:Checkbox List", title = "Checkbox List"),
			@ChoiceListValue(value = "string:Currency", title = "Currency"),
			@ChoiceListValue(value = "string:Date", title = "Date"),
			@ChoiceListValue(value = "string:Date/Time", title = "Date/Time"),
			@ChoiceListValue(value = "string:E-Signature", title = "E-Signature"),
			@ChoiceListValue(value = "string:Email", title = "Email"),
			@ChoiceListValue(value = "string:Field Link", title = "Field Link"),
			@ChoiceListValue(value = "string:Long Text", title = "Long Text"),
			@ChoiceListValue(value = "string:Multi-select Picklist", title = "Multi-select Picklist"),
			@ChoiceListValue(value = "string:Number", title = "Number"),
			@ChoiceListValue(value = "string:Percent", title = "Percent"),
			@ChoiceListValue(value = "string:Phone", title = "Phone"),
			@ChoiceListValue(value = "string:Picklist", title = "Picklist"),
			@ChoiceListValue(value = "string:Radio Button List", title = "Radio Button List"),
			@ChoiceListValue(value = "string:Text", title = "Text"),
			@ChoiceListValue(value = "string:URL", title = "URL"),
			@ChoiceListValue(value = "string:Yes/No", title = "Yes/No") })
	@FindBy(css = "span.slds-form-element.slds-is-required.slds-m-top_x-small.slds-col.slds-size_1-of-1 select.slds-select")
	public WebElement Question_Type_Drop_Down;

// NEW SECTION BUTTON
		@ButtonType()
		@FindBy(css = "div.OR-button__draggable.slds-button.slds-button_neutral.OR-draggable_background.newSection.attention-animation")
		public WebElement NewSection;
		
// FIELD LINK LOOKUPS AND FIELD LINK FIELDS
		@ChoiceListType(values = { @ChoiceListValue(value = "string:Account__c", title = "Account"),
				@ChoiceListValue(value = "string:AccountId", title = "Account ID"),
				@ChoiceListValue(value = "string:Account_plus_Name__c", title = "Account_plus_Name"),
				@ChoiceListValue(value = "string:Age_formula__c", title = "Age formula"),
				@ChoiceListValue(value = "string:AssistantName", title = "Assistant's Name"),
				@ChoiceListValue(value = "string:AssistantPhone", title = "Asst. Phone"),
				@ChoiceListValue(value = "string:Birthdate", title = "Birthdate"),
				@ChoiceListValue(value = "string:Fax", title = "Business Fax"),
				@ChoiceListValue(value = "string:Phone", title = "Business Phone"),
				@ChoiceListValue(value = "string:checkbox_formula__c", title = "checkbox formula"),
				@ChoiceListValue(value = "string:Description", title = "Contact Description"),
				@ChoiceListValue(value = "string:currency__c", title = "currency"),
				@ChoiceListValue(value = "string:Jigsaw", title = "Data.com Key"),
				@ChoiceListValue(value = "string:Date__c", title = "Date"),
				@ChoiceListValue(value = "string:Date_Formula__c", title = "Date Formula"),
				@ChoiceListValue(value = "string:date_time__c", title = "date/time"),
				@ChoiceListValue(value = "string:Date_time_Formula__c", title = "Date/time Formula"),
				@ChoiceListValue(value = "string:Deep_link_test__c", title = "Deep link test"),
				@ChoiceListValue(value = "string:deep_link_test_2_formula__c", title = "deep link test 2 formula"),
				@ChoiceListValue(value = "string:Department", title = "Department"),
				@ChoiceListValue(value = "string:Email", title = "Email"),
				@ChoiceListValue(value = "string:EmailBouncedDate", title = "Email Bounced Date"),
				@ChoiceListValue(value = "string:EmailBouncedReason", title = "Email Bounced Reason"),
				@ChoiceListValue(value = "string:Error_Global_Picklist__c", title = "Error Global Picklist"),
				@ChoiceListValue(value = "string:Error_Picklist_Restrict__c", title = "Error Picklist Restrict"),
				@ChoiceListValue(value = "string:error__c", title = "error picklist non restrict"),
				@ChoiceListValue(value = "string:FL_CHECKBOX__c", title = "FL CHECKBOX"),
				@ChoiceListValue(value = "string:FL_MSPICKLIST__c", title = "FL MSPICKLIST"),
				@ChoiceListValue(value = "string:FirstName", title = "First Name"),
				@ChoiceListValue(value = "string:First_Name_has_Truth__c", title = "First Name has Truth"),
				@ChoiceListValue(value = "string:Formula_CB__c", title = "Formula CB"),
				@ChoiceListValue(value = "string:Full_Name1__c", title = "Full Name1"),
				@ChoiceListValue(value = "string:full_name__c", title = "full name"),
				@ChoiceListValue(value = "string:Global_Picklist__c", title = "Global Picklist"),
				@ChoiceListValue(value = "string:HomePhone", title = "Home Phone"),
				@ChoiceListValue(value = "string:InformalName", title = "Informal Name"),
				@ChoiceListValue(value = "string:Languages__c", title = "Languages"),
				@ChoiceListValue(value = "string:LastName", title = "Last Name"),
				@ChoiceListValue(value = "string:LeadSource", title = "Lead Source"),
				@ChoiceListValue(value = "string:LeveL__c", title = "LeveL"),
				@ChoiceListValue(value = "string:Long_Picklist__c", title = "Long Picklist"),
				@ChoiceListValue(value = "string:long_text_256_chars__c", title = "long text 256 chars"),
				@ChoiceListValue(value = "string:MailingCity", title = "Mailing City"),
				@ChoiceListValue(value = "string:MailingCountryCode", title = "Mailing Country Code"),
				@ChoiceListValue(value = "string:MailingStateCode", title = "Mailing State/Province Code"),
				@ChoiceListValue(value = "string:MailingStreet", title = "Mailing Street"),
				@ChoiceListValue(value = "string:MailingPostalCode", title = "Mailing Zip/Postal Code"),
				@ChoiceListValue(value = "string:MiddleName", title = "Middle Name"),
				@ChoiceListValue(value = "string:MobilePhone", title = "Mobile Phone"),
				@ChoiceListValue(value = "string:Number__c", title = "Number"),
				@ChoiceListValue(value = "string:OtherCity", title = "Other City"),
				@ChoiceListValue(value = "string:OtherCountryCode", title = "Other Country Code"),
				@ChoiceListValue(value = "string:OtherPhone", title = "Other Phone"),
				@ChoiceListValue(value = "string:OtherStateCode", title = "Other State/Province Code"),
				@ChoiceListValue(value = "string:OtherStreet", title = "Other Street"),
				@ChoiceListValue(value = "string:OtherPostalCode", title = "Other Zip/Postal Code"),
				@ChoiceListValue(value = "string:PERCENT__c", title = "PERCENT"),
				@ChoiceListValue(value = "string:PICKLIST__c", title = "PICKLIST"),
				@ChoiceListValue(value = "string:Percent_formula__c", title = "Percent formula"),
				@ChoiceListValue(value = "string:picklist_with_comma__c", title = "picklist with comma"),
				@ChoiceListValue(value = "string:ReportsToId", title = "Reports To ID"),
				@ChoiceListValue(value = "string:Salutation", title = "Salutation"),
				@ChoiceListValue(value = "string:Short_Text__c", title = "Short Text"),
				@ChoiceListValue(value = "string:TEXT__c", title = "TEXT"),
				@ChoiceListValue(value = "string:Title", title = "Title"),
				@ChoiceListValue(value = "string:Total_amount__c", title = "Total amount"),
				@ChoiceListValue(value = "string:Work_Order_lookup__c", title = "Work Order lookup") })
		@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[name=\"editFieldLinkField\"]")
		public WebElement Field_Link_Field_Contact;

		@TextType()
		@FindBy(css = "ul.section-list.list-group.ui-sortable")
		public WebElement NewDrop;
		@ChoiceListType(values = { @ChoiceListValue(value = "object:357", title = "Account__c"),
				@ChoiceListValue(value = "object:358", title = "Asset__c"),
				@ChoiceListValue(value = "object:359", title = "Coffee_Count__c"),
				@ChoiceListValue(value = "object:360", title = "Coffee_Products__c"),
				@ChoiceListValue(value = "object:361", title = "Contact__c"),
				@ChoiceListValue(value = "object:362", title = "Contract__c"),
				@ChoiceListValue(value = "object:363", title = "discostage__Form_Account__c"),
				@ChoiceListValue(value = "object:364", title = "discostage__Form_Case__c"),
				@ChoiceListValue(value = "object:365", title = "discostage__Form_Contact__c"),
				@ChoiceListValue(value = "object:366", title = "discostage__Form_Lead__c"),
				@ChoiceListValue(value = "object:367", title = "discostage__Form_Opportunity__c"),
				@ChoiceListValue(value = "object:368", title = "Lead__c"),
				@ChoiceListValue(value = "object:369", title = "New__c"),
				@ChoiceListValue(value = "object:370", title = "NewObject__c"),
				@ChoiceListValue(value = "object:371", title = "Opportunity__c"),
				@ChoiceListValue(value = "object:372", title = "order__c"),
				@ChoiceListValue(value = "object:373", title = "Order_Product__c"),
				@ChoiceListValue(value = "object:374", title = "Product__c"),
				@ChoiceListValue(value = "object:375", title = "Quote__c"),
				@ChoiceListValue(value = "object:376", title = "Quote_Line_Item__c"),
				@ChoiceListValue(value = "object:377", title = "self"),
				@ChoiceListValue(value = "object:378", title = "Solution__c"),
				@ChoiceListValue(value = "object:379", title = "spid__c"),
				@ChoiceListValue(value = "object:380", title = "test__c"),
				@ChoiceListValue(value = "object:381", title = "testing_object__c"),
				@ChoiceListValue(value = "object:382", title = "tests__c"),
				@ChoiceListValue(value = "object:383", title = "tt__c"),
				@ChoiceListValue(value = "object:384", title = "User__c"),
				@ChoiceListValue(value = "object:385", title = "WorkOrder__c") })
		@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[name=\"editFieldLinkLookup\"]")
		public WebElement Field_Link_Lookup_Account;

		@ChoiceListType(values = { @ChoiceListValue(value = "string:Description", title = "Account Description"),
				@ChoiceListValue(value = "string:Fax", title = "Account Fax"),
				@ChoiceListValue(value = "string:Name", title = "Account Name"),
				@ChoiceListValue(value = "string:AccountNumber", title = "Account Number"),
				@ChoiceListValue(value = "string:Phone", title = "Account Phone"),
				@ChoiceListValue(value = "string:Rating", title = "Account Rating"),
				@ChoiceListValue(value = "string:Site", title = "Account Site"),
				@ChoiceListValue(value = "string:AccountSource", title = "Account Source"),
				@ChoiceListValue(value = "string:Type", title = "Account Type"),
				@ChoiceListValue(value = "string:Active__c", title = "Active"),
				@ChoiceListValue(value = "string:AnnualRevenue", title = "Annual Revenue"),
				@ChoiceListValue(value = "string:BillingCity", title = "Billing City"),
				@ChoiceListValue(value = "string:BillingCountryCode", title = "Billing Country Code"),
				@ChoiceListValue(value = "string:BillingStateCode", title = "Billing State/Province Code"),
				@ChoiceListValue(value = "string:BillingStreet", title = "Billing Street"),
				@ChoiceListValue(value = "string:BillingPostalCode", title = "Billing Zip/Postal Code"),
				@ChoiceListValue(value = "string:CHECKBOX__c", title = "CHECKBOX"),
				@ChoiceListValue(value = "string:Coffee_Count__c", title = "Coffee Count"),
				@ChoiceListValue(value = "string:Coffee_Products__c", title = "Coffee Products"),
				@ChoiceListValue(value = "string:Contact__c", title = "Contact"),
				@ChoiceListValue(value = "string:IsCustomerPortal", title = "Customer Portal Account"),
				@ChoiceListValue(value = "string:CustomerPriority__c", title = "Customer Priority"),
				@ChoiceListValue(value = "string:DandbCompanyId", title = "D&B Company ID"),
				@ChoiceListValue(value = "string:DunsNumber", title = "D-U-N-S Number"),
				@ChoiceListValue(value = "string:Jigsaw", title = "Data.com Key"),
				@ChoiceListValue(value = "string:Date__c", title = "Date"),
				@ChoiceListValue(value = "string:date_time_test__c", title = "date/time test"),
				@ChoiceListValue(value = "string:date1__c", title = "date1"),
				@ChoiceListValue(value = "string:date2__c", title = "date2"),
				@ChoiceListValue(value = "string:DateTime_Formula__c", title = "DateTime Formula"),
				@ChoiceListValue(value = "string:NumberOfEmployees", title = "Employees"),
				@ChoiceListValue(value = "string:Ext_ID__c", title = "Ext ID"),
				@ChoiceListValue(value = "string:Industry", title = "Industry"),
				@ChoiceListValue(value = "string:Interest_Rate__c", title = "Interest Rate"),
				@ChoiceListValue(value = "string:Lead__c", title = "Lead"),
				@ChoiceListValue(value = "string:MSPICKLIST__c", title = "MSPICKLIST"),
				@ChoiceListValue(value = "string:NaicsCode", title = "NAICS Code"),
				@ChoiceListValue(value = "string:NaicsDesc", title = "NAICS Description"),
				@ChoiceListValue(value = "string:NewObject__c", title = "NewObject"),
				@ChoiceListValue(value = "string:Number_of_Days__c", title = "Number of Days"),
				@ChoiceListValue(value = "string:NumberofLocations__c", title = "Number of Locations"),
				@ChoiceListValue(value = "string:Ownership", title = "Ownership"),
				@ChoiceListValue(value = "string:IsPartner", title = "Partner Account"),
				@ChoiceListValue(value = "string:percent__c", title = "percent"),
				@ChoiceListValue(value = "string:picklist__c", title = "picklist"),
				@ChoiceListValue(value = "string:Principal_balance__c", title = "Principal balance"),
				@ChoiceListValue(value = "string:Sic", title = "SIC Code"),
				@ChoiceListValue(value = "string:SicDesc", title = "SIC Description"),
				@ChoiceListValue(value = "string:SLA__c", title = "SLA"),
				@ChoiceListValue(value = "string:SLAExpirationDate__c", title = "SLA Expiration Date"),
				@ChoiceListValue(value = "string:SLASerialNumber__c", title = "SLA Serial Number"),
				@ChoiceListValue(value = "string:ShippingCity", title = "Shipping City"),
				@ChoiceListValue(value = "string:ShippingCountryCode", title = "Shipping Country Code"),
				@ChoiceListValue(value = "string:ShippingStateCode", title = "Shipping State/Province Code"),
				@ChoiceListValue(value = "string:ShippingStreet", title = "Shipping Street"),
				@ChoiceListValue(value = "string:ShippingPostalCode", title = "Shipping Zip/Postal Code"),
				@ChoiceListValue(value = "string:TickerSymbol", title = "Ticker Symbol"),
				@ChoiceListValue(value = "string:Tradestyle", title = "Tradestyle"),
				@ChoiceListValue(value = "string:UpsellOpportunity__c", title = "Upsell Opportunity"),
				@ChoiceListValue(value = "string:Website", title = "Website"),
				@ChoiceListValue(value = "string:YearStarted", title = "Year Started") })
		@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[name=\"editFieldLinkField\"]")
		public WebElement Field_Link_Field_Account;

		@ChoiceListType(values = { @ChoiceListValue(value = "string:AccountId", title = "Account ID"),
				@ChoiceListValue(value = "string:Amount", title = "Amount"),
				@ChoiceListValue(value = "string:CampaignId", title = "Campaign ID"),
				@ChoiceListValue(value = "string:CloseDate", title = "Close Date"),
				@ChoiceListValue(value = "string:Contact__c", title = "Contact"),
				@ChoiceListValue(value = "string:CurrentGenerators__c", title = "Current Generator(s)"),
				@ChoiceListValue(value = "string:Date_Formula__c", title = "Date Formula"),
				@ChoiceListValue(value = "string:Date_time_test__c", title = "Date time test"),
				@ChoiceListValue(value = "string:DeliveryInstallationStatus__c", title = "Delivery/Installation Status"),
				@ChoiceListValue(value = "string:Description", title = "Description"),
				@ChoiceListValue(value = "string:ForecastCategoryName", title = "Forecast Category"),
				@ChoiceListValue(value = "string:LeadSource", title = "Lead Source"),
				@ChoiceListValue(value = "string:MainCompetitors__c", title = "Main Competitor(s)"),
				@ChoiceListValue(value = "string:Name", title = "Name"),
				@ChoiceListValue(value = "string:NextStep", title = "Next Step"),
				@ChoiceListValue(value = "string:Type", title = "Opportunity Type"),
				@ChoiceListValue(value = "string:OrderNumber__c", title = "Order Number"),
				@ChoiceListValue(value = "string:Pricebook2Id", title = "Price Book ID"),
				@ChoiceListValue(value = "string:IsPrivate", title = "Private"),
				@ChoiceListValue(value = "string:Probability", title = "Probability (%)"),
				@ChoiceListValue(value = "string:TotalOpportunityQuantity", title = "Quantity"),
				@ChoiceListValue(value = "string:SyncedQuoteId", title = "Quote ID"),
				@ChoiceListValue(value = "string:Reminder_Date__c", title = "Reminder Date"),
				@ChoiceListValue(value = "string:StageName", title = "Stage"),
				@ChoiceListValue(value = "string:TrackingNumber__c", title = "Tracking Number") })
		@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[Name=\"editFieldLinkField\"]")
		public WebElement Field_Link_Field_Opportunity;

		@ChoiceListType(values = { @ChoiceListValue(value = "object:259", title = "Account__c"),
				@ChoiceListValue(value = "object:260", title = "Asset__c"),
				@ChoiceListValue(value = "object:261", title = "Coffee_Count__c"),
				@ChoiceListValue(value = "object:262", title = "Coffee_Products__c"),
				@ChoiceListValue(value = "object:263", title = "Contact__c"),
				@ChoiceListValue(value = "object:264", title = "Contract__c"),
				@ChoiceListValue(value = "object:265", title = "discostage__Form_Account__c"),
				@ChoiceListValue(value = "object:266", title = "discostage__Form_Case__c"),
				@ChoiceListValue(value = "object:267", title = "discostage__Form_Contact__c"),
				@ChoiceListValue(value = "object:268", title = "discostage__Form_Lead__c"),
				@ChoiceListValue(value = "object:269", title = "discostage__Form_Opportunity__c"),
				@ChoiceListValue(value = "object:270", title = "Lead__c"),
				@ChoiceListValue(value = "object:271", title = "New__c"),
				@ChoiceListValue(value = "object:272", title = "NewObject__c"),
				@ChoiceListValue(value = "object:273", title = "Opportunity__c"),
				@ChoiceListValue(value = "object:274", title = "order__c"),
				@ChoiceListValue(value = "object:275", title = "Order_Product__c"),
				@ChoiceListValue(value = "object:276", title = "Product__c"),
				@ChoiceListValue(value = "object:277", title = "Quote__c"),
				@ChoiceListValue(value = "object:278", title = "Quote_Line_Item__c"),
				@ChoiceListValue(value = "object:279", title = "self"),
				@ChoiceListValue(value = "object:280", title = "Solution__c"),
				@ChoiceListValue(value = "object:281", title = "spid__c"),
				@ChoiceListValue(value = "object:282", title = "test__c"),
				@ChoiceListValue(value = "object:283", title = "testing_object__c"),
				@ChoiceListValue(value = "object:284", title = "tests__c"),
				@ChoiceListValue(value = "object:285", title = "tt__c"),
				@ChoiceListValue(value = "object:286", title = "User__c"),
				@ChoiceListValue(value = "object:287", title = "WorkOrder__c") })
		@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[name=\"editFieldLinkLookup\"]")
		public WebElement Field_Link_Lookup_Lead;

		@ChoiceListType(values = { @ChoiceListValue(value = "string:Account__c", title = "Account"),
				@ChoiceListValue(value = "string:AnnualRevenue", title = "Annual Revenue"),
				@ChoiceListValue(value = "string:City", title = "City"),
				@ChoiceListValue(value = "string:Company", title = "Company"),
				@ChoiceListValue(value = "string:CompanyDunsNumber", title = "Company D-U-N-S Number"),
				@ChoiceListValue(value = "string:CountryCode", title = "Country Code"),
				@ChoiceListValue(value = "string:CurrentGenerators__c", title = "Current Generator(s)"),
				@ChoiceListValue(value = "string:DandbCompanyId", title = "D&B Company ID"),
				@ChoiceListValue(value = "string:Jigsaw", title = "Data.com Key"),
				@ChoiceListValue(value = "string:Description", title = "Description"),
				@ChoiceListValue(value = "string:Email", title = "Email"),
				@ChoiceListValue(value = "string:EmailBouncedDate", title = "Email Bounced Date"),
				@ChoiceListValue(value = "string:EmailBouncedReason", title = "Email Bounced Reason"),
				@ChoiceListValue(value = "string:NumberOfEmployees", title = "Employees"),
				@ChoiceListValue(value = "string:Fax", title = "Fax"),
				@ChoiceListValue(value = "string:FirstName", title = "First Name"),
				@ChoiceListValue(value = "string:Industry", title = "Industry"),
				@ChoiceListValue(value = "string:InformalName", title = "Informal Name"),
				@ChoiceListValue(value = "string:LastName", title = "Last Name"),
				@ChoiceListValue(value = "string:LeadSource", title = "Lead Source"),
				@ChoiceListValue(value = "string:MiddleName", title = "Middle Name"),
				@ChoiceListValue(value = "string:MobilePhone", title = "Mobile Phone"),
				@ChoiceListValue(value = "string:NumberofLocations__c", title = "Number of Locations"),
				@ChoiceListValue(value = "string:Phone", title = "Phone"),
				@ChoiceListValue(value = "string:Primary__c", title = "Primary"),
				@ChoiceListValue(value = "string:ProductInterest__c", title = "Product Interest"),
				@ChoiceListValue(value = "string:Rating", title = "Rating"),
				@ChoiceListValue(value = "string:SICCode__c", title = "SIC Code"),
				@ChoiceListValue(value = "string:Salutation", title = "Salutation"),
				@ChoiceListValue(value = "string:StateCode", title = "State/Province Code"),
				@ChoiceListValue(value = "string:Status", title = "Status"),
				@ChoiceListValue(value = "string:Street", title = "Street"),
				@ChoiceListValue(value = "string:Title", title = "Title"),
				@ChoiceListValue(value = "string:IsUnreadByOwner", title = "Unread By Owner"),
				@ChoiceListValue(value = "string:Website", title = "Website"),
				@ChoiceListValue(value = "string:PostalCode", title = "Zip/Postal Code") })
		@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[name=\"editFieldLinkField\"]")
		public WebElement Field_Link_Field_Lead;
	
			@ChoiceListType(values = { @ChoiceListValue(value = "object:259", title = "Account__c"),
				@ChoiceListValue(value = "object:260", title = "Asset__c"),
				@ChoiceListValue(value = "object:261", title = "Coffee_Count__c"),
				@ChoiceListValue(value = "object:262", title = "Coffee_Products__c"),
				@ChoiceListValue(value = "object:263", title = "Contact__c"),
				@ChoiceListValue(value = "object:264", title = "Contract__c"),
				@ChoiceListValue(value = "object:265", title = "discostage__Form_Account__c"),
				@ChoiceListValue(value = "object:266", title = "discostage__Form_Case__c"),
				@ChoiceListValue(value = "object:267", title = "discostage__Form_Contact__c"),
				@ChoiceListValue(value = "object:268", title = "discostage__Form_Lead__c"),
				@ChoiceListValue(value = "object:269", title = "discostage__Form_Opportunity__c"),
				@ChoiceListValue(value = "object:270", title = "Lead__c"),
				@ChoiceListValue(value = "object:271", title = "New__c"),
				@ChoiceListValue(value = "object:272", title = "NewObject__c"),
				@ChoiceListValue(value = "object:273", title = "Opportunity__c"),
				@ChoiceListValue(value = "object:274", title = "order__c"),
				@ChoiceListValue(value = "object:275", title = "Order_Product__c"),
				@ChoiceListValue(value = "object:276", title = "Product__c"),
				@ChoiceListValue(value = "object:277", title = "Quote__c"),
				@ChoiceListValue(value = "object:278", title = "Quote_Line_Item__c"),
				@ChoiceListValue(value = "object:279", title = "self"),
				@ChoiceListValue(value = "object:280", title = "Solution__c"),
				@ChoiceListValue(value = "object:281", title = "spid__c"),
				@ChoiceListValue(value = "object:282", title = "test__c"),
				@ChoiceListValue(value = "object:283", title = "testing_object__c"),
				@ChoiceListValue(value = "object:284", title = "tests__c"),
				@ChoiceListValue(value = "object:285", title = "tt__c"),
				@ChoiceListValue(value = "object:286", title = "User__c"),
				@ChoiceListValue(value = "object:287", title = "WorkOrder__c") })
		@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[name=\"editFieldLinkLookup\"]")
		public WebElement Field_Link_Lookup_Opportunity;
		
			@ChoiceListType(values = { @ChoiceListValue(value = "object:259", title = "Account__c"),
				@ChoiceListValue(value = "object:260", title = "Asset__c"),
				@ChoiceListValue(value = "object:261", title = "Coffee_Count__c"),
				@ChoiceListValue(value = "object:262", title = "Coffee_Products__c"),
				@ChoiceListValue(value = "object:263", title = "Contact__c"),
				@ChoiceListValue(value = "object:264", title = "Contract__c"),
				@ChoiceListValue(value = "object:265", title = "discostage__Form_Account__c"),
				@ChoiceListValue(value = "object:266", title = "discostage__Form_Case__c"),
				@ChoiceListValue(value = "object:267", title = "discostage__Form_Contact__c"),
				@ChoiceListValue(value = "object:268", title = "discostage__Form_Lead__c"),
				@ChoiceListValue(value = "object:269", title = "discostage__Form_Opportunity__c"),
				@ChoiceListValue(value = "object:270", title = "Lead__c"),
				@ChoiceListValue(value = "object:271", title = "New__c"),
				@ChoiceListValue(value = "object:272", title = "NewObject__c"),
				@ChoiceListValue(value = "object:273", title = "Opportunity__c"),
				@ChoiceListValue(value = "object:274", title = "order__c"),
				@ChoiceListValue(value = "object:275", title = "Order_Product__c"),
				@ChoiceListValue(value = "object:276", title = "Product__c"),
				@ChoiceListValue(value = "object:277", title = "Quote__c"),
				@ChoiceListValue(value = "object:278", title = "Quote_Line_Item__c"),
				@ChoiceListValue(value = "object:279", title = "self"),
				@ChoiceListValue(value = "object:280", title = "Solution__c"),
				@ChoiceListValue(value = "object:281", title = "spid__c"),
				@ChoiceListValue(value = "object:282", title = "test__c"),
				@ChoiceListValue(value = "object:283", title = "testing_object__c"),
				@ChoiceListValue(value = "object:284", title = "tests__c"),
				@ChoiceListValue(value = "object:285", title = "tt__c"),
				@ChoiceListValue(value = "object:286", title = "User__c"),
				@ChoiceListValue(value = "object:287", title = "WorkOrder__c") })
		@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[name=\"editFieldLinkLookup\"]")
		public WebElement Field_Link_Lookup_CoffeeProducts;
		
				@ChoiceListType(values = { @ChoiceListValue(value = "object:259", title = "Account__c"),
				@ChoiceListValue(value = "object:260", title = "Asset__c"),
				@ChoiceListValue(value = "object:261", title = "Coffee_Count__c"),
				@ChoiceListValue(value = "object:262", title = "Coffee_Products__c"),
				@ChoiceListValue(value = "object:263", title = "Contact__c"),
				@ChoiceListValue(value = "object:264", title = "Contract__c"),
				@ChoiceListValue(value = "object:265", title = "discostage__Form_Account__c"),
				@ChoiceListValue(value = "object:266", title = "discostage__Form_Case__c"),
				@ChoiceListValue(value = "object:267", title = "discostage__Form_Contact__c"),
				@ChoiceListValue(value = "object:268", title = "discostage__Form_Lead__c"),
				@ChoiceListValue(value = "object:269", title = "discostage__Form_Opportunity__c"),
				@ChoiceListValue(value = "object:270", title = "Lead__c"),
				@ChoiceListValue(value = "object:271", title = "New__c"),
				@ChoiceListValue(value = "object:272", title = "NewObject__c"),
				@ChoiceListValue(value = "object:273", title = "Opportunity__c"),
				@ChoiceListValue(value = "object:274", title = "order__c"),
				@ChoiceListValue(value = "object:275", title = "Order_Product__c"),
				@ChoiceListValue(value = "object:276", title = "Product__c"),
				@ChoiceListValue(value = "object:277", title = "Quote__c"),
				@ChoiceListValue(value = "object:278", title = "Quote_Line_Item__c"),
				@ChoiceListValue(value = "object:279", title = "self"),
				@ChoiceListValue(value = "object:280", title = "Solution__c"),
				@ChoiceListValue(value = "object:281", title = "spid__c"),
				@ChoiceListValue(value = "object:282", title = "test__c"),
				@ChoiceListValue(value = "object:283", title = "testing_object__c"),
				@ChoiceListValue(value = "object:284", title = "tests__c"),
				@ChoiceListValue(value = "object:285", title = "tt__c"),
				@ChoiceListValue(value = "object:286", title = "User__c"),
				@ChoiceListValue(value = "object:287", title = "WorkOrder__c") })
		@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[name=\"editFieldLinkLookup\"]")
		public WebElement Field_Link_Lookup_CoffeeCount;

				@ChoiceListType(values = { @ChoiceListValue(value = "string:Account__c", title = "Account"),
						@ChoiceListValue(value = "string:Name", title = "Coffee Count Name"),
						@ChoiceListValue(value = "string:Coffee_Products__c", title = "Coffee Products"),
						@ChoiceListValue(value = "string:Cost__c", title = "Cost"),
						@ChoiceListValue(value = "string:Quantity__c", title = "Quantity"),
						@ChoiceListValue(value = "string:Shelf_Location__c", title = "Shelf Location") })
				@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[name=\"editFieldLinkField\"]")
				public WebElement Field_Link_Field_CoffeeCount;

				@ChoiceListType(values = { @ChoiceListValue(value = "string:Account__c", title = "Account"),
						@ChoiceListValue(value = "string:Coffee_Count__c", title = "Coffee Count"),
						@ChoiceListValue(value = "string:Name", title = "Coffee Products Name"),
						@ChoiceListValue(value = "string:UPC_Code__c", title = "UPC Code") })
				@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[name=\"editFieldLinkField\"]")
				public WebElement Field_Link_Field_CoffeeProduct;

				@ChoiceListType(values = { @ChoiceListValue(value = "object:259", title = "Account__c"),
						@ChoiceListValue(value = "object:260", title = "Asset__c"),
						@ChoiceListValue(value = "object:261", title = "Coffee_Count__c"),
						@ChoiceListValue(value = "object:262", title = "Coffee_Products__c"),
						@ChoiceListValue(value = "object:263", title = "Contact__c"),
						@ChoiceListValue(value = "object:264", title = "Contract__c"),
						@ChoiceListValue(value = "object:265", title = "discostage__Form_Account__c"),
						@ChoiceListValue(value = "object:266", title = "discostage__Form_Case__c"),
						@ChoiceListValue(value = "object:267", title = "discostage__Form_Contact__c"),
						@ChoiceListValue(value = "object:268", title = "discostage__Form_Lead__c"),
						@ChoiceListValue(value = "object:269", title = "discostage__Form_Opportunity__c"),
						@ChoiceListValue(value = "object:270", title = "Lead__c"),
						@ChoiceListValue(value = "object:271", title = "New__c"),
						@ChoiceListValue(value = "object:272", title = "NewObject__c"),
						@ChoiceListValue(value = "object:273", title = "Opportunity__c"),
						@ChoiceListValue(value = "object:274", title = "order__c"),
						@ChoiceListValue(value = "object:275", title = "Order_Product__c"),
						@ChoiceListValue(value = "object:276", title = "Product__c"),
						@ChoiceListValue(value = "object:277", title = "Quote__c"),
						@ChoiceListValue(value = "object:278", title = "Quote_Line_Item__c"),
						@ChoiceListValue(value = "object:279", title = "self"),
						@ChoiceListValue(value = "object:280", title = "Solution__c"),
						@ChoiceListValue(value = "object:281", title = "spid__c"),
						@ChoiceListValue(value = "object:282", title = "test__c"),
						@ChoiceListValue(value = "object:283", title = "tests__c"),
						@ChoiceListValue(value = "object:284", title = "tt__c"),
						@ChoiceListValue(value = "object:285", title = "User__c"),
						@ChoiceListValue(value = "object:286", title = "WorkOrder__c") })
				@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[name=\"editFieldLinkLookup\"]")
				public WebElement Field_Link_Lookup_Contact;

				@ButtonType()
				@FindBy(css = "#drag-new-free-text div.OR-button__draggable.slds-button.slds-button_neutral.OR-draggable_background")
				public WebElement Text_Image_Space_Draggable_Button;

				@ButtonType()
				@FindBy(css = "button.questionModalSave.slds-button.slds-button_neutral.slds-button_brand")
				public WebElement Text_Image_Space_Save_button;

				@TextType()
				@FindBy(css = "div.ql-editor.ql-blank")
				public WebElement Free_Text_Edit_Field;

				@ChoiceListType(values = { @ChoiceListValue(value = "string:Free Text", title = "Free Text"),
						@ChoiceListValue(value = "string:Image", title = "Image"),
						@ChoiceListValue(value = "string:Space", title = "Space") })
				@FindBy(css = "span.slds-form-element.slds-is-required.slds-m-top_x-small.slds-col.slds-size_1-of-1 select.slds-select")
				public WebElement Extra_Question_Drop_down_list;

				@ButtonType()
				@FindBy(css = "div.OR-button__draggable.slds-button.slds-button_neutral.OR-draggable_background.newLinkedSection")
				public WebElement Linked_Section_Draggable_Button;

				@ChoiceListType(values = { @ChoiceListValue(value = "string:Account", title = "Account"),
						@ChoiceListValue(value = "string:Asset", title = "Asset"),
						@ChoiceListValue(value = "string:Coffee_Count__c", title = "Coffee_Count__c"),
						@ChoiceListValue(value = "string:Coffee_Products__c", title = "Coffee_Products__c"),
						@ChoiceListValue(value = "string:Contact", title = "Contact"),
						@ChoiceListValue(value = "string:Contract", title = "Contract"),
						@ChoiceListValue(value = "string:Lead", title = "Lead"),
						@ChoiceListValue(value = "string:NewObject__c", title = "NewObject__c"),
						@ChoiceListValue(value = "string:New__c", title = "New__c"),
						@ChoiceListValue(value = "string:Opportunity", title = "Opportunity"),
						@ChoiceListValue(value = "string:Product2", title = "Product2"),
						@ChoiceListValue(value = "string:Quote", title = "Quote"),
						@ChoiceListValue(value = "string:Solution", title = "Solution"),
						@ChoiceListValue(value = "string:Store_Product__c", title = "Store_Product__c"),
						@ChoiceListValue(value = "string:Task", title = "Task"),
						@ChoiceListValue(value = "string:Test__c", title = "Test__c"),
						@ChoiceListValue(value = "string:testing_object__c", title = "testing_object__c"),
						@ChoiceListValue(value = "string:TriggerTest__c", title = "TriggerTest__c"),
						@ChoiceListValue(value = "string:WorkOrder", title = "WorkOrder") })
				@FindBy(css = "#sectionLink")
				public WebElement Link_Section_Object_Field;

				@ChoiceListType(values = {
						@ChoiceListValue(value = "string:Contact_Form1__c", title = "Contact_Form1__c"),
						@ChoiceListValue(value = "string:Form__c", title = "Form__c") })
				@FindBy(css = "#sectionLinkLookup")
				public WebElement Link_Section_Object_Lookup_Field;

				@TextType()
				@FindBy(css = "ul li[data-section-name=\"LS-with-Contact\"]")
				public WebElement LS_Contact_Drop_Field;

				@TextType()
				@FindBy(css = "#tab-scoped-1 span.slds-form-element.slds-is-required select.slds-select[name=\"editFieldLinkLinkSectionField\"]")
				public WebElement LS_Field_Link_Field;

				@TextType()
				@FindBy(css = "ul li[data-section-name=\"LS-with-Account\"]")
				public WebElement LS_Account_Drop_Field;

				@TextType()
				@FindBy(css = "ul li[data-section-name=\"LS-with-Coffee-Count\"]")
				public WebElement LS_Coffee_Count_Drop_Field;

				@TextType()
				@FindBy(css = "div.slds-grid.OR-section.linked-section.Coffee_Products__c2a5acafb ul.list-group.ui-sortable.js-linked-question-list.linked-question-list")
				public WebElement LS_Coffee_Products_Drop_Field;
				
				@TextType()
				@FindBy(css = "ul li[data-section-name=\"LS-with-Coffee-Produ\"]")
				public WebElement LS_Coffee_Product_Drop_Area;

				@TextType()
				@FindBy(css = "ul li[data-section-name=\"LS-with-Opportunity\"]")
				public WebElement LS_Opportunity_Drop_Field;

				@TextType()
				@FindBy(css = "#form-builder li.list-group-item.OR-question-box.question-0.ui-sortable-handle[data-question-name=\"15-Radio-Button-List\"] div.qb-edit.flex-center.editQuestion")
				public WebElement Radio_Button_List_Edit_button;


				@LinkType()
				@FindBy(css = "#tab-scoped-2__item")
				public WebElement dISPLAYLOGIC1;

				@ChoiceListType(values = { @ChoiceListValue(value = "Always"),
						@ChoiceListValue(value = "Conditional Visibility") })
				@FindBy(css = "#questionDependent")
				public WebElement Conditional_Visibility_Viewable;

				@ChoiceListType(values = { @ChoiceListValue(value = "string:14980a6b", title = "6-Picklist"),
						@ChoiceListValue(value = "string:1f9e32fc", title = "12-Multi Select Pick List") })
				@FindBy(xpath = "//td[3]/span/div/div/select")
				public WebElement WhenTheQuestion;



	
}
