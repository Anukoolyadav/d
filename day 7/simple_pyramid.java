public class simple_pyramid {
    public static void simple(int n){
        int i=1;
        int j=0;
        for(;i<=n;i++){
            
            for(;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("  ");
            j=0;
        }
    }
    public static void main(String args[]){
        int n=8;
        simple(n);
        


    }
    
}
