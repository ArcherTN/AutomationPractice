package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;


abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
    }
    void selectDropDrowns(By selector, String text){
        Select dropDown = new Select(driver.findElement(selector));
        dropDown.selectByVisibleText(text);
    }


    void waitAndClick(By selector) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.click();
    }

    boolean elementIsVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (ElementNotVisibleException e) {
            return false;
        }


    }

    void findAndType(By elementSelector, String inputString) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementSelector));
        element.sendKeys(inputString);
    }

    void emailGenerated(By elementSelector){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementSelector));
        Random randomgen = new Random();
        int randomInt = randomgen.nextInt(100);
        element.sendKeys("Username"+ randomInt + "@email.com");
    }

}