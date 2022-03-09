package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BerandaPage extends BasePage{

    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "nextButton")
    private MobileElement nextBtn;

    @AndroidFindBy(id = "searchBar")
    private MobileElement searchBar;

    @AndroidFindBy(id = "edit_search_query")
    private MobileElement textSearchBar;

    @AndroidFindBy(id = "product_label")
    private List<MobileElement> productListSuggestionSearch;

    public BerandaPage(){

    }

    public void new_user_guide(){
        click(nextBtn);
        click(nextBtn);
        click(nextBtn);
    }

    public void setTextSearchBar(String Text){
        click(searchBar);
        sendKeys(textSearchBar,Text);
    }
    public void clickOn1stSuggestionListOnSearch(){

        for (int i=0;i<productListSuggestionSearch.size();i++){
            productListSuggestionSearch.get(i=0).click();
            break;
        }
    }
}
