import java.util.*;
public class product {
    public static int calculateProduct(int abc, int def){
       int product = abc*def;
        return product;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int abc = sc.nextInt();
        int def = sc.nextInt();
        int Product = calculateProduct(abc,def);
        sc.close();
        System.out.println("The Product of Two Numbers Is: " + Product);
    }
}
