package PageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
        public HomePage(WebDriver driver) {
            super(driver);
        }

        private static String URL = "http://automationpractice.com/index.php";
        public void goTo() {

            driver.get(URL);
            if (driver == null) {
                driver.get(URL);
            }
        }
    }

