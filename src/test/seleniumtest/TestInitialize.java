package seleniumtest;

import com.automation.framework.base.DriverContext;
import com.automation.framework.config.ConfigReader;
import com.automation.framework.config.Settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class TestInitialize {

    @Before
    public void Initialize() throws IOException {


        // Initial Config
        ConfigReader.PopulateSettings();

        String path = System.getProperty("user.dir");

        //Open the browser
        System.setProperty("webdriver.chrome.driver", path + "//chromedriver");
        // System.setProperty("webdriver.chrome.driver",path+"\\chromedriver.exe"); // For windows users

        DriverContext.Driver = new ChromeDriver();

        // Get Test url from GlobalConfig file
        String url = Settings.TestUrl;

        // Navigate to Test url
        DriverContext.Driver.navigate().to(url);

        // maximize the window
        DriverContext.Driver.manage().window().maximize();




    }

    @After
    public void TearDownTest()
    {

        //Closing the browser
        DriverContext.Driver.quit();


    }

}
