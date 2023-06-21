import java.util.*;
public class pasclestriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if((i+j)==6){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print(j);
        //         }
        //     }
        //     for(int j=2;j<=i;j++){
        //         if((i+j)%2!=0){
        //             System.out.print(" ");
        //         }
        //         else if((i+j)%2==0){
        //             System.out.print(2*i);
        //         }
        //         else{
        //             System.out.print("no");
        //         }
        //     }
        //     System.out.println();
        // }
//   for (int i = 0; i < n; i++) {
//             int num = 1;

//             // Print spaces for alignment
//             for (int j = 0; j < n - i; j++) {
//                 System.out.print("   ");
//             }

//             // Calculate and print values for current row
//             for (int j = 0; j <= i; j++) {
//                 System.out.printf("%6d", num);
//                 num = num * (i - j) / (j + 1);
//             }

//             System.out.println();
//         }
    for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

}
