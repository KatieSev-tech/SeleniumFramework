package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaOOPHomeWork {
    public ChromeDriver driver;
    public String myForkURL = "https://test.my-fork.com/";
    public String SignInButton = "//div[@id='log-in-button']/..";
    public String LogInButtonLoginPage = "//button[@type ='submit']";

    @BeforeMethod
    public void SetUp () {
        System.setProperty("webdriver.chrome.driver", "/Users/katerynasevriukova/Documents/GitHub/SeleniumFramework/src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

    }


    @Test
    public void openSignInPage(){

        driver.get(myForkURL);
        driver.findElement(By.xpath(SignInButton)).click();

    }

    @Test
    public void validateEmailPasswordFieldsLoginButtonAreDisplayed (){

        driver.get(myForkURL);
        driver.findElement(By.xpath(SignInButton)).click();
        System.out.println(driver.findElement(By.id("email")).isDisplayed());
        System.out.println(driver.findElement(By.id("password")).isDisplayed());
        System.out.println(driver.findElement(By.xpath(LogInButtonLoginPage)).isDisplayed());

    }

    @Test
    public void validateInvalidEmailPasswordFieldsClickOnLoginButton (){

        driver.get(myForkURL);
        driver.findElement(By.xpath(SignInButton)).click();
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath(LogInButtonLoginPage)).click();
    }

    @Test
    public void validateErrorIsAppeared (){

        driver.get(myForkURL);
        driver.findElement(By.xpath(SignInButton)).click();
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath(LogInButtonLoginPage)).click();
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Error: email is incorrect')]")).isDisplayed());
    }

    @Test
    public void ValidateRememberMeCheckboxIsChecked (){

        driver.get(myForkURL);
        driver.findElement(By.xpath(SignInButton)).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).getText());
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
