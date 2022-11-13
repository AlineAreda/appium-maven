package app.qazando.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class DeviceFarmLogin {

    private static ScreenLogin ScreenLogin;

    private static AppiumDriver<RemoteWebElement> driver;

    @BeforeClass
    public static void caps() throws MalformedURLException, MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "alineareda_agU6bA");
        caps.setCapability("browserstack.key", "pn673o58bgpM6xc2xzWK");

        // Set URL of the application under test
        caps.setCapability("app", "bs://6b21bd09eef8edfa5c56bf9b283e1bbc8839c92d");


        driver = new AndroidDriver(new URL("http://hub.browserstack.com/wd/hub"), caps);
        ScreenLogin = new ScreenLogin(driver);
    }


    @Test
    public void testeLogar(){
        ScreenLogin.logar("qareda@gamil.com", "123456");
    }

}