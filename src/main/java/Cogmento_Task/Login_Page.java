package Cogmento_Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Login_Page {
    SeleniumActions seleniumActions;

    public Login_page(WebDriver driver) {
        seleniumActions = new SeleniumActions(driver);


    }


    By emailInputField = By.xpath("//input[@name='email']");
    By passwordInputField = By.xpath("//input[@name='password']");
    By submitField = By.xpath("//div[text()='Login']");

    public void enteruseremail(String data) {


        seleniumActions.enterValue(emailInputField, data);

    }

    public void enterPassword(String data) {


        seleniumActions.enterValue(passwordInputField, data);
    }

    public void clickOnSubmit() {
        seleniumActions.clickOnElement(submitField);
    }
}

