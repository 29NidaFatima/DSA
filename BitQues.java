public class BitQues {
// Question 3 :Add 1 to an integer using Bit Manipulation.(Hint: try using Bitwise NOT Operator)
public static int addOneToInteger( int n){
return -~n;
}
    public static void main(String[] args) {
        // // Question 1 :What is the value of x^x for any valueof x?
        // int x=1;
        // System.out.println(x^x);
        // Question 3 
        int result=addOneToInteger(8);
        System.out.println(result);
    }
}
