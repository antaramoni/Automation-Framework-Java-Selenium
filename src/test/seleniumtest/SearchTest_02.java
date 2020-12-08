package seleniumtest;


import com.automation.framework.config.Settings;
import org.testng.annotations.Test;
import testelements.pages.HomePage;

public class SearchTest_02 extends TestInitialize {



    @Test
    public void SearchTest02() throws InterruptedException {

        extent.createTest("Scenario-2:");

        HomePage homepage = new HomePage();


        try {

            // Read data from TestConfig.properties
            String doubleKey = Settings.DoubleKey;


            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys(doubleKey);


            // Click on Search button
            homepage.btnSearch.click();

            Thread.sleep(5000);

            // validate the warning message
            assert(homepage.warningMsg.getText().equals("Search term minimum length is 3 characters"));

            Thread.sleep(5000);


        } catch (Exception e) {
            System.out.println("Test Failed :" + e);
        }


    }
}
