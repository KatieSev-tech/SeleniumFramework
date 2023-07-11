
package testcases;

import org.testng.annotations.Test;

    public class LoginTest extends BaseTest{

        @Test
        public void signInPage(){
            homePage.openSignInPage();
        }
        @Test
        public void validateEmailPasswordFieldsLoginButtonAreDisplayed (){

            homePage.openSignInPage();
            loginPage.emailPasswordFieldsSignInButtonAreDisplayed();

        }

        @Test
        public void validateInvalidEmailPasswordFieldsClickOnLoginButton (){

            homePage.openSignInPage();
            loginPage.fillUpInvalidCredentials();
            loginPage.submitButtonCredentials();
        }

        @Test
        public void validateErrorIsAppeared (){

            homePage.openSignInPage();
            loginPage.fillUpInvalidCredentials();
            loginPage.submitButtonCredentials();
            loginPage.displayErrorMessage();
        }

        @Test
        public void ValidateRememberMeCheckboxIsChecked (){

            homePage.openSignInPage();
            loginPage.checkIfRememberMeIsSelected();
        }

        @Test
        public void validateCheckBoxTextIsDisplayed () {
            homePage.openSignInPage();
            loginPage.checkBoxTextIsDisplayed();
        }
        @Test
        public void validateValidEmailPasswordClickLoginButton () {
            homePage.openSignInPage();
            loginPage.fillUpCredentials();
            loginPage.submitButtonCredentials();
        }



    }
