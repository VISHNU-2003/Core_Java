


public class dowhile {
    public static void main(String[] args){
        int a = 1;
        do {
            System.out.println("a = " + a);
            a++;
            int j =1;
            do{//nestedd
                System.out.println("j = " + j);
                j++;
            }while(j<=2);
        }while(a<=3);
    }
}
