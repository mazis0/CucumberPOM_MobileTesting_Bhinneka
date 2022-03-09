package com.qa.stepdef;


import com.qa.pages.AccountPage;
import com.qa.pages.BerandaPage;
import com.qa.pages.ButtonMenu;
import com.qa.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @Given("The User open the apps and click next all step on user guide")
    public void the_user_open_the_apps_and_click_on_all_next_step_on_user_guide() {
        new BerandaPage().new_user_guide();
    }

    @Given("User click Akun Saya on ButtonMenu")
    public void user_click_akun_saya_on_button_menu() {
        new ButtonMenu().clickOnAkunSaya();
    }
    @Given("^User enter email as \"([^\"]*)\"$")
    public void i_enter_email_as(String email) {
        new LoginPage().enterEmail(email);
    }

    @Given("^Enter password as \"([^\"]*)\"$")
    public void i_enter_password(String password) {
        new LoginPage().enterPassword(password);
    }

    @When("^User click on masuk button$")
    public void i_click_on_masuk_button() {
        new LoginPage().clickBtnLogin();
    }

    @Then("^The label \"([^\"]*)\"  should be displayed$")
    public void the_label_should_be_displayed(String labelEmail) {
        Assert.assertEquals(new AccountPage().getEmailText(),labelEmail);
    }

    @Given("^User enter wrong email as \"([^\"]*)\"$")
    public void user_enter_wrong_email_as(String email) {
        new LoginPage().enterEmail(email);
    }

    @Then("^Error Message \"([^\"]*)\" should be displayed$")
    public void error_message_should_be_displayed(String errorLoginMessage) {
        Assert.assertEquals(new LoginPage().getErrorLoginMessage(),errorLoginMessage);
    }

    @Given("^Enter wrong password as \"([^\"]*)\"$")
    public void enter_wrong_password_as(String password) {
        new LoginPage().enterPassword(password);
    }
}
