package homeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw_02 {
    public static void main(String[] args) throws InterruptedException {
        //        1-driver olusturalim
        //        2-java class'imiza chromedriver.exe'yi tanitalim

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //        3-driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();

        //        4-https://github.com/ adresine gidelim
        driver.navigate().to("https://github.com/");

        //        5-Ardindan https://www.hepsiburada.com/ adrsine gidelim
        driver.navigate().to("https://www.ebay.com/");

        //        6-Title ve url console da yazdirin ve yine title ve url in "burada" kelimesini icerip icermedigini kontrol edelim
        String actualTitle = driver.getTitle();
        String actualUrl = driver.getCurrentUrl();
        String arananKelime ="ebay";

        System.out.println(actualTitle);
        System.out.println(actualUrl);

        if (actualTitle.contains(arananKelime)){
            System.out.println("Title "+arananKelime+ " kelimesini iceriyor.");
        }else{
            System.out.println("Title "+arananKelime+" kelimesini icermiyor.");
        }

        if (actualUrl.contains(arananKelime)){
            System.out.println("Url "+arananKelime+ " kelimesini iceriyor.");
        }else{
            System.out.println("Url "+arananKelime+" kelimesini icermiyor.");
        }

        //        7-Sonrasinda https://github.com/ adresine geri donelim ve  sayfayi yenileyelim

        driver.navigate().back();
        driver.navigate().refresh();


        //        8-Son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();

    }
}
