package seleniumtest;


import com.automation.framework.config.Settings;
import org.testng.annotations.Test;
import testelements.pages.HomePage;




public class SearchTest_01 extends TestInitialize {


    @Test
    public void SearchTest01() throws InterruptedException {

        extent.createTest("Scenario-1: Validating Search Textbox and warning message by entering single character");

        HomePage homepage = new HomePage();

        try {

            // Read data from TestConfig.properties
            String singleKey = Settings.SingleKey;

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys(singleKey);

            // Click on Search button
            homepage.btnSearch.click();

            Thread.sleep(2000);

            // validate the warning message
            assert(homepage.warningMsg.getText().equals("Search term minimum length is 3 characters"));

            Thread.sleep(2000);


        } catch (Exception e) {
            System.out.println("Test Failed :" + e);
        }


    }





}


