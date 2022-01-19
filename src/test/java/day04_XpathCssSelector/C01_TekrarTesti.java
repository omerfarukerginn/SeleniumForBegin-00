package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    // 1. Bir class oluşturun : AmazonSearchTest
    // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //    a. Amazon web sayfasına gidin. https://www. amazon.com/
    //    b. Search(ara) “city bike”
    //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    //    d. “Shopping” e tıklayın.
    //    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //    a.Amazon web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //    b. Search kutusuna “city bike” yazip arattirin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"  + Keys.ENTER);
        // aramaKutusu.submit();    istersek Keys.ENTER yerine bu satiri da yazabiliriz

        //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonucYazisiElementi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonucYazisiElementi.getText());

        //    d. Sonra karsiniza cikan ilk urun resmine tıklayın.
        // WebElement ilkUrunResmi = driver.findElement(By.className("s-image"));
        // ilkUrunResmi.click();

        driver.findElement(By.className("s-image")).click();





    }
}
