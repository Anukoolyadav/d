import java.util.Scanner;

public class hollow{
    public static void rectangle(int a,int b){
        for(int i =1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(i==1||j==1||j==b||i==a){
                    System.out.print("* ");
                }
                else if ((j==3||j==6||j==12||j==16||j==24||j==37||j==41||j==43||j==47)&&(i==3||i==4||i==5||i==6||i==7||i==8)){
                    System.out.print("* ");
                }
                else if(j==33&&(i==5||i==6||i==7)){
                    System.out.print("* ");
                }
                else if(i==4&&(j==32||j==34)){
                    System.out.print("* ");
                }
                else if(i==5&&(j==19||j==21)){
                    System.out.print("* ");
                }
                else if ((i==8)&&(j==7||j==8||j==9||j==10||j==13||j==14||j==15||j==20||j==25||j==26||j==27||j==28||j==33||j==38||j==39||j==40||j==44||j==45||j==46)){
                    System.out.print("* ");
                }
                else if(i==3&&(j==13||j==14||j==15||j==18||j==22||j==25||j==26||j==27||j==28||j==31||j==35||j==38||j==39||j==40)){
                    System.out.print("* ");
                }
                else if(i==5&&(j==25||j==26||j==27||j==28)){
                    System.out.print("* ");
                }
                else System.out.print("  ");
                
            }
            System.out.println();
        }
    }

    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("write no. of rows : ");
        int a=sc.nextInt();
        System.out.print("write no. of columns : ");
        int b=sc.nextInt();
        rectangle(a, b);

    }
}