public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        h.walk();

        c.eat();
        c.walk();

        // Hierarchy of constructor
        Mustang myHorse = new Mustang();
        // Animal-->Horse-->Mustang

        // Interfaces
        Queen q = new Queen();
        q.moves();
        Bear bear = new Bear();

        // Call methods from both interfaces
        bear.eatPlants();
        bear.eatMeat();
    }
}

// abstract class using abstract keyword
abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called");
    }

    // non-abstract method(function)
    void eat() {
        System.out.println("Animal eats");
    }

    // abstract method(function)
    abstract void walk(); // there is no implementation(defination not defined),basically it gives you an
                          // idea
}

// sub-class
class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called");
    }

}

// sub-class
class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}

// Interfaces
interface ChessPlayer {
    void moves(); // by default it is public.abstract

}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up.down,left,right,diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up.down,left,right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up.down,left,right,diagonal(by 1 step)");
    }
}

// Define the Herbivore interface
interface Herbivore {
    void eatPlants();
}

// Define the Carnivore interface
interface Carnivore {
    void eatMeat();
}

// Implementing both interfaces in a class
class Bear implements Herbivore, Carnivore {

    public void eatPlants() {
        System.out.println("The bear is eating plants.");
    }

    public void eatMeat() {
        System.out.println("The bear is eating meat.");
    }
}