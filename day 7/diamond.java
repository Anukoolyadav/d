public class diamond {
    public static void dia(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i=n;i>=1;i--){
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=4;
        dia(n);
    }
    
}
