package Tests;


import PageObjects.HomePage;
import PageObjects.Registration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

    public static WebDriver driver = new ChromeDriver();
    HomePage homepage = new HomePage(driver);
    private Registration registration = new Registration(driver);



    @Before
    public void setupPage(){homepage.goTo();}

    @Test
    public void registerNewUser(){
        registration.clickSignIn();
        registration.typeEmailAndCreateAccount();
        registration.clickGenderButton();
        registration.writeFirstName("Walker");
        registration.writeSecondName("Mister");
        registration.writePassword("password123");
        registration.enterAddress("12 Random Street");
        registration.enterCity("City");
        registration.selectState();
        registration.enterPostCode("00000");
        registration.selectCountry();
        registration.enterMobileNumber("07937482819" + Keys.ENTER);
        registration.successfulRegistration();
}
    @After
    public void individualTearDown(){
        driver.manage().deleteAllCookies();
    }
}