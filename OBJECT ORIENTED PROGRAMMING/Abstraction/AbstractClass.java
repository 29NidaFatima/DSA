
public class AbstractClass {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
     
        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Mustan myHorse= new  Mustan();
    }
}

//abstract class
abstract class Animal {

    //abstract class can have constructor
    Animal(){
        System.out.println("Animal constructor called");

    }
    //non-abstract method
    void eat() {
        System.out.println("animal eats");
    }
//abstract method(there is no implementation inside abstract method)
abstract void walk();
}


//here horse class implements the walk method(implementation is done by subclass)

class Horse extends Animal {

    Horse() {
        System.out.println("horse constructor called");
    }

    void walk() {
        System.out.println("horse walk");
    }
}

class  Mustan extends  Horse {

     Mustan() {
        System.out.println("mustan constructor called");
    }
     
}

class Chicken extends Animal {

    void walk() {
        System.out.println("walks on two legs");
    }
}
