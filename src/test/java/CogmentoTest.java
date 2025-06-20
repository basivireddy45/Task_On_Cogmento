
package Crm;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CogmentoTest {





    public class companyTestCases extends Cogmento_BaseClass {
        public Login_Page loginPage;
        @BeforeClass
        public void initializePages(){
            loginPage = new Login_Page(driver);
        }
        @Test
        public void verifyCogmentoTest(){

            loginPage.loginCredentials("basivireddykalakoti@gmail.com","4512Kbr@");

        }
    }
}
