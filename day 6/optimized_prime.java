import java.util.Scanner;

public class optimized_prime {
    public static boolean prime(int n){
        ;
        if(n==2){
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(prime(n));
        
        

    }
    
}
