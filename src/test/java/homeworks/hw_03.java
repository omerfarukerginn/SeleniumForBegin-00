package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hw_03 {
    //1.  https://id.heroku.com/login sayfasina gidin
    //2.  Bir mail adersi giriniz
    //3.  Bir password giriniz
    //4.  Login butonuna tiklayiniz
    //5.  "There was a problem with your login." texti gorunur ise
    //6.  "kayit yapilamadi" yazdiriniz
    //8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
    //9.  Tum sayfalari kapatiniz

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.  https://id.heroku.com/login sayfasina gidin
        driver.get("https://id.heroku.com/login");

        //2.  Bir mail adersi giriniz
        WebElement mailTextBox=driver.findElement(By.xpath("//input[@placeholder='Email address']"));
        mailTextBox.sendKeys("testkey@test.com");

        //3.  Bir password giriniz
        WebElement passwordTextBox=driver.findElement(By.xpath("//input[@id='password']"));
        passwordTextBox.sendKeys("Password123");

        //4.  Login butonuna tiklayiniz
        WebElement logInButton=driver.findElement(By.xpath("//button[@name='commit']"));
        logInButton.click();

        //5.  "There was a problem with your login." texti gorunur ise
        //6.  "kayit yapilamadi" yazdiriniz
        //8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        WebElement problemButton = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));

        if (problemButton.isDisplayed()){
            System.out.println("kayit yapilamadi");
        }else {
            System.out.println("kayit yapildi");
        }


        //9.  Tum sayfalari kapatiniz
        driver.close();

    }
}
