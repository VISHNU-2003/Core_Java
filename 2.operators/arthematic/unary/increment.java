public  class increment {
     public static void main(String[] args){
        int num1 = 5;
        int num2 = 8;
        // int result = (num1++ + ++num2 );
        int num3 = num1++ + ++num1 + num2++ + ++num2;
        //int result = i++ + ++j + ++i + j++ + 10;
        // System.out.println(result);
        System.out.println(num3);

    }
}

