import java.util.*;
public class star{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int i=1;int j=0;
        for(;i<=n;i++){
            for(;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
            j=0;
        }



    }
}