package app.qazando.appium;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import java.net.MalformedURLException;
import java.net.URL;

public class TesteLogin {

    private static  ScreenLogin ScreenLogin;
    private static AppiumDriver<RemoteWebElement> driver;

    public static String plataforma = "";


    @Before
    public void cap() throws MalformedURLException {

        plataforma = System.getProperty("plataforma");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if(plataforma.equals("android")){
            capabilities.setCapability("app", "src/apps/app-debug.apk");
            capabilities.setCapability("deviceName", "Emulator");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
            ScreenLogin = new ScreenLogin(driver);

        }else{
            capabilities.setCapability("app", "src/apps/LoginExample.app");
            capabilities.setCapability("deviceName", "iPhone 13");
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("platformVersion", "15.0");
            capabilities.setCapability("automationName" , "XCUITest");
            driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
            ScreenLogin = new ScreenLogin(driver);

        }
    }

    @Test
    public void testeLogar(){
        ScreenLogin.logar("qareda@gamil.com", "123456");
    }

    @Test
    public void testeCamposNaoPodemEstarVazios(){
        ScreenLogin.clickButton();
    }

    @After
    public void end() {
        driver.quit();
    }
}
