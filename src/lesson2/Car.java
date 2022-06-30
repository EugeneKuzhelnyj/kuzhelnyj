package lesson2;

public class Car implements CarAbility{
        private String carBrand;
        private String model;
        private int doors;
        private int wheels;
        private String transmission;
        private double engineVolume;
        private int brakeDisk;

    public Car() {
    }

    public Car(String carBrand, String model, int doors, int wheels, String transmission, double engineVolume, int brakeDisk) {
        this.carBrand = carBrand;
        this.model = model;
        this.doors = doors;
        this.wheels = wheels;
        this.transmission = transmission;
        this.engineVolume = engineVolume;
        this.brakeDisk = brakeDisk;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getBrakeDisk() {
        return brakeDisk;
    }

    public void setBrakeDisk(int brakeDisk) {
        this.brakeDisk = brakeDisk;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                ", wheels=" + wheels +
                ", transmission='" + transmission + '\'' +
                ", engineVolume=" + engineVolume +
                ", brakeDisk=" + brakeDisk +
                '}';
    }

    @Override
    public void run() {
        System.out.println(this.carBrand+", "+this.model+" завелась и еду");
    }

    @Override
    public int distance(int speed, int timeHour) {
        return speed*timeHour;
    }


}
