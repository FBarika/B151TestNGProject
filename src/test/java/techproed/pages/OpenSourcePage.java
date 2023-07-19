package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {
    /*
    TestNG de locatelerimizi pages package altinda olusturdugumuz class lar icinde aliriz.
    Bu class icinde Driver imizi tanimlamak ve webelementleri olusturabilmek icin constructor olusturup bu cons. icinde PageFactory classindan
    initelements methodunu kullanarak driverimizi bu class a tanimlariz.
     */

    public OpenSourcePage(){
        PageFactory.initElements(Driver.getDriver(),this);
        /*
        Webelementleri locate edebilmek icin finelement methodu kullaniyorduk.@FindBy notasyonu ile artik findElement() methodunu kullanmayip
         @FindBy notasyonu icinde driver'in yerini tarif etmemiz gerekiyor.
                Yukaridaki(Driver.getDriver(),this) komutu burada ihtiyac duydugum driver,Driver classindaki getDriver() methodundaki driver demek oluyor.
         */
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitbutton;

    @FindBy(xpath = "//h6")
    public WebElement verify;






}
