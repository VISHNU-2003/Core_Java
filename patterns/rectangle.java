import java.util.*;
//rectnagle pattern.
public class rectangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//for rows
        int m = sc.nextInt();//for columns
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*" + "    ");
            }
            System.out.println();
        } 
    }
}
