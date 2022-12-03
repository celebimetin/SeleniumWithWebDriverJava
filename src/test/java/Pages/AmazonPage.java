package Pages;

import Util.ElementHalper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonPage {
    static WebDriver driver;
    static ElementHalper elementHalper;
    WebDriverWait wait;

    static By cerezleriKabulEt = By.id("sp-cc-accept");
    static By merhabaGirisYapinTıklanır = By.id("nav-link-accountList-nav-line-1");
    static By mailAdres = By.cssSelector("#ap_email");
    static By devamEtButonunaTıklanır = By.xpath("//input[@id='continue']");
    static By sifre = By.cssSelector("#ap_password");
    static By girisYapButonunaTıklanır = By.xpath("//input[@id='signInSubmit']");
    static By urunArama = By.cssSelector("#twotabsearchtextbox");
    static By aramaButonu = By.cssSelector("#nav-search-submit-button");
    static By aramaYapılınaÜrünSeçilir = By.cssSelector("img[alt='Xiaomi Mi True Wireless Earbuds Basic 2 Bluetooth Kablosuz Kulak İçi Kulaklık, 35 dB Ses, 28 Saat Çalma, Mikrofonlu, Siyah']");
    static By sepeteEkle = By.xpath("//input[@id='add-to-cart-button']");
    static By sepeteGit = By.xpath("//a[@href='/gp/cart/view.html?ref_=sw_gtc']");
    static By sepettekiURunDugrumu = By.cssSelector(".a-truncate-cut");

    public AmazonPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHalper = new ElementHalper(driver);
    }
    public static void cerezleriKabulEt() {
        elementHalper.Click(cerezleriKabulEt);
    }

    public static void merhabaGirisYapinTıklanır() { elementHalper.Click(merhabaGirisYapinTıklanır); }

    public static void devamEtButonunaTıklanır() {
        elementHalper.Click(mailAdres);
        elementHalper.SendKey(mailAdres, "metincelebi5534@gmail.com");
        elementHalper.Click(devamEtButonunaTıklanır);
    }

    public static void girisYapButonunaTıklanır() {
        elementHalper.Click(sifre);
        elementHalper.SendKey(sifre, "Amazon123");
        elementHalper.Click(girisYapButonunaTıklanır);
    }

    public static void aramaButonunaTıklanır() {
        elementHalper.SendKey(urunArama, "bluetooth kulaklık");
    }

    public static void ürünAraButonunaTıklanır() {
        elementHalper.Click(aramaButonu);
    }

    public static void ürünListesiGelir() {
    }

    public static void aramaYapılınaÜrünSeçilir() {
        elementHalper.Click(aramaYapılınaÜrünSeçilir);
    }

    public static void sepeteEkleButonunaTıklanır() {
        elementHalper.Click(sepeteEkle);
    }

    public static void sepeteGitButonunaTıklnaır() {
        elementHalper.Click(sepeteGit);
    }

    public static void alışverişSepetiSayfasıGeldiğiGörülür() {
        elementHalper.CheckVisible(sepettekiURunDugrumu);
    }

    public static void amazonAnasayfa() {
    }
}