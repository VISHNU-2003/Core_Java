// package functionspractice;
import java.util.*;
public class table {
    public static void isTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        isTable(n);
}
}