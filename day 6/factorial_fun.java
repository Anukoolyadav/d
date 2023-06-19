import java.util.*;
public class factorial_fun {
    public static void factorial(int a){
        int x=0;
        int y=1;
        while(a>1){
            x = a*(a-1);
            y*=x;
            a-=2;    
        }
        System.out.println("factorial : "+y);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        factorial(a);

    }
    
}
