package tests;
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
    public void negativeLoginWrongPassword(){
        app.userHelper().openLoginForm();
        app.userHelper().fillLoginForm("noa@gmail.com","Nnoa123456");
        app.userHelper().submitForm();
        Assert.assertFalse( app.userHelper().isLogged());
    }

    @AfterMethod
    public void postCondition(){
        if( app.userHelper().isLogOutPresent()) {
            app.userHelper().logout();
        }
    }
}


