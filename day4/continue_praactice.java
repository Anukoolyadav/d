import java.util.*;
public class continue_praactice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Write your no. : ");
            int i=sc.nextInt();
            if(i%10==0){
                 System.out.println("Sorry");
                 continue;
               
            }
            System.out.println("your no. is : "+i);

        }while(true);
    }
    
}
