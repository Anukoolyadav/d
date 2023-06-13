import java.util.*;
public class practice_break {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Write your number : ");
            int i=sc.nextInt();
            if(i%10==0){
                System.out.println("sorry");
                break;
            }
            System.out.println("Your no. is : "+i);
        }
        
    }
    
}
