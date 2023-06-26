// package functionspractice;

import java.util.*;
public class checkeveorodd {
    public static void isEven(int n){
        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        return;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        isEven(n);
    }
}
