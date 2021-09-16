package application;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UserHelper extends HelperBase {


    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
        click(By.xpath("//a[text()=' Log in ']"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.id("email"), email);
        type(By.id("password"), password);
    }

    public void fillLoginForm(User user) {
    type(By.id("email"), user.getEmail());
    type(By.id("password"), user.getPassword());
    }



    public void submitForm() {
        click(By.xpath("//button[@type='submit']"));
    }


    public boolean isLogged() {
        String text = wd.findElement(By.cssSelector(".dialog-container h2")).getText();
        click(By.xpath("//*[@class='positive-button ng-star-inserted']"));
        return text.equals("Logged in success");
    }

    public void logout() {
        click(By.xpath("//a[text()=' Logout ']"));

    }

    public boolean isLogOutPresent() {
        return isElementPresent(By.xpath("//a[text()=' Logout ']"));
    }

    public boolean isOKbuttonRegistration() {
        return isElementPresent(By.xpath("//*[@class = 'positive-button ng-star-inserted']"));

    }

    public void clickOKbuttonAfterReg() {
        click(By.xpath("//*[@class = 'positive-button ng-star-inserted']"));

    }


    public void openRegForm() {
        click(By.xpath("//a[text()=' Sign up ']"));
    }

    public void fillRegForm(String name, String lastname, String email, String password) {
        type(By.id("name"), name);
        type(By.id("lastName"), lastname);
        type(By.id("email"), email);
        type(By.id("password"), password);
    }
    public void fillRegForm(User user) {
        type(By.id("name"), user.getName());
        type(By.id("lastName"), user.getLastName());
        type(By.id("email"), user.getEmail());
        type(By.id("password"), user.getPassword());
    }





    public void checkPolicy() {
        //  click(By.id("terms-of-use"));

        //    click(By.xpath("//label[@for='terms-of-use']"));
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("document.querySelector('#terms-of-use').click();");
        js.executeScript("document.querySelector('#terms-of-use').checked=true;");

    }

    public boolean isErrorPasswordDisplayed() throws InterruptedException {
         click(By.id("email"));
        Thread.sleep(2000);
        return isElementPresent(By.xpath("//div[@class='error']"));


    }
    public boolean isYallaButtonActive() {
        //return wd.findElement(By.xpath("//button[@type='submit']")).isSelected();
        return isElementPresent(By.xpath("//button[@disabled]"));
    }

    public boolean isWrongAuthApper(){
        return isElementPresent(By.xpath("//h1[normalize-space()='Authorization error']") );

    }

}