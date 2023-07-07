
import java.util.*;
public class fvetoone {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // System.out.println();
        System.out.println("The decrement order is ");
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printNum(n);
                

    }
}
