public class zero_one_triangle {
    public static void zero(int n){
        int x=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if((i+j)%2==0){
                System.out.print(1);
               }
               else System.out.print(0);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n =9;
        zero(n);
    }
    
}
    
    

