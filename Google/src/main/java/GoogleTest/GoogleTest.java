package GoogleTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleTest extends CommonAPI {
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.id("search-icon")).sendKeys("MacBook Pro", Keys.ENTER);
        Thread.sleep(3000);

    }
}
//    @Test
//    public void test2() throws InterruptedException {
//        driver.findElement(By.id("gLFyf gsfi")).sendKeys("", Keys.ENTER);
//        Thread.sleep(3000);
//    }
//}
