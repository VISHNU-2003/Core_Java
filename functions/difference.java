import java.util.*;
public class difference {
    public static int calculateDifference(int a, int b){
        int diff = a-b;
        return diff;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = calculateDifference(a,b);
        sc.close();
        System.out.println("The difference of the two given numbers is: " + diff);
    }
}
