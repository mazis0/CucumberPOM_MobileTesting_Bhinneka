package com.qa.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import com.qa.utils.TestUtils;

public class ButtonMenu extends BasePage {
    TestUtils utils = new TestUtils();



    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Akun Saya']")
    private MobileElement labelAkunSaya;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Beranda']")
    private MobileElement labelBeranda;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Kategori']")
    private MobileElement labelKategori;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Keranjang']")
    private MobileElement labelKeranjang;

    public ButtonMenu(){

    }


    public ButtonMenu clickOnAkunSaya(){
        labelAkunSaya.isDisplayed();
        click(labelAkunSaya);
        return this;
    }

    public ButtonMenu clickOnBeranda(){
        labelBeranda.isDisplayed();
        click(labelBeranda);
        return this;
    }

    public ButtonMenu clickOnKategori(){
        labelKategori.isDisplayed();
        click(labelKategori);
        return this;
    }

    public ButtonMenu clickOnKeranjang(){
        labelKeranjang.isDisplayed();
        click(labelKeranjang);
        return this;
    }

}
