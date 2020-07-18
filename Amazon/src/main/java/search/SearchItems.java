package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItems extends CommonAPI {
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java Book", Keys.ENTER);
        Thread.sleep(2000);
    }
    @Test
    public void test2(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

}
