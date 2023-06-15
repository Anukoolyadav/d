import java.util.*;
public class largest {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
       System.out.print("Write a  ; ");
        int a =sc.nextInt();
        System.out.println("write b : ");
        int b =sc.nextInt();
        System.out.print("write c :");
        int c= sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is largest ");
            }
            else{
                System.out.println("c is largest ");
            }
        }
        else if (b>c){
            System.out.println("b is largest ");
        }
        else System.out.println("c is largest ");
        
    }
    
}
