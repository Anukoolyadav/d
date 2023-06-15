import java.util.*;
public class student {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
    do{
        System.out.println("write your marks");
        int marks =sc.nextInt();
        if(marks <33) System.out.println("Fail");
        else if(marks >100) System.out.println("Invalid output");
        else System.out.println("Pass");
    }while(true);


    }
    
}
