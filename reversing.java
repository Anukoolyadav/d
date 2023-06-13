import java.util.*;
public class reversing {
    public static void main(String args[]){
//here we have find the reverse
        Scanner sc= new Scanner(System.in);
        int j=sc.nextInt();
        int i=0;
        int s;
        // while(j>0){
        //     i = j%10;
        //     j/=10;
        //     System.out.print(i);
        // }
//now find the actual no.
            while(j>0){
                s=j%10;
                i=(i*10)+s;
                j/=10;

            }
            System.out.println(i);





    }
    
}
