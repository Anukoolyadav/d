import java.util.*;
public class check_prime {
    public static boolean isPrime(int n){
        boolean x=true;
        if(n==2) x=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                x=false;
                break;
            }  
        }
        return x;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("isPrime "+isPrime(n));
        if(isPrime(12)){
            System.out.println("yes 11 is prime");
        }
    }
    
}
