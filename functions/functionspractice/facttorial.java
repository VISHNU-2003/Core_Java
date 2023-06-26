// package functionspractice;


import java.util.*;
public class facttorial {
    public static void getFactorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        getFactorial(n);
    }
}