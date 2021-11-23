package starter.Steps;

import starter.Pages.CreateListBookPage;

public class CreateListBookSteps {
    CreateListBookPage createListBookPage;

    public void openHomePage(){
        createListBookPage.open();
    }

    public void openLoginPage(){
        createListBookPage.clickIconBookstore();
        createListBookPage.clickButtonLogin();
        createListBookPage.inputUsernamePassword();
    }

    public void createAddListBook(){
        createListBookPage.clickBtnLogin();
        createListBookPage.clickBook();
        createListBookPage.clickButtonBook();
    }
}
