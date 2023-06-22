

import java.util.*;
public class sum {
    public static double calculateSum(double a, double b, double c){
        double sum =  a+b+c;
        // return (int) sum;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         double a = sc.nextDouble();
         double b = sc.nextDouble();
         double c = sc.nextDouble();
        double sum = calculateSum(a,b,c);
        sc.close();
        System.out.println("The sum of the given values is: " + sum);
    }
}
