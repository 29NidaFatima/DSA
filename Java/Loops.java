// import java.util.Scanner;

// public class Loops {
//     public static void main(String[] args) {
//         // 1-WHILE LOOP
//         // Print number from 1 to 20
//         // int counter=0;
//         // while(counter<20){
//         // System.out.println("Hello world");
//         // counter++;
//         // }
//         // System.out.println("Printed HW 20 times");
//         // Print number from 1 to n
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter n");
//         // int n = sc.nextInt();
//         // int counter = 1;
//         // while (counter <= n) {
//         // System.out.println(counter);
//         // counter++;

//         // }

//         // Print number from 1 to 10
//         // int counter=1;
//         // while (counter<=10){
//         // System.out.print(counter+" ");
//         // counter++;
//         // }
//         // System.out.println();
//         // 2-FOR LOOP
//         // for(int i=1; i<=10;i++){
//         // System.out.println("NIDA");
//         // }
//         // PRINT SQUARE PATTERN
//         // for (int line=1; line<=4; line++){
//         // System.out.println("****");
//         // }
//         // PRINT THE SUM OF N NATURAL NUMBERS
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // int i=1;
//         // int sum=0;
//         // while(i<=n){
//         // sum=sum+i; //sum+=i
//         // i++;
//         // }
//         // System.out.println("sum is:"+ sum);
//         // BREAK statements //exit from the loop
//         // for(int i=1; i<=5; i++)
//         // {
//         // if(i==3){
//         // break;
//         // }
//         // System.out.println(i);
//         // }
//         // System.out.println("I am out of the loop");
//         // CONTINUE STATEMENT //to skip an iteration
//         // for(int i=1; i<=5; i++){
//         // if(i==3){
//         // continue;
//         // }
//         // System.out.println(i);
//         // }
//         // System.out.println("I am out of the Loop");
//         // 3-DO WHILE LOOP
//         // int counter=1;
//         // do{
//         // System.out.println("NIDA");
//         // counter++;
//         // }while(counter<=10);
//         // PRINT REVERSE OF THE NUMBER
//         // int n=10899;
//         // while(n>0){
//         // int lastdigit = n%10;
//         // System.out.println(lastdigit + " ");
//         // n=n/10;
//         // }
//         // System.out.println();
//         // DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT MULTIPLES OF 10
//         // Scanner sc = new Scanner(System.in);

//         // do {
//         //     System.out.println("Enter your number:");
//         //     int n = sc.nextInt();
//         //     if (n % 10 == 0) {
//         //         continue;
//         //     }
//         //     System.out.println("number was"+ n);

//         // } while (true);
//         // Keep entering number till user enters multiple of 10
//          Scanner sc = new Scanner(System.in);
           
//           do {
//             System.out.println("Enter your number:");
//             int n = sc.nextInt();
//             if (n%10==0) {
//                 break;
//             }
//             System.out.println("Number is " + n);
//           } while (true);
//           System.out.println("I am out of the loop");
//     }
// }
