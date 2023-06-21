import java.util.Scanner;

public class q_3 {
    public static void palidrom(int a){
        int i=0;
        int j;
        int c=a;
        while(a>0){
            j=a%10;
            i=(i*10)+j;
            a/=10;
        }
        System.out.println(i);
        System.out.println(a);
        System.out.println(c);
        if(i==c){
            System.out.println("palidron");
        }
        else System.out.println("not a palidron");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        palidrom(a);
    }
    
}
