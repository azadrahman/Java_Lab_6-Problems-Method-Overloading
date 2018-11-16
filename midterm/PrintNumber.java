/* 5) create a class named 'PrintNumber' to print various 
numbers of differrent datatypes by creating different method
with the same name 'printn' having a parameter for each datatype.
*/
package midterm;
public class PrintNumber {
int printn(int x){
        int a=x;    
  System.out.println("Method 1:Number is "+a);
  return 0;
 }    
 double printn(double x){
     double p=x;
    System.out.println("Method 2:Number is "+p);
     return 0;
 }
 float printn(float x){
     float m=x;
     System.out.println("Method 3:Number is "+m);
     return 0;
 }
}
class Main2{
    public static void main(String ar[]){
        PrintNumber obj= new PrintNumber();
        obj.printn(5);
        obj.printn(6.7);
        obj.printn(3.14);
    }
}