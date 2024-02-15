package Stepdefinition;

import Core.WebHelper;
import POM.WebElement1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RoboketStepdefs {
    public static WebDriver driver;

    WebElement1 element;
    @Given("base url")
    public void baseUrl() {
        WebHelper helper=new WebHelper();
        driver=helper.browser();

    }

    @When("User will Enter {string} and {string}")
    public void userWillEnterEmailAndPassword(String Email ,String Password) throws InterruptedException {
        element= new WebElement1(driver);
        element.Login(Email,Password);
        
    }

    @And("User will click Login Button")
    public void userWillClickLoginButton() {
        element.LoginButton();
    }

    @Then("User will Login Successfully")
    public void userWillLoginSuccessfully() {
        
    }

    @Given("User has the Contacts menu bar")
    public void userHasTheContactsMenuBar() {
      element=new WebElement1(driver);
      element.ContactMenuBar();
        
    }

    @When("User will click Contact Segment")
    public void userWillClickContactSegment() {
        element.ContactSegmentClick();
        
    }

    @And("User will click to Create Segments")
    public void userWillClickToCreateSegments() {
        element.CreateSegmentsClick();
    }

    @And("User will provide Details of {string},{string} and click to Next")
    public void userWillProvideDetailsOfSegmentNameSegmentDescriptionAndClickToNext(String Segmentname,String Segmentdescription ) throws InterruptedException {
        element.SegmentNameAndDescription(Segmentname,Segmentdescription);
    }

    @And("User will select Filter Attribute")
    public void userWillSelectFilterAttribute() {
        
    }

    @And("User will set conditional operators")
    public void userWillSetConditionalOperators() {
        
    }

    @And("User will set conditional value")
    public void userWillSetConditionalValue() {
        
    }

    @Then("User will successfully create Segments")
    public void userWillSuccessfullyCreateSegments() {

    }

    @Given("User in the the Contacts menu bar.")
    public void userInTheTheContactsMenuBar() {

    }

    @When("User will Select from menu Companies")
    public void userWillSelectFromMenuCompanies() {

    }

    @And("User will click to Create Company and a form will open")
    public void userWillClickToCreateCompanyAndAFormWillOpen() {

    }

    @And("User will provide {string},{string},{string},{string},Country")
    public void userWillProvideCompanyNameCompanyDomainCompanyEmailCompanyPhoneNumberCountry() {
    }

    @And("User will also provide Lead status,{string},{string},{string},{string}and {string}")
    public void userWillAlsoProvideLeadStatusNumberOfSisterConcernNumberOfDecisionMakersNumberOfEmployeesNumberOfTimesContactedAndTotalOpenDealValue() {
    }

    @Then("User will Successfully Create Company")
    public void userWillSuccessfullyCreateCompany() {
    }


    @Given("User in the Contacts menu table")
    public void userInTheContactsMenuTable() {
        
    }

    @When("User will select Contact from menu")
    public void userWillSelectContactFromMenu() {
        
    }

    @And("User will click to Create Contact and a form will open")
    public void userWillClickToCreateContactAndAFormWillOpen() {
        
    }

    @And("User will provide Contact {string},{string},{string},{string},{string}")
    public void userWillProvideContactNameEmailPhoneNumberJobTitleDepartment() {
        
    }

    @And("User will  provide Buying role")
    public void userWillProvideBuyingRole() {
        
    }

    @And("User will  provide Contact owner")
    public void userWillProvideContactOwner() {
        
    }

    @And("User will select Gender")
    public void userWillSelectGender() {
        
    }

    @And("User will provide how he get the contact information")
    public void userWillProvideHowHeGetTheContactInformation() {
        
    }

    @And("User will provide Lead status")
    public void userWillProvideLeadStatus() {
        
    }

    @And("User will select his Preferred language")
    public void userWillSelectHisPreferredLanguage() {
        
    }

    @And("User will select Company")
    public void userWillSelectCompany() {
        
    }

    @Then("User will Successfully Create Contact")
    public void userWillSuccessfullyCreateContact() {
    }
}
