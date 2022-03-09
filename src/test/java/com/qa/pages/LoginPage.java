package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage{
    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "txtEmail")
    private MobileElement email_txt;

    @AndroidFindBy(id = "txtPassword")
    private MobileElement password_txt;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='LOGIN'][@enabled='true']")
    private MobileElement login_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
    private MobileElement errorLoginMessage;

    public LoginPage(){
    }

    public LoginPage enterEmail(String email){
        clear(email_txt);
        sendKeys(email_txt,email,"email is" + email);
        return this;
    }

    public LoginPage enterPassword(String password){
        clear(password_txt);
        sendKeys(password_txt,password,"password is " + password);
        return this;
    }

    public LoginPage clickBtnLogin(){

        click(login_btn);
        return this;
    }

    public String getErrorLoginMessage(){
        String err = getText(errorLoginMessage,"error text is -");
        return err;
    }


}
