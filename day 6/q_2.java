import java.util.Scanner;

public class q_2 {
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isEven(a));
    }
    
}
