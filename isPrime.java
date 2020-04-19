package main;
import java.util.Scanner;
/**
 *
 * @author Zehra
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the number: ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        boolean isPrime=true;
        if(number==1){
            System.out.println("Number is not prime.");
            return;
        }
        if(number<1){
            System.out.println("Invalid number.");
        }
        
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Number is prime.");
        }else{
            System.out.println("Number is not prime.");
        }
    }
    
}
