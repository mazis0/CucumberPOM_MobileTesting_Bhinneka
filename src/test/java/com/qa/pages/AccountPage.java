package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AccountPage extends BasePage{
    TestUtils utils = new TestUtils();
    @AndroidFindBy(id="autofill_save_no")
    private MobileElement NotSaveGoogleEmail;

    @AndroidFindBy(id = "account_email_label")
    private MobileElement label_email;

    public AccountPage(){

    }

    public boolean isLabelNameDisplayed(){
        try {
            waitForVisibility(NotSaveGoogleEmail);
            click(NotSaveGoogleEmail);
        }catch (Exception e){
            System.out.println("Unable to located element");
        }

        return label_email.isDisplayed();
    }

    public String getEmailText(){
        String email = getText(label_email,"Email is -");
        return email;
    }
}
