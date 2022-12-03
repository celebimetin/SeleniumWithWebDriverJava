Feature: Amazon.com
  Scenario: Sepet ürün ekleme testi
    Given Amazon anasayfa
    When Cerezleri kabul Et
    When Merhaba giris yapin tıklanır
    When Devam Et butonuna tıklanır
    When Giris yap butonuna tıklanır
    When Arama butonuna tıklanır
    When Ürün ara butonuna tıklanır
    When Ürün listesi gelir
    When Arama yapılına ürün seçilir
    When Sepete Ekle butonuna tıklanır
    When Sepete git butonuna tıklnaır
    When Alışveriş sepeti sayfası geldiği görülür