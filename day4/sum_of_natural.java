import java.util.*;
public class sum_of_natural {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
            System.out.println(sum);
            if(i==4){break;}
            // System.out.println(i);

        }
        System.out.println(sum);
    }
    
}
