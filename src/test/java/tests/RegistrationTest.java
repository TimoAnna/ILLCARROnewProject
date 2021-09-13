package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        if(app.userHelper().isLogOutPresent()){
            app.userHelper().logout();

        }

    }


    @Test
    public void regTest() {

        int i = (int)((System.currentTimeMillis()/1000)%3600);


        app.userHelper().openRegForm();
        app.userHelper().fillRegForm("Lisa", "Stonee", "stone"+i+"@gmail.com", "Stone1234$");
        app.userHelper().checkPolicy();
        app.userHelper().submitForm();

    }


    @Test
    public void regTestNegative() {
        app.userHelper().openRegForm();
        app.userHelper().fillRegForm("Lisa", "Stonee", "stone@gmail", "Stone1234$");
        app.userHelper().checkPolicy();
        app.userHelper().submitForm();

    }



    @AfterMethod
    public void postCondition() {
    if(app.userHelper().isOKbuttonRegistration()){
    app.userHelper().clickOKbuttonAfterReg();
    }

    }
}
