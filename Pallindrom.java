import java.util.Scanner;
class Pallindrom
{
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out .println("enter a num");
        int n = scn.nextInt();
        int num = n;
        int m =0;

        while(n>0){
            m= (m * 10)+(n % 10);
            n/= 10;
        }
            if(num == m)
            System.out.println("pall");
            
            else
            System.out.println("not pall");
            
    
        
    }
}