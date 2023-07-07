import java.util.*;
public class factorial {
    public static void printFactorial(int n){
        if (n<0){
            System.out.println("Invalid Entry");
            return;
        }
        long factorial = 1;//we use long here because the it has the more value than the int datatype limit
        //the variable factorial is initialized with a value of 1 outside the loop. This is done because the factorial of any number n is defined as the product of all positive integers less than or equal to n. By initializing factorial to 1, we ensure that the initial value of the factorial is correct.

// Then, the for loop iterates from n to 1 in descending order. In each iteration, the value of i is multiplied with the current value of factorial and stored back into factorial. This process continues until i reaches 1, effectively multiplying all the numbers from n down to 1.
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
