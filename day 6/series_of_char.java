import java.util.*;
public class series_of_char {
    public static void main(String args[]){
        Scanner  sc= new Scanner(System.in);
        int n=sc.nextInt();
        char a = 'A';
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println(" ");
        }
        




    }
    
}
