package tests;

import models.Car;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewCar extends TestBase {

@BeforeMethod
    public void preCondition(){
    app.userHelper().openLoginForm();
    app.userHelper().fillLoginForm("noa@gmail.com","Nnoa12345$");
    app.userHelper().submitForm();
    if(app.userHelper().isLogged()){
        app.userHelper().click(By.xpath("//*[@class='positive-button ng-star-inserted']"));
        // click(By.xpath("//*[@class='positive-button ng-star-inserted']"));
    }

   // Assert.assertTrue(app.userHelper().isLogged());
}


@Test
    public void addNewCar(){
    app.car().initAddingNewCar();

    int i = (int)((System.currentTimeMillis()/1000)%3600);

    Car car = new Car()
            .withAddress("Tel Aviv Israel")
            .withMake("BMW")
            .withModel("M5")
            .withYear("2019")
            .withEngine("2.3")
            .withFuel("petrol")
            .withGear("MT")
            .withWd("AND")
            .withDoors("5")
            .withSeats("4")
            .withClaSS("C")
            .withFuelConsuptation("6.5")
            .withCarRegNumber("100-66-"+i)
            .withPrice("65")
            .withDistanceIncluded("500")
            .withTypeFeatures("type of")
            .withAbout("Very good car");


        app.car().fillCarForm(car);
       app.car().attachPhoto();
        app.car().clickButtonSubmit();
  // Assert.assertTrue(app.car().isCarAdded());


}



}
