public class MultiLevel {
    public static void main(String[] args) {
        Dog dobby=new Dog();
        dobby.legs=4;
        System.out.println(dobby.legs);
        dobby.eat();
    }
}
//Base class
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
// Derived class(Mammal class have all properties of Animal class)
class Mammal extends  Animal{
    int legs;
}
//2nd derived class (Dog class have all porperties of Mammal class)
class Dog extends Mammal{
String breed;
}