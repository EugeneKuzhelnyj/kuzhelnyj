package lesson2;

public class ArrayOfCars {
    public static void arrayOfCars(int amount){
        Car [] car = new Car[amount];
        for (int i = 0; i < amount; i++) {
            car[i] = new Car();
        }
    }
}
