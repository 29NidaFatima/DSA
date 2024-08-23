public class Pattern {
    // public static void printNumberPyramid(int n){
    //     for (int i = 1; i <= n; i++) {
    //         //spaces
    //         for (int j = 1; j <=n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         //number
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(i + " ");
    //         }

    //         System.out.println();
    //     }
    // }
    public static void palindromicPattern(int n){
        for (int i = 1; i <= n; i++) {
                     //spaces
            for (int j = 1; j <= n- i; j++) {
                System.out.print(" ");
            } 
            //Descending order
            for(int j=i; j>=1;j--){
                System.out.print(j);
            }
            //ascending order
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
   
    }
    public static void main(String[] args) {
        // Q1=SOLID RECTANGLE
        // OUTER LOOP
        // for (int i = 1; i <= 4; i++) {
        // // INNER LOOP
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // Q2=HOLLOW RECTANGLE
        // int n=4;
        // int m=5;
        // for(int i=1; i<=n; i++){
        // for(int j=1;j<=m; j++){
        // if(i==1|| j==1|| i==n|| j==m){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }

        // }
        // System.out.println();
        // }
        // Q3-HALF PYRAMID
        // int n=4;
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // Q4-INVERTED HALF PYRAMID
        // int n = 4;
        // for (int i=n; i>= 1; i--) {
        // for (int j=1; j<=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // Q5-INVERTED HALF PYRAMID (ROTATED BY 180 DEGREE)
        // int n=4;
        // //outer loop
        // for(int i=1; i<=n; i++){
        // //inner loop for space
        // for(int j=1; j<=n-i;j++){
        // System.out.print(" ");
        // }
        // //inner loop for star
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // -------------------------------------------------
        // int n=4;
        // //outer loop
        // for(int i=n; i>=1; i--){
        // //inner loop for space
        // for(int j=1; j<=n-i;j++){
        // System.out.print(" ");
        // }
        // //inner loop for star
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // Q6-HALF PYRAMID WITH NUMBERS
        // int n=5;
        // //outer loop
        // for(int i=1; i<=n; i++){
        // //inner loop
        // for(int j=1; j<=i;j++){
        // System.out.print(j +" ");
        // }
        // System.out.println();
        // }

        // Q7- INVERTED HALF PYRAMID WITH NUMBERS
        // int n=5;
        // // outer loop
        // for(int i=1; i<=n; i++){
        // // inner loop
        // for(int j=1; j<=n-i+1;j++){
        // System.out.print(j+" ");
        // }

        // System.out.println();
        // }
        // Q8-Floyd's Triangle
        // int n=5;
        // int number=1;
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i;j++){
        // System.out.print(number+ " ");
        // number++;
        // }
        // System.out.println();
        // }
        // Q9-0-1 Triangle
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // int sum = i + j;
        // if (sum % 2 == 0) {
        // System.out.print("1 ");
        // } else {
        // System.out.print("0 ");
        // }
        // }
        // System.out.println();
        // }
        // Q10-Print Character Pattern
        // int n=5;
        // char ch='A';
        // for(int line=1; line<=n; line++){
        // for(int chars=1; chars<=line; chars++){
        // System.out.print(ch + " ");
        // ch++;
        // }
        // System.out.println();
        // }
        // Advance pattern question
        // number pyramid
        // printNumberPyramid(6);
        palindromicPattern(5);
       
        
    }
}
