package Crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CalendersPage {


    SeleniumAction seleniumAction;

    public Calender(WebDriver driver) {
        seleniumAction = new SeleniumAction(driver);

        PageFactory.initElements(driver, this);
    }


    By CalenderButton = By.xpath("//i[@class='calendar icon']");
    By CreateButton = By.xpath("//a/button[@class='ui linkedin button']/i[@class='edit icon']");


    public void clickOnCalenderButton() {
        SeleniumAction.
    }
}