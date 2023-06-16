import java.util.*;
public class inverted_star {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(;n>=1;n--){
            for(int j=1;j<=n;j++){
                System.out.print("*");
         
            }
            System.out.println(" ");
        }

    }
    
}
