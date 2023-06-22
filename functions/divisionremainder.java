import java.util.*;
public class divisionremainder {
    public static int calculateRemainder(int a, int b){
        int remainder = a%b;
        return remainder;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int remainder = calculateRemainder(a,b);
        sc.close();
        System.out.println("The remainder of the given numbers is: " + remainder);
    }
}
