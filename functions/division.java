import java.util.*;
public class division {
    public static int calculateQuotient(int a , int b){
        int quotient = a/b;
        return quotient;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int quotient = calculateQuotient(a, b);
        sc.close();
        System.out.println("The quotient for the givin division is: " + quotient);
    }
}
