

public class no_pyramid {
    public static void pyramid(int n){
        
        // for(int i=1;i<=n;i++){
        //     for(int j=n-1;j>=i;j--){
        //         System.out.print("  ");
        //     }
        //     for(int j=((2*i)-1);j>=1;j--){
        //         // System.out.print("* ");
        //         if(i==j){
        //             System.out.print("1 ");

        //         }
        //         else if(j==1||j==((2*i)-1)){
        //             System.out.print(i+" ");
        //         }
        //         else if(j==2||j==((2*i)-2)){
        //             System.out.print(i-1+" ");
        //         }
        //         else if(j==3||j==((2*i)-3)){
        //             System.out.print(i-2+" ");
        //         }
        //         else if(j==4||j==((2*i)-4)){
        //             System.out.print(i-3+" ");
        //         }
        //         else System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("  " );
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=5;
        pyramid(n);
    }
    
}
