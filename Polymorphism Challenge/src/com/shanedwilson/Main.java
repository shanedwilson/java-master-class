package com.shanedwilson;

public class Car {
    public String name;
    public boolean engine;
    public int cylinders;
    public int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
       return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

public class Leaf extends Car {
    public Leaf(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Leaf -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Leaf -> accelerate()";
    }

    @Override
    public String brake() {
        return "Leaf -> brake()";
    }
}

public class BMW extends Car {
    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "BMW -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "BMW -> accelerate()";
    }

    @Override
    public String brake() {
        return "BMW -> brake()";
    }
}

public class Plymouth extends Car {
    public Plymouth(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Valiant -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Valiant -> accelerate()";
    }

    @Override
    public String brake() {
        return "Valiant -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
    Car car = new Car("Base Car", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }
}
