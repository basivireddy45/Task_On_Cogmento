package Cogmento_Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;





public class Calender_Page {




        SeleniumActions seleniumActions;

        public Calendar_Page(WebDriver driver){
            seleniumActions = new SeleniumActions(driver);
        }


        By clickOnCalendarButton = By.xpath("//i[@class='calendar icon']");
        By clickOnCreateButton = By.xpath("//a/button[@class='ui linkedin button']/i[@class='edit icon']");
        By enterTitle = By.xpath("//input[@name='title']");
        By clickOnCalendar = By.xpath("//div[@name='calendar']/i");
        By clickOnNewCalendar = By.xpath("//span[text()='New Calendar']");
        By addNewcalendarName = By.xpath("//input[@name='calendarName']");
        By clickOnSave = By.xpath("//button[@class='ui button']/i[@class='checkmark icon']");
        By clickOnCalendarDropDown = By.xpath("//div[@name='calendar']/i[@class='dropdown icon']");
        By  selectOnDropDown = By.xpath("//div[@class='visible menu transition']/div[@role='option'][3]");
        By clickOnCategory = By.xpath("//div[@name='category']/i[@class='dropdown icon']");
        By selectCategory = By.xpath("//div[@class='visible menu transition']/div[@role='option'][6]");
        By clickOnDescription = By.xpath("//div[@class='ui field']/textarea[@name='description']");
        By clickOnAlertBefore = By.xpath("//div[@name='minutesBefore']");
        By selectAlertBeforeTime = By.xpath("//div[@class='visible menu transition']/div[3]");
        By clickOnAlertVia = By.xpath("//div[@name='channels']/i[@class='dropdown icon']");
        By selectTheAlertVia = By.xpath("//div[@class='visible menu transition']/div[@role='option'][1]");
        By clickOnSaveButton = By.xpath("//button[@class='ui linkedin button']/i");

        public void calendarButton(){
            seleniumActions.clickOnElement(clickOnCalendarButton);
        }
        public void createButton(){
            seleniumActions.clickOnElement(clickOnCreateButton);
        }
        public void title(String data){
            seleniumActions.enterValue(enterTitle , data);
        }
        public void calender(){
            seleniumActions.clickOnElement(clickOnCalendar);
        }
        public void newCalendar(){
            seleniumActions.clickOnElement(clickOnNewCalendar);
        }
        public void newCalendarName(String data){
            seleniumActions.enterValue(addNewcalendarName,data);
        }
        public void saveButton(){
            seleniumActions.clickOnElement(clickOnSave);
        }
        public void calendarDropDown(){
            seleniumActions.clickOnElement(clickOnCalendarDropDown);
        }
        public void selectDropdown(){
            seleniumActions.clickOnElement(selectOnDropDown);

        }
        public void category(){
            seleniumActions.clickOnElement(clickOnCategory);
        }
        public void categoryType(){
            seleniumActions.clickOnElement(selectCategory);
        }
        public void description(String data){
            seleniumActions.enterValue(clickOnDescription,data);
        }
        public void alert(){
            seleniumActions.clickOnElement(clickOnAlertBefore);
        }
        public void alertTime(){
            seleniumActions.clickOnElement(selectAlertBeforeTime);
        }
        public void alertVia(){
            seleniumActions.clickOnElement(clickOnAlertVia);
        }
        public void selectAlertVia(){
            seleniumActions.clickOnElement(selectTheAlertVia);
        }
        public void save(){
            seleniumActions.clickOnElement(clickOnSaveButton);
        }


    }