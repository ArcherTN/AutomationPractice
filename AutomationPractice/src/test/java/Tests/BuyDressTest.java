package Tests;

import PageObjects.BuyDress;
import PageObjects.HomePage;
import PageObjects.Registration;
import PageObjects.SignIn;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyDressTest {

    public static WebDriver driver = new ChromeDriver();
    HomePage homepage = new HomePage(driver);
    private Registration registration = new Registration(driver);
    private SignIn signIn = new SignIn(driver);
    private BuyDress buyDress = new BuyDress(driver);

    @Before
    public void setupPage(){homepage.goTo();}

    @Test
    public void buyMostExpensiveDress(){
        registration.clickSignIn();
        signIn.enterEmail("emailemail@email.com");
        signIn.enterPassword("password");
        signIn.clickLogin();
        buyDress.clickDresses();
        //buyDress.selectSortDropDown();
        buyDress.addToCart();
        buyDress.confirmAddedToCart();
    }

    @Test
    public void checkShoppingCart(){
        registration.clickSignIn();
        signIn.enterEmail("emailemail@email.com");
        signIn.enterPassword("password");
        signIn.clickLogin();
        buyDress.clickDresses();
        //buyDress.selectSortDropDown();
        buyDress.addToCart();
        buyDress.logOut();
        registration.clickSignIn();
        signIn.enterEmail("emailemail@email.com");
        signIn.enterPassword("password");
        signIn.clickLogin();
        buyDress.clickShoppingCart();
        buyDress.checkIfDressIsAvailable();

    }
    @After
    public void individualTearDown(){
        driver.manage().deleteAllCookies();
    }
}
