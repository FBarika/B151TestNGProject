package techproed.tests.day24_Priority_DependsOnMethods_SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C04_DependsOnMethods {
    WebDriver driver;
    @AfterMethod
    public void tearDown() {
        //driver.close();
    }

    @BeforeClass     // Burada beforeClass yaptik beforemethod yerine. Cünkü beforeMethod ta her methodttan önce calistigi icin driver i yeniliyor
                     //test02 yi test01 e baglasak bile driver. yenilendigi icin amazona gidemiyor.
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--lang=en");
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    //BeforeMethod kullanirsak her testten once BeforeMethod calisir daha sonra test methodu calisir. Farkli test methoduna gecince BeforeMethod bos bir driver aciyor ve aranan locate' i bulamayip hata verir
    //Ama BeforeClass yaparsak class basinda bir kez calistigi icin devaminda tum test methodlari birbirine bagli oldugu icin tek tek calismaya devam eder

    @Test
    public void test01() {
        driver.get("https://amazon.com");
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
    }

    @Test
    public void test03() {
        System.out.println("test03");
    }

    @Test(dependsOnMethods = "test03")
    public void test04() {
        System.out.println("test04");
    }

    @Test(dependsOnMethods = "test04")//burada hata verecek üst üste dependsonMethods kullanirsak hata verecek.
    public void test05() {
        System.out.println("test05");
    }
}
