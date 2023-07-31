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
    /*
     @Test
    public void test01() {
        //Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));

        //"Vendor" olarak giris yap
        Page page = new Page();
        page.signinButton.click();
        page.vendorUsername.sendKeys(ConfigReader.getProperty("vendorEmail"), Keys.TAB,
                ConfigReader.getProperty("vendorSifre"), Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);

        ReusableMethods.bekle(3);
        //Sayfayi 'Top 20 Best Seller'  i görünceye kadar asagi indir
        ReusableMethods.scroll(page.top20BestSeller);

        //Top 20 Best Seller' altindaki ilk ürüne tikla
        page.top20BestSellerAltindakiIlkÜrün.click();

        //ADD TO CART' butonuna tikla
        page.addCart.click();
        ReusableMethods.bekle(2);
        //Arama kutusunda 'kazak' arat.
        page.aramaKutusu.sendKeys(ConfigReader.getProperty("aramaKutusundaAratilacakÜrün"), Keys.ENTER);

        //ilk cikan ürüne tikla
        ReusableMethods.scroll(page.kazakIlkCikanÜrün);
        ReusableMethods.bekle(2);
        page.kazakIlkCikanÜrün.click();

        //ADD TO CART' butonuna tikla
        page.addCart.click();

        //Sayfanin sag üst kösesindeki 'Cart' ikonuna tikla
        page.cartIkonu.click();
        ReusableMethods.bekle(2);

        //Secilen ürünlerin sepete eklendigini dogrula
        Assert.assertTrue(page.sepettekiIlkUrun.isDisplayed());

        Assert.assertTrue(page.sepettekiIkinciUrun.isDisplayed());

        //CHECKOUT' butonuna tikla
        page.checkoutButonu.click();

        //Order Complete' sayfasinda alinacak ürünlerin oldugunu dogrula.
        Assert.assertTrue(page.orderSayfasiIlkÜrün.isDisplayed());
        Assert.assertTrue(page.orderSayfasiIkinciÜrün.isDisplayed());

        //First Name' ve 'Last Name' kutusuna sirasiyla isim ve soyisim gir
        page.billingUsername.sendKeys(ConfigReader.getProperty("vendorFirstname"), Keys.TAB, ConfigReader.getProperty("vendorLastname"));

        //Sayfayi Country ddm görünene kadar scroll yap
        ReusableMethods.scroll(page.ddmUlke);

        //Country/Region dropdown menüsünden Turkey 'i sec
        ReusableMethods.ddmVisibleText(page.ddmUlke, "Turkey");

        //Sirasiyla Stress address, Postcode/ZIP, Town/Cty ,Phone kutularini doldur.
        page.billingAddress.clear();
        page.billingAddress.sendKeys(ConfigReader.getProperty("billingAddress"), Keys.TAB, Keys.TAB,
                ConfigReader.getProperty("billingPostcode"), Keys.TAB, ConfigReader.getProperty("billingTown"),
                Keys.TAB, Keys.TAB, ConfigReader.getProperty("billingPhone"));

        ReusableMethods.bekle(2);

        //Sayfayi province dropdown görünene kadar scroll yap
        ReusableMethods.scroll(page.totalAmount);

        //Province' dropdown menüsünden sehir sec.
        ReusableMethods.ddmVisibleText(page.ddmSehir, "İstanbul");

        //Email' kutusuna otomatik olarak mailin geldigini dogrula.
        Assert.assertEquals(page.billingEmail.getAttribute("value"), ConfigReader.getProperty("vendorEmail"));

        //Sayfayi totalAmount a scroll yap
        //ReusableMethods.scroll(page.totalAmount);

        //Toplam ödenecek olan miktarin göründügünü dogrula.
        Assert.assertTrue(page.totalAmount.isDisplayed());

        //Pay at the door' butonunu sec ve 'Pay at the door' secilebildigini, 'Wire transfer/EFT' butonunun secilmedigini dogrula.
        page.payAtTheDoorButon.click();
        Assert.assertTrue(page.payAtTheDoorButon.isSelected());
        Assert.assertFalse(page.wireTransferButon.isSelected());

        //Wire transfer/EFT' radiobuttonu sec ve  'Wire transfer/EFT' secilebildigini, 'Pay at the door' butonunun secilmedigini dogrula.
        page.wireTransferButon.click();
        Assert.assertTrue(page.wireTransferButon.isSelected());
        Assert.assertFalse(page.payAtTheDoorButon.isSelected());

        //PLACE ORDER' butonuna tikla
        page.placeOrderButon.click();
        ReusableMethods.bekle(8);

        //Thank you. Your order has been received.' yazisinin göründügünü dogrula.
        Assert.assertTrue(page.thankYouYazisi.isDisplayed());

        ReusableMethods.bekle(2);
        //Sayfanin en asagisina inip 'My Order' butonuna tikla
        ReusableMethods.scroll(page.myOrderButon);
        ReusableMethods.bekle(2);
        page.myOrderButon.click();

        //Sayfanin siparis ayrintilarini görene kadar asagi in
        ReusableMethods.scroll(page.siparisAyrinti1);

        //Siparis listesinin ayrintilarinin göründügünü dogrula.
        Assert.assertTrue(page.siparisAyrinti1.isDisplayed());
        Assert.assertTrue(page.siparisAyrinti2.isDisplayed());
        Assert.assertTrue(page.siparisAyrinti3.isDisplayed());
        Assert.assertTrue(page.siparisAyrinti4.isDisplayed());

    }
     */

    /*
    @Test
    public void test01() {

        //Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));

        //"Vendor" olarak giris yap
        Page page = new Page();
        page.signinButton.click();
        page.vendorUsername.sendKeys(ConfigReader.getProperty("vendorEmail"), Keys.TAB,
                ConfigReader.getProperty("vendorSifre"), Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);

        ReusableMethods.bekle(3);
        //Sayfayi 'Top 20 Best Seller'  i görünceye kadar asagi indir
        ReusableMethods.scroll(page.top20BestSeller);

        //Top 20 Best Seller' altindaki ilk ürüne tikla
        page.top20BestSellerAltindakiIlkÜrün.click();

        //ADD TO CART' butonuna tikla
        page.addCart.click();
        ReusableMethods.bekle(2);
        //Arama kutusunda 'kazak' arat.
        page.aramaKutusu.sendKeys(ConfigReader.getProperty("aramaKutusundaAratilacakÜrün"), Keys.ENTER);

        //ilk cikan ürüne tikla
        ReusableMethods.scroll(page.kazakIlkCikanÜrün);
        ReusableMethods.bekle(2);
        page.kazakIlkCikanÜrün.click();

        //ADD TO CART' butonuna tikla
        page.addCart.click();

        //Sayfanin sag üst kösesindeki 'Cart' ikonuna tikla
        page.cartIkonu.click();
        ReusableMethods.bekle(2);

        //Secilen ürünlerin sepete eklendigini dogrula
        Assert.assertTrue(page.sepettekiIlkUrun.isDisplayed());

        Assert.assertTrue(page.sepettekiIkinciUrun.isDisplayed());

        //CHECKOUT' butonuna tikla
        page.checkoutButonu.click();

        //Order Complete' sayfasinda alinacak ürünlerin oldugunu dogrula.
        Assert.assertTrue(page.orderSayfasiIlkÜrün.isDisplayed());
        Assert.assertTrue(page.orderSayfasiIkinciÜrün.isDisplayed());

        //First Name' ve 'Last Name' kutusuna  otomatik girilen isim ve soyisimleri sil.
        page.billingUsername.clear();
        page.billingLastname.clear();

        //Country/Region dropdowm menüsünden Turkey 'i sec
        ReusableMethods.scroll(page.billingUsername);
        ReusableMethods.bekle(2);
        ReusableMethods.ddmVisibleText(page.ddmUlke,"Turkey");

        //Stress address, Postcode/ZIP, Town/Cty ,Phone kutularini sil
        page.billingAddress.clear();
        page.billingCity.clear();
        page.billingPostcode.clear();
        page.billingPhone.clear();

        //Province' dropdown menüsünden sehir secme
        ReusableMethods.scroll(page.ddmSehir);


        //Email' kutusuna otomatik girilen emaili sil
        page.billingEmail.clear();

        // 'Wire transfer/EFT' radiobuttonu sec
        page.wireTransferButon.click();

        //PLACE ORDER' butonuna tikla
        page.placeOrderButon.click();

        //BILLING FIRST NAME is required field.' ,'BILLING LAST NAME is required field.',
        // 'BILLING STREET ADDRESS is required field.','BILLING POSTCODE/ZIP is required field.',
        // 'BILLING TOWN/CITY is required field.','BILLING PHONE is required field.',
        // 'BILLING EMAIL ADDRESS is required field.','BILLING PROVINCE is a required field.' mesajlarinin göründügünü dogrula.

        Assert.assertTrue(page.requiredYazi1.isDisplayed());
        Assert.assertTrue(page.requiredYazi2.isDisplayed());
        Assert.assertTrue(page.requiredYazi3.isDisplayed());
        Assert.assertTrue(page.requiredYazi4.isDisplayed());
        Assert.assertTrue(page.requiredYazi5.isDisplayed());
        Assert.assertTrue(page.requiredYazi6.isDisplayed());
        Assert.assertTrue(page.requiredYazi7.isDisplayed());
        Assert.assertTrue(page.requiredYazi8.isDisplayed());

}
     */
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
    @FindBy(xpath = "//*[@id='username']")
    public WebElement vendorUsername;
    @FindBy(xpath = "(//*[@class='w-icon-account'])[1]")
    public WebElement signinButton;
    @FindBy(xpath = "//*[.='Top 20 Best Seller']")
    public WebElement top20BestSeller;
    @FindBy(xpath = "(//*[@class='woocommerce-loop-product__title'])[1]")
    public WebElement top20BestSellerAltindakiIlkÜrün;
    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement addCart;
    @FindBy(xpath = "(//*[@type='search'])[1]")
    public WebElement aramaKutusu;
    @FindBy(xpath = "(//*[@class='woocommerce-loop-product__title'])[1]")
    public WebElement kazakIlkCikanÜrün;
    @FindBy(xpath = "(//*[@class='w-icon-cart'])[1]")
    public WebElement cartIkonu;
    @FindBy(xpath = "(//*[@href='https://allovercommerce.com/urun/producds/'])[1]")
    public WebElement sepettekiIlkUrun;
    @FindBy(xpath = "(//*[@href='https://allovercommerce.com/urun/kazak-2/'])[3]")
    public WebElement sepettekiIkinciUrun;
    @FindBy(xpath = "//*[.='Checkout']")
    public WebElement checkoutButonu;
    @FindBy(xpath = "(//*[.='earphone product'])[3]")
    public WebElement orderSayfasiIlkÜrün;
    @FindBy(xpath = "(//*[.='kazak'])[3]")
    public WebElement orderSayfasiIkinciÜrün;
    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement billingUsername;
    @FindBy(xpath = "//*[@id='billing_country']")
    public WebElement ddmUlke;
    @FindBy(xpath = "//*[@id='billing_address_1']")
    public WebElement billingAddress;
    @FindBy(xpath = "//*[@id='billing_state']")
    public WebElement ddmSehir;
    @FindBy(xpath = "//*[@id='billing_email']")
    public WebElement billingEmail;
    @FindBy(xpath = "(//*[@class='woocommerce-Price-amount amount'])[7]")
    public WebElement totalAmount;
    @FindBy(xpath = "//*[@id='billing_last_name']")
    public WebElement billingLastname;
    @FindBy(xpath = "(//*[@type='radio'])[2]")
    public WebElement payAtTheDoorButon;
    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement wireTransferButon;
    @FindBy(xpath = "//*[@id='place_order']")
    public WebElement placeOrderButon;
    @FindBy(xpath = "//*[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement thankYouYazisi;
    @FindBy(xpath = "//*[@id='menu-item-1066']")
    public WebElement myOrderButon;
    @FindBy(xpath = "//*[@class='woocommerce-orders-table__cell woocommerce-orders-table__cell-order-total']")
    public WebElement siparisAyrinti1;
    @FindBy(xpath = "//*[@class='woocommerce-orders-table__cell woocommerce-orders-table__cell-order-date']")
    public WebElement siparisAyrinti2;
    @FindBy(xpath = "//*[@class='woocommerce-orders-table__cell woocommerce-orders-table__cell-order-number']")
    public WebElement siparisAyrinti3;
    @FindBy(xpath = "//*[@class='woocommerce-orders-table__cell woocommerce-orders-table__cell-order-status']")
    public WebElement siparisAyrinti4;
    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement billingPostcode;
    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement billingCity;
    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement billingPhone;
    @FindBy(xpath = "//*[@class='showcoupon']")
    public WebElement requiredYazi1;
    @FindBy(xpath = " (//*[@class=' alert alert-simple alert-icon alert-close-top alert-danger'])[1]")
    public WebElement requiredYazi2;
    @FindBy(xpath = " (//*[@class=' alert alert-simple alert-icon alert-close-top alert-danger'])[2]")
    public WebElement requiredYazi3;
    @FindBy(xpath = " (//*[@class=' alert alert-simple alert-icon alert-close-top alert-danger'])[3]")
    public WebElement requiredYazi4;
    @FindBy(xpath = " (//*[@class=' alert alert-simple alert-icon alert-close-top alert-danger'])[4]")
    public WebElement requiredYazi5;
    @FindBy(xpath = " (//*[@class=' alert alert-simple alert-icon alert-close-top alert-danger'])[5]")
    public WebElement requiredYazi6;
    @FindBy(xpath = " (//*[@class=' alert alert-simple alert-icon alert-close-top alert-danger'])[6]")
    public WebElement requiredYazi7;
    @FindBy(xpath = " (//*[@class=' alert alert-simple alert-icon alert-close-top alert-danger'])[7]")
    public WebElement requiredYazi8;

     */


}
