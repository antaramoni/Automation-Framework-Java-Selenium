package seleniumtest;

import org.junit.Test;
import testpackage.pages.HomePage;

public class SearchTest_02 extends TestInitialize {

    @Test
    public void SearchTest03() throws InterruptedException {

        HomePage homepage = new HomePage();


        try {

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys("aa");


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
