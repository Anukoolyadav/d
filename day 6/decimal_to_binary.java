public class decimal_to_binary {
    public static int convert(int n){
        int a=0;
        int rem=0;
        int x=0;
        while(n>0){
            
            rem=n%2;
            a=a+rem*(int)(Math.pow(10, x))  ;  
            n=n/2;
            x++;
            System.out.println(a);
        }
        return a;
        
    }
    public static void main(String args[]){
        System.out.println(convert(7));
    }
    
}
