package homeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw_01 {
    // Question1

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1.https://www.youtube.com sayfasına gidin
        driver.get("https://www.youtube.com");

        //2.Title i consolda yazdirin
        System.out.println(driver.getTitle());

        //3.Title “YouTube” a eşitse “correct title” yazdirin değilse “incorrect title yazdirin”
        String title = driver.getTitle();
        String arananTitle = "YouTube";

        if (title.contains(arananTitle)){
            System.out.println("correct title");
        } else {
            System.out.println("incorrect title");
        }

        //4.Sayfayi kapatin
        driver.close();

        //5.Tum sayfalari kapatin
        driver.quit();

        //6.Consola “Test completed” yazdirin
        System.out.println("Test completed");


    }
}
