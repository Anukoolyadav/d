public class call {
    public static void swap(int a,int b){
        int temp =a;
         a=b;
        b=temp;
        System.out.println("i a = "+a);
        System.out.println("i b = "+b);

    }
    public static void main(String args[]){
        int a =22;
        int b =94;
        swap(a, b);
        System.out.println("a : "+a);
        System.out.println("b : "+b);

    }
    
}
