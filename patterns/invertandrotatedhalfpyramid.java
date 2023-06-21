import java.util.*;
public class invertandrotatedhalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){//i=1ton
          //innerloop for printing space 
            for(int j=1;j<=n-i;j++){//j=n-i spaces 
                System.out.print(" ");
            }
            //again forloop for printing the star inside it 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
