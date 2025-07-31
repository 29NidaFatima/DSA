

public class Inheritance {
    public static void main(String[] args) {
        Fish shark =new Fish();
        shark.eat();
        shark.breathe();
        shark.color="grey";
        System.out.println(shark.color);
        shark.swim();
    }
}
//Animal class[Base class /Parent class]
//this is also a example of Single level Inheritance
class Animal{
    //Properties
 String color;
 //Methods
 void eat(){
System.out.println("eats");
 }
 void breathe(){
    System.out.println("breathe");
 }

}

// Derived class/child class( Fish class have all properties and methods of animal class and also contain their own class additioanl properties and methods)
class Fish extends Animal{
      //Properties
    int fins;
     //Methods
    void swim(){
        System.out.println("swims in water");
    }
}