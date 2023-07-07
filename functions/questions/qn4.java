// package questions;
//write a function which takes in 2 numbers and return the greater of those two?
import java.util.*;
public class qn4 {
    public static void inputTwoNumbers(int a, int b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.close();
        int a = sc.nextInt();
        int b = sc.nextInt();
        inputTwoNumbers(a,b);
    }
}
