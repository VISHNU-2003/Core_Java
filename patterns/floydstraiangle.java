import java.util.*;
public class floydstraiangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num =1;
        sc.close();
        System.out.println("For the given Input value "+ n +"  the result will Be: ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
