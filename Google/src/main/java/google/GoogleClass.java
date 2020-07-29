package google;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleClass extends CommonAPI {


    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Evian water", Keys.ENTER);
        Thread.sleep(3000);
    }


    //For alibaba
//@Test
//public void test1() throws InterruptedException {
//    driver.findElement(By.xpath("//input[@name='SearchText']")).sendKeys("Tennis ball", Keys.ENTER);
//    Thread.sleep(3000);
//}



}
