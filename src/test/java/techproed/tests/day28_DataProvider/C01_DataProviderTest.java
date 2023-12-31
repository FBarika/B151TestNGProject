package techproed.tests.day28_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C01_DataProviderTest {


    /*
    Dataprovider bircok veriyi testcaselere loop kullanmadan aktarmak icin kullanilir.
    TestNG den gelen bir özelliktir.2 boyutlu Object Array return eder.
    Kullanimi icin @Test notasyonundan sonra parametre olarak (dataprovider="method ismi") yazilir.
    Kac tane veri ile calisacaksak test methoduna o kadar parametre eklenir.
    Data driven testing(DDT) de datalarimizi 3 farkli sekilde kullanabiliriz.
        1-.properties dosyasindan datalari alabiliriz. -->ConfigReader.getProperty() ile
        2-Excel dosyasindan datalari alabiliriz.    -->ExcelReader class'i ile
        3-DataProvider kullanarak datalari alabiliriz.  -->DataProvider methodu ile
    */

    @DataProvider(name = "test02") //--> Bu dataProvider'i test02 methodu icin kullan anlamina gelir.
    public static Object[][] isimler() {
        return new Object[][]{{"esen"},
                {"mehmet"},
                {"esma"},
                {"ali"},
                {"mert"},
                {"burcu"},
                {"yunus"}};
    }

    @DataProvider
    public static Object[][] arabalar() {
        return new Object[][]{
                {"ford"},
                {"mercedes"},
                {"volvo"},
                {"audi"}};
    }
    /*
    Olusturdugumuz dataprovider methodunu baska bir test methodunda da kullanabiliriz.
     */

    @Test(dataProvider = "isimler")
    public void test01(String data) {
        System.out.println(data);
    }

    @Test(dataProvider = "test02")
    public void test02(String isim) {

    }

    @Test(dataProvider = "arabalar")
    public void test03( String arabalar) {
        System.out.println(arabalar);

    }
    /*
    dataProvider'i database veya excel gibi dusunebiliriz.
    Istersek 10 tane test methodu olusturup burdan istedigimiz veriyi cekip kullanabiliriz
     */


}
