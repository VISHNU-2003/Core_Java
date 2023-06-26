// package questions;
//write a function to print all the sum of the even numbers from 1 to n?
import java.util.*;
public class qn3 {
    public static void evenSum(int n){
        int sum = 0;
        for(int i=2;i<=n;i+=2){
            sum += i;
        }
        System.out.println(sum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        evenSum(n);

    }
}
