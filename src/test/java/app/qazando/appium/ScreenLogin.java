package app.qazando.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class ScreenLogin {

    public ScreenLogin(AppiumDriver<RemoteWebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(id = "login_username")
    @iOSFindBy(accessibility = "login_username")
    private RemoteWebElement campoemail;


    @AndroidFindBy(id = "login_password")
    @iOSFindBy(accessibility = "login_password")
    private  RemoteWebElement camposenha;

    @AndroidFindBy(id = "login_button")
    @iOSFindBy(accessibility = "login_button")
    private RemoteWebElement buttonlogin;


    public void escreverEmail(){
        campoemail.sendKeys("qareda@gmail.com");
    }

    public void escreverSenha(){
        camposenha.sendKeys("1234");
    }

    public void clickButton(){
        buttonlogin.click();
    }


    public void logar(String email, String senha){
        campoemail.sendKeys(email);
        camposenha.sendKeys(senha);
        buttonlogin.click();
    }
}
