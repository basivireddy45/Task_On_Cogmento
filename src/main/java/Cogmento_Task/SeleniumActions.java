package Cogmento_Task;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

    public class SeleniumActions {
        WebDriver driver;

        public SeleniumActions(WebDriver driver) {
            this.driver=driver;
        }




        public void enterValue(By by, String data){
            driver.findElement(by).sendKeys(data);
        }



        public void clickOnElement(By by){
            driver.findElement(by).click();
        }


    }

