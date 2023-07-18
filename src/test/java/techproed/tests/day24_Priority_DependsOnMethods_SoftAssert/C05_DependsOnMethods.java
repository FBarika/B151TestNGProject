package techproed.tests.day24_Priority_DependsOnMethods_SoftAssert;

import org.testng.annotations.Test;

public class C05_DependsOnMethods {
    @Test
    public void test01() {
        System.out.println("erol");
    }
    @Test(dependsOnMethods = "test01")
    public void test02() {
        System.out.println("evren");
    }
    @Test(dependsOnMethods = "test02")
    public void test03() {
        System.out.println("esen");
    }
    @Test(dependsOnMethods = "test03")
    public void test04() {
        System.out.println("mehmet");
    }
    /*
    Burada class seviyesinden Run edersek hatasiz bir sekilde calisiyor ve hepsini yazdiriyor ama test03 veya test04 seviyesinden run edersek arada depensonMethodu
    oldugu icin baglantiyi bütün halinde kuramiyor ve hata aliyoruz.
     */
}
