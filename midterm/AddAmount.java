/* 3) suppose you have a piggie bank with initial amount $50 and you have to 
add some more amount to it. Create a class 'AddAmount' with a data member named
'amount' with an initial value of $50. Now make two constructors of this class
as follows:
1. -without any parameter- no amount will be added to the piggie bank
2. -having a parameter which is the added amount that will be added to bank
Create objwct of the 'AddAmount' class and display final amount in pigge bank.
*/
package midterm;
public class AddAmount {
 double amount=50;
  AddAmount(){
      System.out.println("Constructor 1: No parameter");
  }
  AddAmount(double x){
 System.out.println("Constructor 2: have parameter which is the added amount");
      amount= amount+x;
  }
  void disp(){
      System.out.println("Final Amount is: $"+amount);
  }
}
class MainClass{
    public static void main(String ar[]){
        AddAmount obj= new AddAmount();
        AddAmount obj1= new AddAmount(100);
        obj1.disp();
    }
}
