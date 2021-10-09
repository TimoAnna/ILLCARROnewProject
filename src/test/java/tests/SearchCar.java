package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchCar extends TestBase {

    @BeforeMethod
    public void preCondition() {

    }
    @Test
    public void searchCar(){
        app.car().chooseCity();
        app.car().chooseData();
    }


}
