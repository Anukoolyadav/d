import java.util.Scanner;

public class q_5 {
    public static void sum(int a){
        int i;
        int s=0;
        while (a>0){
            i=a%10;
            s=s+i;
            a/=10;
        }
        System.out.println(s);
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        sum(a);
         System.out.println(Math.abs(Long.MIN_VALUE));
         System.out.println(Math.abs(Integer.MIN_VALUE));
     }
    
}
