package techproed.tests.day23_Annotation;

import org.testng.annotations.*;

public class C01_Annotation {
    /*
    BeforeSuite ,test ve class en basta bir sefer ..AfterSuite, test ve class en son da bir sefer calisir before ve after methodlar
    ise her testin basinda sonunda bir kez calisir
     */
    @BeforeSuite
    public void suite(){
        System.out.println("Herseyden önce bir kez BeforeSuite calisir.");

    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Testlerden önce bir kez calisir.");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Her class'dan önce bir kez calisir");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Junitteki @Before notasyonu gibi her methodtan önce calisir.");
    }

    @Test
    public void test01() {
        System.out.println("Test1 calisti");
    }

    @Test
    public void test02() {
        System.out.println("Test2 calisti");
    }

    @Test
    public void test03() {
        System.out.println("Test3 calisti");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Herseyden sonra 1 kez calisir.");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Testlerden sonra 1 kez calisir.");
    }

    @AfterSuite
    public void afterClass(){
        System.out.println("Her class'dan sonra 1 kez calisir.");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Junitteki @After notasyonu gibi her methodtan sonra calisir.");
    }


}
