package Tests;


    import Cogmento_Task.Calendar_Page;
import Cogmento_Task.Cogmento_BasePage;
import Cogmento_Task.Login_page;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
    public class Cogmento_Tests extends Cogmento_BasePage {

        Login_page loginPage;
        Calendar_Page calendar_page;
        @BeforeClass
        public void initializePages(){
            loginPage = new Login_page(driver);
            calendar_page = new Calendar_Page(driver);
        }
        @Test
        public void verifyCogmentoTest() throws InterruptedException{

            loginPage.enteruseremail("2301050106cse@gmail.com");
            loginPage.enterPassword("4512Kbreddy@");
            loginPage.clickOnSubmit();
            calendar_page.calendarButton();
            calendar_page.createButton();
            calendar_page.title("Meeting");
            calendar_page.calender();
            calendar_page.newCalendar();
            calendar_page.newCalendarName("july");
            calendar_page.saveButton();
            calendar_page.calendarDropDown();
            calendar_page.selectDropdown();
            calendar_page.category();
            calendar_page.categoryType();
            calendar_page.description("About project milestones");
            calendar_page.alert();
            calendar_page.alertTime();
            calendar_page.alertVia();
            calendar_page.selectAlertVia();
            calendar_page.save();
        }
    }

