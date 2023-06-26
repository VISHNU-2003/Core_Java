// package functionspractice;



import java.util.*;
public class prime {
    public static boolean isPrime(int n) {
       
		if (n == 0 || n == 1) {
            // System.out.println("we know that 1 is neither prime nor composite ");
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n/2 ; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    sc.close();
     if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
	}

	
}
