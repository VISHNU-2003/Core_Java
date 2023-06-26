// package functionspractice;


import java.util.*;
public class difference {
    public static double calcualteDifference(double a, double b){
        double differ = a-b;
        return differ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double differ = calcualteDifference(a,b);
        sc.close();
        System.out.println("The difference between two numbers is: " + differ);
    }
}
