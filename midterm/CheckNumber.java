/* 6)
define a class CheckNumber. it will contain several methods with
the same name "max". it will take numbers as papameters
according to the following
1. int,int   2. double, double
3. int, int, int  4. double, double, double
*/
package midterm;
public class CheckNumber {
    int a,b,c;
    double p,q,r;
 void max(int x, int y){
     a=x;
     b=y;
     System.out.println("Method 1, addition:"+(a+b));
 }    
 void max(double x, double y){
     p=x;
     q=y;
  System.out.println("Method 2, addition:"+(p+q));
 }
 void max(int x, int y, int z){
     a=x;
     b=y;
     c=z;
     System.out.println("Method 3, addition:"+(a+b+c));
     
 }
 void max(double x, double y, double z){
  p=x;
  q=y;
  r=z;
  System.out.println("Method 4, addition:"+(p+q+r));
 }
}
class Main1{
    public static void main(String ar[]){
        CheckNumber obj1= new CheckNumber();
        CheckNumber obj2= new CheckNumber();
        CheckNumber obj3= new CheckNumber();
        CheckNumber obj4= new CheckNumber();
        obj1.max(5, 7);
        obj2.max(5.5, 7.5);
        obj3.max(10, 2,8);
        obj4.max(10.3, 2.7, 7.0);
    }
}