

public class AccessSpecifier {
    public static void main(String[] args) {
        BankAccount myAcc= new  BankAccount(); //here myAcc is the object of the BankAccount class
        myAcc.username="NidaFatima"; // we can set easily the username bcz it is defined as (public) inside BankAccount class
myAcc.password="abc"; // it gives error and we are unable to set password(bcz password is defined as private so that we can't access it from outside the class )


//how can we set password  (here setPassword fn is defined as public so that we are able to set password easily )
myAcc.setPassword("abc"); 
System.out.println(myAcc.password);// we can never be print it bcz of private nature


    }
}
class BankAccount{
 public String username;  // username can be visible to anyone ,bcz of public
 private String password; //password does not accesible to anyone, from outside the class,bcz of private,accesible only within the same class(BankAccount)
public  void setPassword(String pwd){
    password=pwd;
}


}
