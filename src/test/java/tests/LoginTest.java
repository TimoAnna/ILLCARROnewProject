package tests;
import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @Test
    public void loginSuccess(){
        app.userHelper().openLoginForm();
        app.userHelper().fillLoginForm("noa@gmail.com","Nnoa12345$");
        app.userHelper().submitForm();
        Assert.assertTrue(app.userHelper().isLogged());
    }
    @Test
    public void loginSuccessModel(){
        User user = new User().withEmail("noa@gmail.com").withPassword("Nnoa12345$");

        app.userHelper().openLoginForm();
        app.userHelper().fillLoginForm(user);
        app.userHelper().submitForm();
        Assert.assertTrue(app.userHelper().isLogged());
    }


    @Test
    public void negativeLoginWrongPassword(){
        app.userHelper().openLoginForm();
        app.userHelper().fillLoginForm("noa@gmail.com","Nnoa123456");
        app.userHelper().submitForm();
        Assert.assertFalse( app.userHelper().isLogged());
    }

    @Test
    public void negativeLoginWrongPasswordModel() throws InterruptedException {
        User user = new User().withEmail("noa@gmail.com").withPassword("12345$");

        app.userHelper().openLoginForm();
        app.userHelper().fillLoginForm(user);
        app.userHelper().submitForm();
        Assert.assertTrue(app.userHelper().isWrongAuthApper());
    }



    @AfterMethod
    public void postCondition(){
        if( app.userHelper().isLogOutPresent()) {
            app.userHelper().logout();
        }
    }
}


