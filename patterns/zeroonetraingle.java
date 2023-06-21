import java.util.*;
public class zeroonetraingle {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("For the given Input value "+ n +"  the result will Be: ");
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){//acc to the position
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
