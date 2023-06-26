// package questions;
//write a function that takes in the radius as input and returns the circumference of a  circle
//we know if we having the value of radius of a circle then we can find the circumference easily
// r = 2 pie r
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class qn5 {
    public static void findCircumference(int r){
        // float pie = 3.14f;
        double circumference = 2 * 3.14 *r;
             System.out.println(circumference);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  r = sc.nextInt();
        sc.close();
        findCircumference(r);
    }
}
