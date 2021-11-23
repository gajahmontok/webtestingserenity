package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CreateListBookPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div")
    WebElement iconBookstore;

    public void clickIconBookstore(){
        iconBookstore.click();
    }

    @FindBy (id = "login")
    WebElement buttonLogin;

    public void clickButtonLogin(){
        buttonLogin.click();
    }

    @FindBy(id = "userName")
    WebElement inputUsername;

    @FindBy(id = "password")
    WebElement inputPassword;

    @FindBy(id = "login")
    WebElement tombolLogin;

    public void inputUsernamePassword(){
        inputUsername.sendKeys("galang123");
        inputPassword.sendKeys("P@ssw0rd");
    }

    public void clickBtnLogin(){
        tombolLogin.click();
    }

    @FindBy(xpath = "//*[@id=\"see-book-Git Pocket Guide\"]/a")
    WebElement readBook;

    public void clickBook(){
        readBook.click();
    }

    @FindBy(id = "addNewRecordButton")
    WebElement buttonCreateListBook;

    public void clickButtonBook(){
        buttonCreateListBook.click();
    }
}
