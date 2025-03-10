public class Add_digits {
    public static  int  digitSum(int n){
int sum =0;
while (n!=0) {
   sum=sum+n%10;
    n/=10;
}
return sum;

    }
    public static void main(String[] args) {
        int result=digitSum(14678);
        System.out.println("sum of the all digits is " + result);
    }
}
  //------------------Using Recursion-------------

public class Add_digits {
    public static  int  digitSum(int n){
//Base case
if(n==0){
    return 0;
}
return(n%10)+digitSum(n/10);


    }
    public static void main(String[] args) {
        int result=digitSum(14678);
        System.out.println("sum of the all digits is :" + result);
    }
}