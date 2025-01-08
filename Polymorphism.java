public class Polymorphism {
    public static void main(String[] args) {
        // Functions OverLoading
        Calculator calc=new Calculator();
      System.out.println(calc.sum(1,2));
      System.out.println(calc.sum((float)1.2, (float)1.8));
      System.out.println(calc.sum(1,2,3));
      Deer d=new Deer();
    d.eat();
    }
}
// Functions OverLoading
class Calculator {
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
// Functions Overriding
class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass ");
    }
}