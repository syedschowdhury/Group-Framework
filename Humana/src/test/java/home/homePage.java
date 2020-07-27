package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class homePage extends CommonAPI {


        @FindBy(id= "searchbox")
        public static WebElement searchBar;
        public void searchForTelemedicine(){
            searchBar.sendKeys("telemedicine");
            new Actions(driver).sendKeys(Keys.ENTER).perform();

        }

        @Test
        public void homePage(){

        }
}


