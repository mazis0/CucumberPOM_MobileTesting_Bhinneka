package com.qa.stepdef;

import com.qa.pages.BerandaPage;
import com.qa.pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchStepDef {
    @Given("^User search the product \"([^\"]*)\"$")
    public void user_search_the_product(String text) {
        new BerandaPage().setTextSearchBar(text);

    }

    @Given("^User click on 1st suggestion list on search bar$")
    public void user_click_on_1st_of_list_suggestion_of_search_bar() {
        new BerandaPage().clickOn1stSuggestionListOnSearch();
    }

    @Then("^Product title should be displayed$")
    public void product_title_should_be_displayed() {
        Assert.assertTrue(new ProductPage().IsTitleDisplayed());
    }
}
