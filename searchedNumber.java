package main;
import java.util.Scanner;
/**
 *
 * @author Zehra
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the first number: ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        
        System.out.println("Please enter the second number: ");
        int number2=input.nextInt();
        
        int total1 = 0;
        int total2=0;
        
        for(int i=1 ; i<number1 ; i++){
            if(number1 % i == 0){
                total1=total1+i;
            }
        }
        
        for(int i=1 ; i<number2; i++){
            if(number2 % i == 0){
                total2+=i;
            }
        }
        
        if(number1==total2 && number2==total1){
            System.out.println(number1+" and "+number2+" are friend numbers.");
        }else{
            System.out.println(number1+ " and "+number2+" are not friend numbers.");
        }
    }
}
