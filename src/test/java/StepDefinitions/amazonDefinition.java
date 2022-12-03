package StepDefinitions;

import Pages.AmazonPage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class amazonDefinition {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPage amazonPage = new AmazonPage(driver);
    @Given("Amazon anasayfa")
    public void amazonAnasayfa() {
        AmazonPage.amazonAnasayfa();
    }

    @When("Cerezleri kabul Et")
    public void cerezleriKabulEt() {
        AmazonPage.cerezleriKabulEt();
    }

    @When("Merhaba giris yapin tıklanır")
    public void merhabaGirisYapinTıklanır() {
        AmazonPage.merhabaGirisYapinTıklanır();
    }

    @When("Devam Et butonuna tıklanır")
    public void devamEtButonunaTıklanır() {
        AmazonPage.devamEtButonunaTıklanır();
    }

    @When("Giris yap butonuna tıklanır")
    public void girisYapButonunaTıklanır() {
        AmazonPage.girisYapButonunaTıklanır();
    }

    @When("Arama butonuna tıklanır")
    public void aramaButonunaTıklanır() {
        AmazonPage.aramaButonunaTıklanır();
    }

    @When("Ürün ara butonuna tıklanır")
    public void ürünAraButonunaTıklanır() {
        AmazonPage.ürünAraButonunaTıklanır();
    }

    @When("Ürün listesi gelir")
    public void ürünListesiGelir() {
        AmazonPage.ürünListesiGelir();
    }

    @When("Arama yapılına ürün seçilir")
    public void aramaYapılınaÜrünSeçilir() {
        AmazonPage.aramaYapılınaÜrünSeçilir();
    }

    @When("Sepete Ekle butonuna tıklanır")
    public void sepeteEkleButonunaTıklanır() {
        AmazonPage.sepeteEkleButonunaTıklanır();
    }

    @When("Sepete git butonuna tıklnaır")
    public void sepeteGitButonunaTıklnaır() {
        AmazonPage.sepeteGitButonunaTıklnaır();
    }

    @When("Alışveriş sepeti sayfası geldiği görülür")
    public void alışverişSepetiSayfasıGeldiğiGörülür() {
        AmazonPage.alışverişSepetiSayfasıGeldiğiGörülür();
    }
}