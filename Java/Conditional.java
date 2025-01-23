import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.printl("Enter age");
        // int age=sc.nextIn();
        // if(age>=18) {
        //     System.out.println("You can drive");
        // }else{
        //   System.out.println("You cannot Drive");  
        // }
        // ----Print largest of two numbers---
    //     int a=10;
    //    int b=5;
    // if (a>=b) {
    //     System.out.println("a is largest of 2");
    // } else {
    //     System.out.println("b is largest of 2");
    // }
//---Print if a number is even or odd----
//  Scanner sc=new Scanner(System.in);
//  System.out.println("Enter a number");
// int num= sc.nextInt();
// if (num%2==0) {
//     System.out.println("Number is even");
// } else {
//     System.out.println("Number is odd");
// }
//-----income tax calculator----
//  Scanner sc=new Scanner(System.in);
//  System.out.println("Enter income");
//  int income= sc.nextInt();
//  int tax;
//  if (income<500000) {
// tax=0;

//  } else if(income>=500000 && income< 1000000) {
//     tax= (int)(income*(0.2));
//  }
//  else{
//     tax=(int) (income*(0.3));
//  }
//  System.out.println("Your tax is :" + tax);
//-----------Print the largest of 3 number---------------
// int a=1;
// int b=3;
// int c=6;
// if(a>b && a>c){
//     System.out.println("a is largest  number of 3");
// }
// else if (b>c){
// System.out.println("b is largest  number of 3");
// }
// else {
//     System.err.println("c is largest number of 3");
// }
// -----Ternary Operator-----
// int number=(5>3)?5:3;
// System.out.println(number);
// -----check even or odd using Ternary Operator ---
// int number=5;
// String type=((number)%2==0)? "Even":"Odd";
// System.out.println(type);
// -----check if a student will pass or fail----
// int marks= 45;
// String result= ((marks)>=33?"PASS":"FAIL");
// System.out.println(result);
// ----------SWITCH STATEMENT-------------
int number=4;
switch (number) {
    case 0:System.out.println("pizza"); 
        break;
        case 1:System.out.println("mango shake"); 
        break;
        case 2:System.out.println("burger");
        break;
    default:System.out.println("We realise we are dreaming");
        break;
        
}
    }
}
