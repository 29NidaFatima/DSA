

public class MethodOverriding {
    public static void main(String[] args) {
        Deer d= new  Deer();
        d.eat();
    }
}
//when Parent and child class have same fn but wid different defination
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}

