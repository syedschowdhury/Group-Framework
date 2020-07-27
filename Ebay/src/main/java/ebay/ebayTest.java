package ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ebayTest extends CommonAPI {

    @Test
    public void searchDress() {
        driver.findElement(By.id("gh-ac")).sendKeys("dress", Keys.ENTER);}
    @Test
    public void searchShoes() { driver.findElement(By.id("gh-ac")).sendKeys("shoes", Keys.ENTER); }
    @Test
    public void searchShirt() {
        driver.findElement(By.id("gh-ac")).sendKeys("colors", Keys.ENTER); }
    @Test
    public void searchGym() {
        driver.findElement(By.id("gh-ac")).sendKeys("workout", Keys.ENTER); }
    @Test
    public void searchKidsBooks() {
        driver.findElement(By.id("gh-ac")).sendKeys( "books", Keys.ENTER); }
    @Test
    public void searchJewelry() {
        driver.findElement(By.id("gh-ac")).sendKeys("fineJewelry", Keys.ENTER);}
    @Test
    public void searchMakeUp() {
        driver.findElement(By.id("gh-ac")).sendKeys("makeUp", Keys.ENTER); }
    @Test
    public void searchMovies() {
        driver.findElement(By.id("gh-ac")).sendKeys("movies", Keys.ENTER); }
    @Test
    public void searchHotWheels() {
        driver.findElement(By.id("gh-ac")).sendKeys("hotWheels", Keys.ENTER); }
    @Test
    public void searchCarpet() {
        driver.findElement(By.id("gh-ac")).sendKeys("carpet", Keys.ENTER); }
    @Test
    public void searchCookTop() {
        driver.findElement(By.id("gh-ac")).sendKeys("cookTop", Keys.ENTER); }
    @Test
    public void searchRefrigerator() {
        driver.findElement(By.id("gh-ac")).sendKeys("refrigerator", Keys.ENTER); }
    @Test
    public void securityCamera() {
        driver.findElement(By.id("gh-ac")).sendKeys("cameraSystem", Keys.ENTER); }
    @Test
    public void computerDesk() {
        driver.findElement(By.id("gh-ac")).sendKeys("Desk", Keys.ENTER);}
    @Test
    public void homeFurniture() {
        driver.findElement(By.id("gh-ac")).sendKeys("furniture", Keys.ENTER); }
    @Test
    public void searchKitchenOrganizer () {
        driver.findElement(By.id("gh-ac")).sendKeys("kitchenOrganizer", Keys.ENTER); }
    @Test
        public void garden() {
        driver.findElement(By.id("gh-ug")).sendKeys("gardenDecor", Keys.ENTER);}
    @Test
    public void mugs() {
        driver.findElement(By.id("gh-ac")).sendKeys("Mugs", Keys.ENTER);}
    @Test
    public void TradingCards() {
        driver.findElement(By.id("gh-ac")).sendKeys("TradingCards", Keys.ENTER); }
    @Test
    public void Bikes() {
        driver.findElement(By.id("gh-ac")).sendKeys("Bikes", Keys.ENTER); }
    @Test
    public void outdoorSports() {
        driver.findElement(By.id("gh-ac")).sendKeys("outdoorSports", Keys.ENTER); }
    @Test
    public void Tools() {
        driver.findElement(By.id("gh-ac")).sendKeys( "Tools", Keys.ENTER); }
    @Test
    public void patioFurniture () {
        driver.findElement(By.id("gh-ac")).sendKeys("patioFurniture", Keys.ENTER);}
    @Test
    public void Watches() {
        driver.findElement(By.id("gh-ac")).sendKeys("Watches", Keys.ENTER); }
    @Test
    public void counterTopMixers() {
        driver.findElement(By.id("gh-ac")).sendKeys("countertop Mixers", Keys.ENTER); }
    @Test
    public void slowCookers() {
        driver.findElement(By.id("gh-ac")).sendKeys("slow Cookers", Keys.ENTER); }
    @Test
    public void airFryers() {
        driver.findElement(By.id("gh-ac")).sendKeys("air Fryers", Keys.ENTER); }
    @Test
    public void cofferMakers() {
        driver.findElement(By.id("gh-ac")).sendKeys("coffer Makers", Keys.ENTER); }
    @Test
    public void CountertopBlenders () {
        driver.findElement(By.id("gh-ac")).sendKeys("Countertop Blenders", Keys.ENTER); }
    @Test
    public void waterFilter() {
        driver.findElement(By.id("gh-ac")).sendKeys("water Filter", Keys.ENTER); }
    @Test
    public void Juicers() {
        driver.findElement(By.id("gh-ac")).sendKeys("Juicers", Keys.ENTER);}
    @Test
    public void DeepFryers() {
        driver.findElement(By.id("gh-ac")).sendKeys("Deep Fryers", Keys.ENTER); }
    @Test
    public void foodProcessors () {
        driver.findElement(By.id("gh-ac")).sendKeys("food Processors", Keys.ENTER); }
    @Test
    public void GrillsGriddles() {
        driver.findElement(By.id("gh-ug")).sendKeys("Grills and Griddles", Keys.ENTER);}

}

