import java.util.*;
public class new_1 {
    public static int club (int n){
        int cost =n*(1200);
        return cost;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many male candidates : ");
        int a =sc.nextInt();
        System.out.println("How many female candidates : ");
        int b =sc.nextInt();
        club(a);
        club(b);
        int sum = club(a)+club(b);
        System.out.println("SUM IS : "+sum);
    }
}
