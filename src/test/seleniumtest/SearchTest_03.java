package seleniumtest;


import org.testng.annotations.Test;
import testelements.pages.HomePage;

public class SearchTest_03 extends TestInitialize {

    @Test
    public void SearchTest03() throws InterruptedException {

        extent.createTest("Scenario-3:");

        HomePage homepage = new HomePage();


        try {

            Thread.sleep(2000);

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys("aaa");


            // Click on Search button
            homepage.btnSearch.click();

            Thread.sleep(5000);

            // validate the warning message
            assert(homepage.warningMsg.getText().equals("No products were found that matched your criteria."));

            Thread.sleep(5000);


        } catch (Exception e) {
            System.out.println("Test Failed :" + e);
        }


    }
}
