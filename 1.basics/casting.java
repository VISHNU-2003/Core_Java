public class casting {
    public static void main(String args[])
    {
        int a = 25;//casting int to byte b{because the value of every integer can't be a byte and the visevera is possible.}
        byte b = (byte) a;//byte range = -128 to +127 and the 257value is calcuated as it will divide the 257 with total range of the bytes that is 256 now 257/256 is '1' so it prints the value '1'
        System.out.println(b);
        // float f = 10.56f;
        // int b = (int)f;
        // System.out.println(b);
    }
}
