package application;

import models.Car;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HelperCar extends HelperBase {
    public HelperCar(WebDriver wd) {
        super(wd);
    }


    public void initAddingNewCar() {
    wd.findElement(By.xpath("//*[@href ='/Let-car-work']")).click();
    }


    public void fillCarForm(Car car) {
        typeLocation(car.getAddress());
        type(By.id("make"), car.getMake());
        type(By.id("model"), car.getModel());
        type(By.id("year"), car.getYear());
        type(By.id("engine"), car.getEngine());

        select(By.id("fuel"), car.getFuel());
        select(By.id(("gear")), car.getGear());
        select(By.id("wheelsDriver"), car.getwD());

        type(By.id("doors"), car.getDoors());
        type(By.id("seats"), car.getSeats());
        type(By.id("class"), car.getClaSS());
        type(By.id("fuelConsumption"), car.getFuel());
        type(By.id("serialNumber"), car.getCarRegNumber());
        type(By.id("price"), car.getPrice());
        type(By.id("distance"), car.getDistanceIncluded());
        type(By.cssSelector(".feature-input"), car.getTypeFeatures());
        type(By.id("about"), car.getAbout());
    }

    public void select(By locator, String option) {
        new Select(wd.findElement(locator)).selectByValue(option);
        // new Select(wd.findElement(locator)).selectByIndex(1);
        // new Select(wd.findElement(locator)).selectByVisibleText("Petrol ");

    }


    private void typeLocation(String address) {
        type(By.id("pickUpPlace"), address);
        pause(500);
        click(By.cssSelector("div.pac-item"));
        pause(500);
    }

    private void selectFuel(By locator, String option) {
        Select select = new Select(wd.findElement(locator));

        if (option.equals("Petrol")) {
            select.selectByValue("Petrol");
        } else if (option.equals("Disel")) {
            select.selectByValue("Disel");
        }

    }

    public void attachPhoto() {
        wd.findElement(By.id("photos")).sendKeys("C:\\qa29\\ILLCARROnewProject");

    }

    public void clickButtonSubmit() {
        new WebDriverWait(wd, 10)
                .until(ExpectedConditions
                        .elementToBeClickable(wd.findElement(By.xpath("//button[.='Submit']"))));
        click(By.xpath("//button[.='Submit']"));
    }


    public void chooseCity() {
        wd.findElement(By.xpath("//label[@for='city']")).click();
        WebElement city = wd.findElement(By.id("city"));
        city.sendKeys("Rehovot");
        pause(2000);
        wd.findElement(By.xpath("//span[contains(text(),'Israel')]")).click();
        city.sendKeys(Keys.ENTER);


    }

    public void chooseData() {
       int min = 11;
       int max = 28;
        int day = (int)(Math.random()*((max-min)+1))+min;
        String date = String.valueOf(day);

        wd.findElement(By.xpath("//label[@for='dates']")).click();
        wd.findElement(By.xpath("//div[normalize-space()='19']")).click();
        wd.findElement(By.xpath("//div[normalize-space()='24']")).click();
        pause(1000);


//        new Select(wd.findElement(By.xpath("//div[@class= 'mat-calendar-body-cell-content']"))).selectByValue(date);
//        pause(1000);
//        new Select(wd.findElement(By.xpath("//div[@class= 'mat-calendar-body-cell-content']"))).selectByValue(date);


   // String loc = String.format("//div[text()= '%s']", date1);
      //  List<WebElement> list = wd.findElements(By.xpath(loc));
//     WebElement el = wd.findElement(By.xpath("//div[@class= 'mat-calendar-body-cell-content']"));
//     el.sendKeys(date1);
//    el.sendKeys(date2);

//
//        wd.findElement(By.xpath("//div[normalize-space()=]"+ date)).click();

       // String loc = String.format("//div[text()= '%s']", day);

//        WebElement el = wd.findElement(By.xpath("//div[text()= '%s']"));
//        el.sendKeys(date);
//        pause(1000);
//        el.sendKeys(date);
//        el.sendKeys(Keys.ENTER);


    }
}

