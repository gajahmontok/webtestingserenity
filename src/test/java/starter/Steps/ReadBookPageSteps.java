package starter.Steps;

import starter.Pages.ReadBookPage;

public class ReadBookPageSteps {
    ReadBookPage readBookPage;

    public void openHomePage(){
        readBookPage.open();
    }

    public void openLoginPage(){
        readBookPage.clickIconBookstore();
        readBookPage.clickButtonLogin();
    }

    public void readBookPage(){
        readBookPage.inputUsernamePassword();
        readBookPage.clickBtnLogin();
        readBookPage.clickBook();
    }
}
