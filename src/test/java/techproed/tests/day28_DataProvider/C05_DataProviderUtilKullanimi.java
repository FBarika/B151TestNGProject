package techproed.tests.day28_DataProvider;


import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtil;

public class C05_DataProviderUtilKullanimi {

    @Test(dataProvider = "sehirVerileri",dataProviderClass = DataProviderUtil.class)//--> virgülden sonra yazdigimiz parametre ile dataprovider imizi farkli bir class ta olusturabiliyoruz.
    public void test01(String sehir,String bolge,int plaka) {
        System.out.println(sehir+ " | "+bolge+" | "+plaka);
    }

    //farkli bir classtan method olusturacaksak dataprovider class olusturup utilclass ekleyebiliriz.
    // Bu sekilde--> dataProviderClass = DataProviderUtil.class
    //eger bu sekilde yaparsam method utilclass icinde olusur. method static olursa daha rahat olur.
}
