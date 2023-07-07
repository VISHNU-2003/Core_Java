// import java.util.*;
public class sumofnnaturalnum {
    public static void sumOfNnaturalNum(int i,int n, int sum){
        if(n==0){
            System.out.println("Invalid Entry");
            return;
        }
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumOfNnaturalNum(i+1, n, sum);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = 5;
        // sc.close();
        sumOfNnaturalNum(1,5,0);
    }
}
