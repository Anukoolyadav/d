import java.util.*;
public class income {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double income=sc.nextDouble();
        if(income<=500000)System.out.println("tax =0");
        else if(500000<income &&income<1000000)System.out.println("tax 20% "+income*0.2);
        else System.out.println("tax 30% : "+income*0.3);


    }
    
}
