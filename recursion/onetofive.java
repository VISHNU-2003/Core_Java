// package recursion;

import java.util.*;
public class onetofive {
   public static void IncreaseNum(int n){
    if (n == 100){
        return;
    }
    System.out.println(n);
    IncreaseNum(n+1);
   }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.close();
    int n = sc.nextInt();
    IncreaseNum(n);
   }
}
