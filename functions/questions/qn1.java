// package questions;
//Enter 3 numbers from the user & make a function to print their average?
import java.util.*;
public class qn1 {
    public static void userInput(int a, int b, int c){
        System.out.println("The Average is : " + ((a+b+c)/3));
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        userInput(a,b,c);
      }
}
