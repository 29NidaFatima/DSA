public class CovertZeroToFive {
public static int convertFive(int n){
String str= String.valueOf(n);
String k= str.replaceAll("0", "5");
return Integer.parseInt(k);

}
     public static void main(String[] args) {
         int n =1004;
       int result=convertFive(n);
       System.out.println(n  +" is the original number");
       System.out.println( "After replacing 0 to 5" + result );
     }
}
