
public class Interface {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.graze();
        b.hunt();

        Vehicle v = new Car();
        v.start();
        v.accelerate();
        v.stop();
    }
}
//interface

interface ChessPlayer {

    void moves(); // by default it will public,anstract and without implementation
}

class Queen implements ChessPlayer {

    public void moves() {
        System.out.println("up,down,left,right,diagonal(in all 4 direction)");
    }
}

class Rook implements ChessPlayer {

    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer {

    public void moves() {
        System.out.println("up,down,left,right(diagonal by 1 step)");
    }
}
//Multiple inheritance
// Interface 1

interface Herbivore {

    void graze();
}

// Interface 2
interface Carnivore {

    void hunt();
}

// Class implementing multiple interfaces (multiple inheritance)
class Bear implements Herbivore, Carnivore {

    public void graze() {
        System.out.println("Bear eats plants.");
    }

    public void hunt() {
        System.out.println("Bear hunts animals.");
    }
}

// Interface with 100% abstraction

interface Vehicle {

    void start();

    void stop();

    void accelerate();
}

// Concrete class implementing the interface
class Car implements Vehicle {

    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}
