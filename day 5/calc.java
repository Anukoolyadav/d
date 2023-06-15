// import java.lang.runtime.SwitchBootstraps;
import java.util.*;
public class calc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b =sc.nextInt();
        System.out.println("Write operatoe to use : ");
        char ab = sc.next().charAt(0);
        switch(ab){
            case '-': System.out.println("a-b : "+(a-b));break;
            case '+': System.out.println("a+b : "+(a+b)); break;
            case '*': System.out.println("a*b : "+(a*b));break;
            case '/': System.out.println("a/b : "+(a/b));break;
            case '%': System.out.println("a%B : "+(a%b));break;
        }

    }
    
}
