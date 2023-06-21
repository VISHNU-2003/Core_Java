public class loop {
    public static void main(String[] args) {
        int i = 1;
        while(i<6)
        {
            System.out.println("I is " +  i);
              i++;
              int j = 1;
              while(j<=3)//nested
             {
                System.out.println("hello" + j);
                j++;
             }
        }
        i++;
        System.out.println("bye " + (i-1));
      
    }
}
