package techproed.tests.day28_DataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C02_DataProviderTest {


    /*
    Google sayfasina gidip DataProvider ile belirtilen arac isimlerini aratalim.
    */
    @DataProvider
    public static Object[][] arabalar() {
        return new Object[][]{{"volvo"},{"audi"},{"mercedes"},{"ford"}};
    }

    @Test(dataProvider = "arabalar")
    public void test01(String araclar) {
        //Google sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        GooglePage googlePage = new GooglePage();
        googlePage.googleCookies.click();//--> cookies i kapatma


        //Dataprovider'daki verilerle arama yapalım
        googlePage.aramaKutusu.sendKeys(araclar);
        googlePage.googleSuche.click();

        //Her arama icin sayfa resmi alalim
        ReusableMethods.tumSayfaResmi(araclar);

        //Sayfayi kapatalim.
        Driver.closeDriver();

    }
















}
