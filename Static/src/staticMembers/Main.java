package staticMembers;

class Car {
//    static members cannot depend on objects
    static int carCount;
    String carName;
    String color;
    int price;


//    static block runs one time at compile time ,when the class loads
    static {
        carCount = 0;
    }

    public Car(String carName, int price, String color) {
        this.carName = carName;
        this.price = price;
        this.color = color;
        Car.carCount += 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Marcedes",900000,"Cyan");
        System.out.println(Car.carCount);

        Car car2 = new Car("Porche",12000000,"white");
        System.out.println(Car.carCount);

        Main obj = new Main();
        obj.greet();
    }

//    Non static methods can access with reference
    public void greet() {
        System.out.println("hello world");
    }
}
