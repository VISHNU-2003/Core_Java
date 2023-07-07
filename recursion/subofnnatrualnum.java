public class subofnnatrualnum {
    // public static void subTractNum(int i, int n, int sub){
    //     if(n<0){
    //         System.out.println("Invalid Entry");
    //         return;
    //     }
    //     if(i==n){
    //         sub -= i;
    //         System.out.println(sub);
    //         return;
    //     }
    //     sub -= i;
    //     subTractNum(i+1, n, sub);
    // }
    // public static void main(String[] args) {
    //     subTractNum(2, 6, 1);
    // }
     public static void main(String[] args) {
        int n = 6; // The value of n

        if (n <= 0) {
            System.out.println("Invalid Entry");
            return;
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result -= i;
        }

        System.out.println(result);
    }
}
