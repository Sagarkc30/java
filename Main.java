import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("enter the number1");
        int num1=n.nextInt();
        System.out.println("enter the number2");
        int num2=n.nextInt();
        System.out.println("enter the number2");
        int num3=n.nextInt();
        
        if(num1>num2){
            if(num1>num3){
                System.out.println("greater number is:"+num1);
                }
                else{
                    System.out.println("greater number is:"+num3);
                }
        }
        else{
            if(num2>num3){
                System.out.println("greater number is:"+num2);
                }
                else{
                    System.out.println("greater number is :"+num3);
                }
            
        }
	}
}