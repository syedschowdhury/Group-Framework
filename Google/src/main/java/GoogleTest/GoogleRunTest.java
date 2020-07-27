package GoogleTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleRunTest extends CommonAPI {
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("MacBook Pro", Keys.ENTER);
        Thread.sleep(3000);
    }
    @Test
    public void test2() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 11", Keys.ENTER);
    }

    @Test
    public void test3() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("long dresses", Keys.ENTER);
    }
    @Test
    public void test4() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("water falls", Keys.ENTER);
    }

    @Test
    public void test5() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("BMW X5", Keys.ENTER);
    }

    @Test
    public void test6() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Lexus 2014", Keys.ENTER);
    }

    @Test
    public void test7() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("beats", Keys.ENTER);
    }

    @Test
    public void test8() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("airPod", Keys.ENTER);
    }
    @Test
    public void test9()  {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("apple watch 5", Keys.ENTER);
    }
    @Test
    public void test10()  {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("lenovo PC", Keys.ENTER);
    }
    @Test
    public void test11()  {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("apartment rental in LA California", Keys.ENTER);
    }
    @Test
    public void test12() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mac airbook", Keys.ENTER);
    }
    @Test
    public void test13()  {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("power ranger backpacks ", Keys.ENTER);
    }
    @Test
    public void test14() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Toyota camry", Keys.ENTER);
    }

    @Test
    public void test15() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("rims", Keys.ENTER);
    }

    @Test
    public void test16() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("tires", Keys.ENTER);
    }

    @Test
    public void test17() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("seat cover", Keys.ENTER);
    }

    @Test
    public void test18() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("LAX airport", Keys.ENTER);
    }

    @Test
    public void test19() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mercedes Benz", Keys.ENTER);
    }

    @Test
    public void test20() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Lobster me", Keys.ENTER);
    }
    @Test
    public void test21()  {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("auto repair near me", Keys.ENTER);
    }
    @Test
    public void test22()  {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("zillow", Keys.ENTER);
    }
    @Test
    public void test23()  {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Macy's", Keys.ENTER);
    }
    @Test
    public void test24() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Target", Keys.ENTER);
    }
    @Test
    public void test25()  {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("walgreens near me", Keys.ENTER);
    }
}
