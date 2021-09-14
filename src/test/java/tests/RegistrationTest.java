package tests;

import models.User;
import org.testng.Assert;
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
    public void regTestModel() {

        int i = (int)((System.currentTimeMillis()/1000)%3600);
        User user = new User()
                .withName("Lisa").withLastName("Snowe").withEmail("snowe"+i+"@gmail.com").withPassword("Snowe$"+i);


        app.userHelper().openRegForm();
        app.userHelper().fillRegForm(user);
        app.userHelper().checkPolicy();
        app.userHelper().submitForm();

    }


    @Test
    public void regTestNegative() throws InterruptedException {
        app.userHelper().openRegForm();
        app.userHelper().fillRegForm("Lisa", "Stonee", "stone222@gmail.com", "1234$");
        app.userHelper().checkPolicy();
        app.userHelper().submitForm();
        Assert.assertTrue(app.userHelper().isErrorPasswordDisplayed());
        Assert.assertTrue(app.userHelper().isYallaButtonActive());

    }



    @AfterMethod
    public void postCondition() {
    if(app.userHelper().isOKbuttonRegistration()){
    app.userHelper().clickOKbuttonAfterReg();
    }

    }
}
