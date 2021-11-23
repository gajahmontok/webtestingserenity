package starter.Steps;

import starter.Pages.LoginPageFailed_3;

public class LoginStepsFailed_3 {
    LoginPageFailed_3 loginPageFailed_3;

    public void openHomePage() {
        loginPageFailed_3.open();
    }
    public void openLoginPage(){
        loginPageFailed_3.clickIconBookstore();
        loginPageFailed_3.clickButtonLogin();
    }
    public void inputInvalidUsernameandPassword(){
        loginPageFailed_3.inputUsernamePassword();
        loginPageFailed_3.clickBtnLogin();
    }
    public void valdate(){
        loginPageFailed_3.validasiPassword();
    }
}