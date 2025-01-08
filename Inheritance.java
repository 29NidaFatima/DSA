public class Inheritance {
    public static void main(String[] args) {
        // INHERITENCE:
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();

        Dogs denny = new Dogs();
        denny.eat();
        denny.legs = 4;
        System.out.println(denny.legs);
        Mammals1 a2 = new Mammals1();
        a2.eat();
    }
}

// INHERITENCE:
// INHERITENCE TYPES:(1)-Single level INHERITENCE
// Base class(Parent class)
class Animal {
    String color; // properties
    // behaviours

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class(child class)
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

// INHERITENCE TYPES:(2)-Multi level INHERITENCE
// Base class(Parent class)
class Animals {
    String color; // properties
    // behaviours

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// 1st Derived class(child class)
class Mammals extends Animals {
    int legs;
}

// 2nd Derived class(child class)
class Dogs extends Mammals {
    String breed;
}

// INHERITENCE TYPES:(3)-Hierarchial INHERITENCE
// Base class(Parent class)
class Animal1 {
    String color; // properties
    // behaviours

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// 1st Derived class(child class)
class Mammals1 extends Animal1 {
    void walk() {
        System.out.println("walk");
    }
}

// 2nd Derived class(child class)
class Fish1 extends Animal1 {
    void swim() {
        System.out.println("swim");
    }
}

// 3rd Derived class(child class)
class Bird extends Animal {
void fly() {
      System.out.println("walks");
