package starter.Steps;

import starter.Pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    public void openHomePage(){
        loginPage.open();
    }
    public void openLoginPage(){
        loginPage.clickIconBookstore();
        loginPage.clickButtonLogin();
    }
    public void inputValidUsernamePassword(){
        loginPage.inputUsernamePassword();
        loginPage.clickBtnLogin();
    }
    public void validate(){
        loginPage.validasiUsername();
    }
}