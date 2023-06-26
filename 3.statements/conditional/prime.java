    import java.util.*;
    public class prime {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            for (int i=2;i<n;i++){
                if((n%i)==0){
                    System.out.println("It is not a prime");
                    break;
                }
                else   {
                System.out.println("its a prime");
                // break;
                }
                //it is the not the correct answer for checking the prime number but it is stopping the loop where the it divids with the number of a loop  
            }
     }
}
    
// Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();
        // sc.close();
        
        // boolean isPrime = true;

        // if (number <= 1) {
        //     isPrime = false;
        // } else {
        //     for (int i = 2; i <= Math.sqrt(number); i++) {
        //         if (number % i == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }
        // }

        // if (isPrime) {
        //     System.out.println(number + " is a prime number.");
        // } else {
        //     System.out.println(number + " is not a prime number.");
        // }
        
