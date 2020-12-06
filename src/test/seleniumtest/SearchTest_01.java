package seleniumtest;

import org.junit.Test;
import testpackage.pages.HomePage;



public class SearchTest_01 extends TestInitialize {


    @Test
    public void SearchTest01() throws InterruptedException {

        HomePage homepage = new HomePage();

        try {

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys("a");

            // Click on Search button
            homepage.btnSearch.click();

            Thread.sleep(5000);

            // validate the warning message
            assert(homepage.warningMsg.getText().equals("Search term minimum length is 3 characters"));

            Thread.sleep(5000);


        } catch (Exception e) {
            System.out.println("Test Failed :" + e);
        }


 /*

        // Switch to the iframe of https://demo.nopcommerce.com/
        DriverContext.Driver.switchTo().frame(DriverContext.Driver.findElement(By.xpath("/html/body/main/div/iframe")));
        // homepage.iframe();

        DriverContext.Driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("aaaa");
        // homepage.inputSearch.sendKeys("aaaa");

        DriverContext.Driver.findElement(By.xpath("//*[@id='small-search-box-form']/input[2]")).click();
        //homepage.btnSearch.click();

*/



    }
}


