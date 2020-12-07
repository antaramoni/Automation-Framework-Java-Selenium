package seleniumtest;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import testelements.pages.HomePage;

import java.util.List;

public class SearchTest_06 extends TestInitialize {
    @Test
    public void SearchTest06() throws InterruptedException {

        extent.createTest("Scenario-6:");
        HomePage homepage = new HomePage();


        try {

            Thread.sleep(2000);

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys("aaa");

            // Click on Search button
            homepage.btnSearch.click();

            // Click on Advanced Search checkbox
            homepage.advSearchCheckbox.click();

            // Click on Manufacturer drop down
            homepage.manufacturerDdl.click();

            Thread.sleep(5000);

            // Manufacturer drop-down
            Select s= new Select(homepage.manufacturerDdl);


            // Array with all the Manufacturer drop-down values
            String[] manulist = {"All","Apple","HP","Nike"};

            List<WebElement> options = s.getOptions();
            for(WebElement manu:options)
            {
                boolean match = false;
                for (int i=0; i<manulist.length; i++)
                {
                    if (manu.getText().equals(manulist[i]))
                    {
                        match = true;
                    }
                }
                assert(match);
            }


        } catch (Exception e) {
            System.out.println("Test Failed :" + e);
        }


    }

}

