package ex_17_OOPs;

public class Lab164_Car {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.name); //this will give default value

        Car t = new Car("Tesla");
        System.out.println(t.name); //this will give Tesla

        Car c2 = new Car("Kia","2025");
        System.out.println(c2.name);
        System.out.println(c2.model);
    }
}

class Car{
    String name;
    int year;
    String model;

    Car(){
        name = "Unknown Car";
        year = 1991;
        model = "XXY";
    }

    Car(String nameGiven)
    {
        this.name = nameGiven;
    }
    Car(String nameGiven, String modelGiven)
    {
        this.name = nameGiven;
        this.model = modelGiven;
    }
}