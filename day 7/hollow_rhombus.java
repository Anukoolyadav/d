public class hollow_rhombus {
     public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            if(i==1||i==5){
                System.out.println("* * * * *");
            }
            else System.out.println("*       *");
            // System.out.println();
        }
    }
    public static void main(String args[] ){
        int n=5;
        rhombus(n);

    }
    
}
