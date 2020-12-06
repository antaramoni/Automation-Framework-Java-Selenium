package seleniumtest;

import org.junit.Test;
import testpackage.pages.HomePage;

public class SearchTest_03 extends TestInitialize {

    @Test
    public void SearchTest03() throws InterruptedException {

        HomePage homepage = new HomePage();


        try {

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
