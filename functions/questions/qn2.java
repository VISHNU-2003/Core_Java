// package questions;
// write a function to print the sum of all odd numbers form 1 to n
import java.util.*;
public class qn2 {
    public static void sumOddNum(int n){
       int sum = 0 ;
        for(int i=1;i<=n;i+=2){
            sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        sumOddNum(n);
    }
}
