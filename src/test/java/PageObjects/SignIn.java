package PageObjects;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn extends BasePage {

    public SignIn(WebDriver driver) {
        super(driver);
    }
    private static final By REGISTRATION_EMAIL_BOX = By.cssSelector("#email");
    private static final By PASSWORD_BOX = By.cssSelector("#passwd");
    private static final By SUCCESSFUL_LOGIN_BOX = By.cssSelector("p.info-account");
    private static final By LOGIN_BUTTON = By.cssSelector("#SubmitLogin");

    public void enterEmail(String email){
        findAndType(REGISTRATION_EMAIL_BOX, email );
    }
    public void enterPassword(String password){
        findAndType(PASSWORD_BOX, password);
    }
    public void clickLogin(){
        waitAndClick(LOGIN_BUTTON);
    }
    public void successfulLogin(){
        WebElement successfulLogin = driver.findElement(SUCCESSFUL_LOGIN_BOX);
        //Verifying login successful
        Assert.assertTrue(elementIsVisible(successfulLogin));
    }
}
