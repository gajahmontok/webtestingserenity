package starter.Pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginPageFailed_3 extends PageObject{
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

    @FindBy(xpath = "//*[@id=\"login\"]")
    WebElement tombolLogin;

    public void inputUsernamePassword(){
        inputUserName.sendKeys("galang12");
        inputPassword.sendKeys("P@ssw0rd1234");
    }

    public void clickBtnLogin(){

        tombolLogin.click();
    }

    @FindBy(id = "password-value")
    WebElement textPassword;

    public void validasiPassword(){
        Assert.assertEquals("P@ssw0rd",textPassword.getText());
    }
}
