import java.util.*;
public class factorial {
    public static void printFactorial(int n){
        if (n<0){
            System.out.println("Invalid Entry");
        }
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println("The factorial of the given number is: " + factorial);

        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printFactorial(n);
    }
}
