package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyDress extends BasePage{



    public BuyDress(WebDriver driver) {
        super(driver);
    }
    private static final By SHOPPING_CART_BUTTON = By.cssSelector("a[title='View my shopping cart']");
    private static final By NAVIGATE_DRESSES = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    private static final By SORT_DROP_DOWN = By.cssSelector("#selectProductSort");
    private static final By ADD_TO_CART = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
    private static final By IN_SHOPPING_CART_MESSAGE = By.cssSelector("#layer_cart > div.clearfix h2 > i");
    private static final By LOGOUT_BUTTON = By.cssSelector("a.logout");
    private static final By SHOPPING_CART_EMPTY_NOTIFICATION = By.cssSelector("#center_column > p");

    public void clickDresses(){
        waitAndClick(NAVIGATE_DRESSES);
    }
    public void selectSortDropDown(){
        selectDropDrowns(SORT_DROP_DOWN, "Price: Highest first");
        //Commented out step because website doesn't sort dresses, which stops everything else from working.
    }
    public void addToCart(){
        waitAndClick(ADD_TO_CART);
    }
    public void confirmAddedToCart(){
        WebElement successMessage = driver.findElement(IN_SHOPPING_CART_MESSAGE);
        //If Test passes, the dress is in the shopping cart.
        Assert.assertTrue(elementIsVisible(successMessage));
    }
    public void logOut(){
        waitAndClick(LOGOUT_BUTTON);
    }
    public void clickShoppingCart(){
        waitAndClick(SHOPPING_CART_BUTTON);
    }
    public void checkIfDressIsAvailable(){
        WebElement checkifEmpty = driver.findElement(SHOPPING_CART_EMPTY_NOTIFICATION);
        //Checking if Cart is empty, if the test fails, the shopping cart doesn't save dresses.
        Assert.assertFalse(elementIsVisible(checkifEmpty));
    }

}
