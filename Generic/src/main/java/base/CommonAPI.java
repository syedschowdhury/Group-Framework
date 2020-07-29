package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public String browserStackUserName = "mdshamsularefeen1";
    public String browserStackAccessKey = "Sj1iTbHHfUDwCZFm76zx";
    public String sauceLabsUserName = "";
    public String sauceLabsAccessKey = "";

    public WebDriver driver = null;

    @Parameters({"useCloudEnv", "cloudEnvName", "url", "os", "os_version", "browserName", "browserVersion",})
    @BeforeMethod
    public void setup(String useCloudEnv, String cloudEnvName, String url, String OS, String os_version, String browserName, String browserVersion)
            throws IOException {
        if (useCloudEnv.equalsIgnoreCase("true")) {
            getCloudDriver(cloudEnvName, browserStackUserName, browserStackAccessKey, OS, os_version, browserName, browserVersion);
        } else if (useCloudEnv.equalsIgnoreCase("false")) {
            getlocalDriver(OS, browserName);
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

    }

    public WebDriver getlocalDriver(String OS, String browserName) {
        if (OS.equalsIgnoreCase("OS X")) {
            System.setProperty("webdriver.chrome.driver", "..\\Generic\\driver\\chromedriver.exe");
            if (browserName.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();

            }
        } else if (OS.equalsIgnoreCase("Windows")) {
            if (browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "..\\Generic\\driver\\chromedriver.exe");
                driver = new ChromeDriver();
            }
        } else if (OS.equalsIgnoreCase("OS X")) {
            if (browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "..\\Generic\\driver\\geckodriver");
                driver = new FirefoxDriver();

            } else if (OS.equalsIgnoreCase("Windows")) {
                if (browserName.equalsIgnoreCase("chrome")) {
                    System.setProperty("webdriver.chrome.driver", "..\\Generic\\driver\\geckodriver.exe");
                    driver = new FirefoxDriver();
                }
            }
        }


        return driver;

    }


    @AfterMethod
    public void cleanup() {
        driver.close();
    }

    public void clickOnElement(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    public List<WebElement> getListOfWebElements(String locator) {
        List<WebElement> elementList = driver.findElements(By.cssSelector(locator));

        return elementList;
    }

    public List<String> getListOfString(List<WebElement> elementList) {
        List<String> listOfString = new ArrayList<String>();
        for (WebElement element : elementList) {
            listOfString.add(element.getText());
        }
        return listOfString;
    }


    public void getCloudDriver(String envName, String envUserName, String envAccessKeys,
                               String OS, String os_versions, String browserName, String browserVersion) throws IOException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser", browserName);
        cap.setCapability("browserVersion", browserVersion);
        cap.setCapability("os", OS);
        cap.setCapability("os_version", os_versions);
        if (envName.equalsIgnoreCase("Saucelabs")) {
            driver = new RemoteWebDriver(new URL("http://" + envUserName + ":" + envAccessKeys + "@ondemand.saucelabs.com:80/wd/hub"), cap);
        } else if (envName.equalsIgnoreCase("Browserstack")) {
            driver = new RemoteWebDriver(new URL("http://" + envUserName + ":" + envAccessKeys + "@hub-cloud.browserstack.com/wd/hub"), cap);


        }

    }


}




