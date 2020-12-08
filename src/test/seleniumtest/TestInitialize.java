package seleniumtest;

import com.automation.framework.base.DriverContext;
import com.automation.framework.config.ConfigReader;
import com.automation.framework.config.Settings;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;


import java.io.IOException;

public class TestInitialize {

  ExtentReports extent = new ExtentReports();


    @BeforeSuite
    public void config(){

        String path= System.getProperty("user.dir")+ "//TestReports//index.html"; // Extent report path

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Search Module Test Automation Report");
        reporter.config().setDocumentTitle("Automation Test Report");
        extent.attachReporter(reporter);
        extent.setSystemInfo("Automation Tester","Antara Chowdhury");

    }


    @BeforeMethod

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


    @AfterMethod
    public void TearDown(ITestResult result) throws InterruptedException {

        //Closing the browser
        DriverContext.Driver.quit();

    }

    @AfterSuite
    public void TearDownFinal() throws InterruptedException {

        //Generate Report
        extent.flush();


    }


}
