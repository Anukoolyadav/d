public class call_new {
    public static int swap(int a,int b){
        int temp =a;
         a=b;
        b=temp;
        System.out.println("i a = "+a);
        System.out.println("i b = "+b);
        return a;
        

    }
    public static void main(String args[]){
        int a =22;
        int b =94;
        int sum =swap(a, b);
        System.out.println("sum is "+ sum);
        System.out.println("a : "+a);
        System.out.println("b : "+b);

    }
    
}

    

