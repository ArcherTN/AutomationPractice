package Tests;

import PageObjects.HomePage;
import PageObjects.Registration;
import PageObjects.SignIn;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class SignInTest {
    public static WebDriver driver = new ChromeDriver();
    HomePage homepage = new HomePage(driver);
    private Registration registration = new Registration(driver);
    private SignIn signIn = new SignIn(driver);

    @Before
    public void setupPage(){homepage.goTo();}

    @Test
    public void signIn(){
    registration.clickSignIn();
    signIn.enterEmail("emailemail@email.com");
    signIn.enterPassword("password");
    signIn.clickLogin();
    signIn.successfulLogin();
    }
    @After
    public void individualTearDown(){
        driver.manage().deleteAllCookies();
    }
    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }

}