import java.util.*;
public class butterfly {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("butterfly without wings is here: ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            int star = 2*(n-i);
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            int star = 2*(n-i);
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
