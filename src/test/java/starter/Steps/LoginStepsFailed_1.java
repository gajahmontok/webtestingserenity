package starter.Steps;

import starter.Pages.LoginPageFailed_1;

public class LoginStepsFailed_1 {
    LoginPageFailed_1 loginPageFailed_1;

    public void openHomePage() {
        loginPageFailed_1.open();
    }
    public void openLoginPage(){
        loginPageFailed_1.clickIconBookstore();
        loginPageFailed_1.clickButtonLogin();
    }
    public void inputInvalidUsernameandValidPassword(){
        loginPageFailed_1.inputUsernamePassword();
        loginPageFailed_1.clickBtnLogin();
    }
    public void valdate(){
        loginPageFailed_1.validasiUsername();
    }
}
