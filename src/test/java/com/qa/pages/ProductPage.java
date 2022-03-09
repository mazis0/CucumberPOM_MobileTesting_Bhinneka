package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductPage extends BasePage{

    @AndroidFindBy(id = "product_title")
    private MobileElement productTitle;


    public ProductPage(){

    }

    public boolean IsTitleDisplayed(){
        return productTitle.isDisplayed();

    }
}
