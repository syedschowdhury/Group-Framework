package homeTabs;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LandingPage extends CommonAPI {

    @Test
    public void landingPage(){
        driver.findElement(By.cssSelector("#block_top_menu > ul > li.sfHoverForce > a")).click();

    }

}
