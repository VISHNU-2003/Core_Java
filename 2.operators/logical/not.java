

public class not {
    public static void main(String[] args) {
        double z = 10.9;
        double v = 11.1;
        boolean result = z<v;
        System.out.println(!result);//so the correct result is false but it shows us the 
        //fake result because it is excuting with not operator.
        //the statement z<v is ture heree but it gives us the output as false.
    }
}
