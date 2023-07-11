package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BaseMain{

    public LoginPage(ChromeDriver driver){
    super(driver);
    }

    public String EmailField = "email";
    public String passwordField = "//input[@id='password']";
    private String validEmail = "katietest@gmail.com";
    private String validPassword = "Password1006!";
    private String invalidEmail = "test@gmail.com";
    private String invalidPassword = "password";
    public String LogInButtonLoginPage = "//button[@type ='submit']";
    public String ErrorWrongEmail = "//p[contains(text(),'Error: email is incorrect')]";
    public String RememberMeCheckBox = "//input[@id='auth-page-remember-me']";
    public String CheckBoxText = "//div[contains(text(),'Remember Me')]";

    public void fillUpCredentials (){
        driver.findElement(By.id(EmailField)).sendKeys(validEmail);
        driver.findElement(By.id(passwordField)).sendKeys(validPassword);

    }

    public void fillUpInvalidCredentials (){
        driver.findElement(By.id(EmailField)).sendKeys(invalidEmail);
        driver.findElement(By.id(passwordField)).sendKeys(invalidPassword);
    }

    public void emailPasswordFieldsSignInButtonAreDisplayed (){
        driver.findElement(By.id(EmailField)).isDisplayed();
        driver.findElement(By.id(passwordField)).isDisplayed();
        driver.findElement(By.xpath(LogInButtonLoginPage)).isDisplayed();
    }

    public void submitButtonCredentials (){
        driver.findElement(By.xpath(LogInButtonLoginPage)).click();
    }

    public void displayErrorMessage (){
        System.out.println(driver.findElement(By.xpath(ErrorWrongEmail)).getText());
    }

    public void checkIfRememberMeIsSelected (){
        System.out.println(driver.findElement(By.xpath(RememberMeCheckBox)).isSelected());
    }

    public void checkBoxTextIsDisplayed (){
        driver.findElement(By.xpath(CheckBoxText)).isDisplayed();
    }
}
