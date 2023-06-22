public class floyd_triangle {
    public static void triangle(int n ){
        int x=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n =9;
        triangle(n);
    }
    
}
