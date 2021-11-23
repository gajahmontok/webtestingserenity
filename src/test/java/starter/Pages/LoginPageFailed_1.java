package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginPageFailed_1 extends PageObject {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div")
    WebElement iconBookstore;

    public void clickIconBookstore(){
        iconBookstore.click();
    }

    @FindBy(id = "login")
    WebElement buttonLogin;

    public void clickButtonLogin(){
        buttonLogin.click();
    }

    @FindBy(id = "userName")
    WebElement inputUserName;

    @FindBy(id = "password")
    WebElement inputPassword;

    public void inputUsernamePassword(){
        inputUserName.sendKeys("galang");
        inputPassword.sendKeys("P@ssw0rd");
    }

    @FindBy(id = "login")
    WebElement btnLogin;

    public void clickBtnLogin(){
        btnLogin.click();
    }

    @FindBy(id = "userName-value")
    WebElement textUserName;

    public void validasiUsername(){
        Assert.assertEquals("manto.otnam",textUserName.getText());
    }
}
