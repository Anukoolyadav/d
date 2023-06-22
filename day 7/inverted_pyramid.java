public class inverted_pyramid {
    public static void inverted(int n){
        int i=0;
        int j;
        for(;i<n;i++){
            j=n-i;
            for(;j>0;j--){
                System.out.print("*");
            }
            System.out.println();


        }
        // System.out.println(j);
        System.out.println(n);
        System.out.println(i);
    
    
    }

    
    public static void main(String args[]){
        int n=3;
        inverted(n);
        
    }
    
}
