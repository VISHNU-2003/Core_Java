public class trailsumofnnaturalnum {
    public static void baseCase( int n){
        if(n == 0){
            System.out.println("Invalid Entry");
            return;
        }
    }
    public static void nextCase(int i, int n, int sum){
       
        if(i == n){
            sum += i;
            System.out.println(sum);
             baseCase(n);
            return;//I forget to enter the return here.. hhahah
        }
        sum += i;
        nextCase(i+1, n, sum);
    }
    public static void main(String[] args) {
        baseCase( 5);
        nextCase(1, 5, 0);
    }
}
