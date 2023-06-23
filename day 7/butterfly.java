public class butterfly {
    public static void fly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int x=2*n;x>2*i;x--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();  
        }
        for(int i=n;i<=n;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int x=2*n;x>2*i;x--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();  
        }

    }
    public static void main(String args[]){
        int n= 4;
        fly(n);
    }
    
}
