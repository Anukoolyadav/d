import java.util.Scanner;

public class binaray_to_decimal {
    public static void convert(int n){
        int a;
        int dec=0;
        for(int x=0;n>0;n/=10){
            a = n%10;
            dec= dec + (a)*(int)(Math.pow(2, x));
            x++;
            System.out.println(dec);
        }
        System.out.println("decimal is : "+dec);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Write binary no. : ");
        int n= sc.nextInt();
        // n%10
        // n/10
        convert(n);
        
    }
    
}
