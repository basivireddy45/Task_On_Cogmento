package Crm;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class Login_Page {
        SeleniumAction seleniumAction;

        public Login_Page(WebDriver driver){
            seleniumAction = new SeleniumAction(driver);

            PageFactory.initElements(driver,this);
        }


        By emailInputField= By.xpath( "//input[@name='email']");
        By  passwordInputField =By.xpath ("//input[@name='password']");
        By submitField=By.xpath("//div[text()='Login']");
        public void loginCredentials(String userEmail, String password){
            seleniumAction.enterValue(emailInputField,userEmail);
            seleniumAction.enterValue(passwordInputField,password);
            seleniumAction.clickOnElement(submitField);
        }
    }

