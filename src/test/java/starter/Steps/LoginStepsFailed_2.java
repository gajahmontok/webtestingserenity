package starter.Steps;

import starter.Pages.LoginPageFailed_2;

public class LoginStepsFailed_2 {
    LoginPageFailed_2 loginPageFailed_2;

    public void openHomePage() {
        loginPageFailed_2.open();
    }
    public void openLoginPage(){
        loginPageFailed_2.clickIconBookstore();
        loginPageFailed_2.clickButtonLogin();
    }
    public void inputValidUsernameandInvalidPassword(){
        loginPageFailed_2.inputUsernamePassword();
        loginPageFailed_2.clickBtnLogin();
    }
    public void valdate(){
        loginPageFailed_2.validasiPassword();
    }
}