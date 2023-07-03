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
    public String EmailField = "email";
    public String passwordField = "//input[@id='password']";
    protected String EmailTxt = "test@gmail.com";
    protected String PasswordTxt = "password";
    public String ErrorWrongEmail = "//p[contains(text(),'Error: email is incorrect')]";
    public String RememberMeCheckBox = "//input[@id='auth-page-remember-me']";


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
        System.out.println(driver.findElement(By.id(EmailField)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(passwordField)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(LogInButtonLoginPage)).isDisplayed());

    }

    @Test
    public void validateInvalidEmailPasswordFieldsClickOnLoginButton (){

        driver.get(myForkURL);
        driver.findElement(By.xpath(SignInButton)).click();
        driver.findElement(By.id(EmailField)).sendKeys(EmailTxt);
        driver.findElement(By.xpath(passwordField)).sendKeys(PasswordTxt);
        driver.findElement(By.xpath(LogInButtonLoginPage)).click();
    }

    @Test
    public void validateErrorIsAppeared (){

        driver.get(myForkURL);
        driver.findElement(By.xpath(SignInButton)).click();
        driver.findElement(By.id(EmailField)).sendKeys(EmailTxt);
        driver.findElement(By.xpath(passwordField)).sendKeys(PasswordTxt);
        driver.findElement(By.xpath(LogInButtonLoginPage)).click();
        System.out.println(driver.findElement(By.xpath(ErrorWrongEmail)).getText());
    }

    @Test
    public void ValidateRememberMeCheckboxIsChecked (){

        driver.get(myForkURL);
        driver.findElement(By.xpath(SignInButton)).click();
        System.out.println(driver.findElement(By.xpath(RememberMeCheckBox)).isDisplayed());
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
