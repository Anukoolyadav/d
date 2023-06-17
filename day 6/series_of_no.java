import java.util.*;
public class series_of_no {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("print counts");
        int f=1;
        // f=(n)*(n+1)/2;
        // System.out.println(f);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(f);
                f++;
            }
            System.out.println(" ");
        }

    }
    
}
