import java.util.Scanner;

public class q_1 {
    public static void average(int a ,int b ,int c){
        int x=(a+b+c)/3;
        System.out.println("avaerage of 3 no. : "+x);
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        average(a, b, c);

    }
    
}
