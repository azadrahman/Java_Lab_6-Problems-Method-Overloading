/* ###1. Generate a random number n between 5 to 20. use for loop to print
all integer from 0 to n seperated by a space. To generate random number 
between min to max range: int n=(int)(min+Math.random()*(max-min+1)).
 Sample output:
----------------
Random integer: 7
0 1 2 3 4 5 6 7
###2. print the following:
1 2 3 4 5
1 2 3 4 
1 2 3 
1 2 
1 
###3. write a program which will use while loop to print all the integers
between 100 and 150 which are divided by 8 in descending order.
Output: 144 136 128 120 112 104
###4. Generate a random int between 1990 to 2020. Then print it check if it
is a leap year or not.
Note:------ Leap year condisition: 
divided by 400
divided by 4 and not divisible by 100
Sample output:----- 2015; Not a leap year/false
###5. print the following pattern
*
++
***
++++
*****

*/
package oop_lab;
import java.lang.Math;
public class Random_integer {
public static void main(String ar[]){
    int max=20, min=5;
    int n=(int)(min+Math.random()*(max-min+1));
    System.out.println("Random integers:");
    for(int i=0; i<=n;i++){
        System.out.println(i+"\t");
    }
  // ###2 solution
System.out.println("Random integer pattern: ");
for(int i=n; i>=1; i--){
    for(int j=1; j<=i; j++)
        System.out.print(j+"\t");
    System.out.print("\n");
}
//###3 solution
System.out.println("Between 100 to 150 divided by 8 in descending: ");
int p=150;
while(p>=100){
    p--;
    if(p%8==0)
        System.out.print(p+"\t");
}
//###4 solution
System.out.println("\nRandom Years between 1990 to 2020: ");
 n= (int)(1990+Math.random()*(2020-1990+1));
 System.out.println("Random Year is: "+n);
if((n%4==0 && n%100!=0)||(n%400==0))
    System.out.println("It is leap year!!");
else
    System.out.println("It is not a leap year!!");
//###5 solution:
System.out.println("\nPattern design: ");
for(int i=1; i<=5; i++){
    for(int j=1; j<=i; j++){
        if(i%2==0)
        System.out.print("+");
        else 
            System.out.print("*");
    }
    System.out.print("\n");
}
}
    
}

