package models;



public class Car {
    String address;
    String make;
    String model;
    String year;
    String engine;
    String fuel;
    String gear;
    String wD;
    String doors;
    String seats;
    String claSS;
    String fuelConsuptation;
    String carRegNumber;
    String price;
    String distanceIncluded;
    String typeFeatures;
    String about;

    public Car withAddress(String address) {
        this.address = address;
        return this;
    }

    public Car withMake(String make) {
        this.make = make;
        return this;
    }

    public Car withModel(String model) {
        this.model = model;
        return this;
    }

    public Car withYear(String year) {
        this.year = year;
        return this;
    }

    public Car withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public Car withFuel(String fuel) {
        this.fuel = fuel;
        return this;
    }

    public Car withGear(String gear) {
        this.gear = gear;
        return this;
    }

    public Car withWd(String Wd) {
        this.wD = Wd;
        return this;
    }

    public Car withDoors(String doors) {
        this.doors = doors;
        return this;
    }

    public Car withSeats(String seats) {
        this.seats = seats;
        return this;
    }

    public Car withClaSS(String claSS) {
        this.claSS = claSS;
        return this;
    }

    public Car withFuelConsuptation(String fuelConsuptation) {
        this.fuelConsuptation = fuelConsuptation;
        return this;
    }

    public Car withCarRegNumber(String carRegNumber) {
        this.carRegNumber = carRegNumber;
        return this;
    }

    public Car withPrice(String price) {
        this.price = price;
        return this;
    }

    public Car withDistanceIncluded(String distanceIncluded) {
        this.distanceIncluded = distanceIncluded;
        return this;
    }

    public Car withTypeFeatures(String typeFeatures) {
        this.typeFeatures = typeFeatures;
        return this;
    }

    public Car withAbout(String about) {
        this.about = about;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuel() {
        return fuel;
    }

    public String getGear() {
        return gear;
    }

    public String getwD() {
        return wD;
    }

    public String getDoors() {
        return doors;
    }

    public String getSeats() {
        return seats;
    }

    public String getClaSS() {
        return claSS;
    }

    public String getFuelConsuptation() {
        return fuelConsuptation;
    }

    public String getCarRegNumber() {
        return carRegNumber;
    }

    public String getPrice() {
        return price;
    }

    public String getDistanceIncluded() {
        return distanceIncluded;
    }

    public String getTypeFeatures() {
        return typeFeatures;
    }

    public String getAbout() {
        return about;
    }

    public String toString() {
        return "Car{" +
                "address='" + address + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", gear='" + gear + '\'' +
                ", wD='" + wD + '\'' +
                ", doors='" + doors + '\'' +
                ", seats='" + seats + '\'' +
                ", claSS='" + claSS + '\'' +
                ", fuelConsuptation='" + fuelConsuptation + '\'' +
                ", carRegNumber='" + carRegNumber + '\'' +
                ", price='" + price + '\'' +
                ", distanceIncluded='" + distanceIncluded + '\'' +
                ", typeFeatures='" + typeFeatures + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}
