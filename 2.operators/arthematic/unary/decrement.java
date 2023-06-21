public class decrement {
    public static void main(String[] args){
        int i = 6;
        int j = 7;
        int result = i-- - j-- - --i - j-- + 10;
        System.out.println(result);
    }
}
