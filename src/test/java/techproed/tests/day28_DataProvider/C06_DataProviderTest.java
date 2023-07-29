package techproed.tests.day28_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C06_DataProviderTest {

    @DataProvider//(name = "test02") bunu yazip calistiracagimiz testn dataprovider in yanina test ismini yaznca sadece o tets calisiyor.
    // ya da asagidaki gibi tek bir dataprovider ile birden cok testi de baglayabilirz
    public static Object[][] veriler() {
        return new Object[][]{{"esen"},
                {"mehmet"},
                {"esma"},
                {"ali"},
                {"mert"},
                {"burcu"},
                {"yunus"}};
    }

    @Test(dataProvider = "veriler")
    public void test01(String data) {
        System.out.println(data);
    }

    @Test(dataProvider = "veriler")
    public void test02(String isim) {
        System.out.println(isim);

    }

    @Test(dataProvider = "veriler")
    public void test03(String name) {
        System.out.println(name);

    }

    @Test(dataProvider = "veriler")
    public void test04(String ad) {
        System.out.println(ad);

    }
}
