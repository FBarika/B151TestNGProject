package techproed;

public class ödev {
    /*
    //4. kisi
    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement registerButton;
    @FindBy(xpath = "//*[@id='reg_username']")
    public WebElement username;
    @FindBy(xpath = "(//*[@type='checkbox'])[2]")
    public WebElement iAggree;
    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement signUp;
    @FindBy(xpath = "(//*[@class='submit-status'])[2]")
    public WebElement kayitliEmailveyaUsernameYazisi;
    @FindBy(xpath = "(//*[@type='email'])[1]")
    public WebElement email;
     */
/*
public class TC01 {
    @Test
    public void test01() {

        //Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        //Register butonuna tikla
        Page page = new Page();
        page.registerButton.click();

        //Kayitli olmayan username gir
        //Kayitli Email adresi gir
        //Sifreyi gir.
        page.username.sendKeys(ConfigReader.getProperty("kayitliOlmayanUsername"),Keys.TAB,
                ConfigReader.getProperty("kayitliEmail"),Keys.TAB,
                ConfigReader.getProperty("password"));

        // "I agree" mesajinin yanindaki kutucuga tikla
        page.iAggree.click();

        // SIGN UP buttonuna tikla
        ReusableMethods.bekle(3);
        page.signUp.click();
        ReusableMethods.bekle(2);

        //Gecersiz kayit islemini dogrula.
        Assert.assertTrue(page.kayitliEmailveyaUsernameYazisi.isDisplayed());

    }
}
 */
/*
public class TC02 {

    @Test
    public void test01() {

        //Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        //Register butonuna tikla
        Page page = new Page();
        page.registerButton.click();

        //Kayitli olan username gir
        //Kayitli olmayan Email adresi gir
        //Sifreyi gir.
        page.username.sendKeys(ConfigReader.getProperty("kayitliUsername"), Keys.TAB,
                ConfigReader.getProperty("kayitliOlmayanEmail"),Keys.TAB,ConfigReader.getProperty("password"));


        // "I agree" mesajinin yanindaki kutucuga tikla
        page.iAggree.click();

        // SIGN UP buttonuna tikla
        ReusableMethods.bekle(3);
        page.signUp.click();
        ReusableMethods.bekle(2);

        //Gecersiz kayit islemini dogrula.
        Assert.assertTrue(page.kayitliEmailveyaUsernameYazisi.isDisplayed());
    }
}

 */
    /*
public class TC03 {

    @Test
    public void test01() {
        //Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));

        //Register butonuna tikla
        Page page = new Page();
        page.registerButton.click();

        //Kayitli olan username gir
        //Kayitli Email adresi gir
        //Sifreyi gir.
        page.username.sendKeys(ConfigReader.getProperty("kayitliUsername"), Keys.TAB,
                ConfigReader.getProperty("kayitliEmail"),Keys.TAB,ConfigReader.getProperty("password"));

        // "I agree" mesajinin yanindaki kutucuga tikla
        page.iAggree.click();

        // SIGN UP buttonuna tikla
        ReusableMethods.bekle(3);
        page.signUp.click();
        ReusableMethods.bekle(2);

        //Gecersiz kayit islemini dogrula.
        Assert.assertTrue(page.kayitliEmailveyaUsernameYazisi.isDisplayed());
        //Kayitli olmayan Email adresi gir

        page.email.clear();
        page.email.sendKeys(ConfigReader.getProperty("kayitliOlmayanEmail"),Keys.ENTER);

        //Gecersiz kayit islemini dogrula.(username iceriyor mu)
        Assert.assertTrue(page.kayitliEmailveyaUsernameYazisi.getText().contains("username"));
    }
}

     */
}
