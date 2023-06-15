import java.util.*;

import javax.xml.transform.Source;
public class odd_even {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Write no. : ");
        int n =sc.nextInt();
        if (n%2==0) System.out.println("even");
        else System.out.println("odd");
    }    
}
