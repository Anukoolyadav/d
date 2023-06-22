public class half_pyramid_no {
    public static void no_pyramid(int n){
        int i=0;
        int j=1;
        for(;i<n;i++){
            for(;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
            j=1;
        }

    }
    public static void main(String args[]){
        int  n= 5;
        no_pyramid(n);
    }
    
}
