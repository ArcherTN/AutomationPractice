package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


import static junit.framework.TestCase.assertTrue;

public class Registration extends BasePage {

    public Registration(WebDriver webDriver) {
        super(webDriver);
    }

    // All of the Selectors Go here
    private static final By SUCCESSFUL_REGISTRATION_MESSAGE = By.cssSelector("p.info-account");
    private static final By POSTCODE_BOX = By.cssSelector("#postcode");
    private static final By SIGN_IN_PAGE_BUTTON = By.cssSelector("a.login");
    private static final By REGISTRATION_EMAIL_BOX = By.cssSelector("#email_create");
    private static final By REGISTRATION_BUTTON = By.cssSelector("#SubmitCreate");
    private static final By GENDER_RADIO = By.cssSelector("#id_gender1");
    private static final By FIRST_NAME_BOX = By.cssSelector("#customer_firstname");
    private static final By LAST_NAME_BOX = By.cssSelector("#customer_lastname");
    private static final By PASSWORD_BOX = By.cssSelector("#passwd");
    private static final By ADDRESS_BOX = By.cssSelector("#address1");
    private static final By CITY_BOX = By.cssSelector("#city");
    private static final By STATE_DROPDOWN = By.cssSelector("#id_state");
    private static final By COUNTRY_DROPDOWN = By.cssSelector("#id_country");
    private static final By MOBILE_PHONE_BOX = By.cssSelector("#phone_mobile");

    //All of the action methods go here
    public void clickSignIn(){
        waitAndClick(SIGN_IN_PAGE_BUTTON);
    }

    public void typeEmailAndCreateAccount(){
        emailGenerated(REGISTRATION_EMAIL_BOX);
        waitAndClick(REGISTRATION_BUTTON);
    }
    public void clickGenderButton(){
        waitAndClick(GENDER_RADIO);
    }
    public void writeFirstName(String firstName){
        findAndType(FIRST_NAME_BOX, firstName);
    }
    public void writeSecondName(String lastName){
        findAndType(LAST_NAME_BOX, lastName);
    }
    public void writePassword(String password){
        findAndType(PASSWORD_BOX, password);
    }
    public void enterAddress(String address){
        findAndType(ADDRESS_BOX, address);
    }
    public void enterCity(String city){
        findAndType(CITY_BOX, city);
    }
    public void selectState(){
        selectDropDrowns(STATE_DROPDOWN, "Alabama");
    }
    public void enterPostCode(String postCode){
        findAndType(POSTCODE_BOX, postCode);
    }
    public void selectCountry(){
        selectDropDrowns(COUNTRY_DROPDOWN, "United States");
    }
    public void enterMobileNumber(String mobileNumber){
        findAndType(MOBILE_PHONE_BOX, mobileNumber);
    }

    public void successfulRegistration(){
        WebElement successfulRegistration = driver.findElement(SUCCESSFUL_REGISTRATION_MESSAGE);
        //Verifying registration successful
        Assert.assertTrue(elementIsVisible(successfulRegistration));
    }

}