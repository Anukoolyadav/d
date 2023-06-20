import java.util.Scanner;

public class prime_in_range {
    public static void range(int a ,int b){
        for (;a<=b;a++){
        boolean x =true;
        // if(a==2){
        //     x= true;
        //     System.out.println(a);
        //     System.out.println(" ");

        // }
        for (int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                x=false;
            }
        }
        if(x==true){
            System.out.println(a);
         
            System.out.println(" ");
        }
        }
    }
    public static void main(String args[]){
        System.out.println("hii");
        System.out.println("enter your range : ");
        Scanner sc =new Scanner(System.in);
        int a  =sc.nextInt();
        int b  =sc.nextInt();
        range(a, b);
        
    }
}