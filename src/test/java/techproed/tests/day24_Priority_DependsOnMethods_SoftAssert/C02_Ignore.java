package techproed.tests.day24_Priority_DependsOnMethods_SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_Ignore {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--lang=en");
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    /*
    Birden fazla test methodu calistirmak istedigimizde o anlik gereksiz gördügümüz test methodunu atlamak isteyebiliriz. Bunun icin
    @Test notasyonunun yanina yada üstüne @Ignore notasyonu eklememiz gerekir.
    @Ignore notasyonu ile atladigimiz method konsolda görünmez raporlamalarda görünür.
         Eger bir methodu tamamen iptal etmek istersek @Test notasyonundan sonra parametre olarak (enable=false)
         kullanabilirsiniz.Raporda da görünmez.
    */

    @Ignore//--> bu methodu console yazdirmayacak @Ignore dan dolayi ama raporlamada görünecek.
    @Test
    public void amazonTest() {
        driver.get("https://amazon.com");
    }

    @Test(enabled = false)//--> burada methodu tamamen iptal ediyoruz.Burada raporlamada da görünmez.
    public void youtubeTest() {
        driver.get("https://youtube.com");
    }

    @Test
    public void facebookTest() {
        driver.get("https://facebook.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
