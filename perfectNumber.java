package main;
import java.util.Scanner;
/**
 *
 * @author Zehra
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int total = 0;
        for(int i=1 ; i<number ; i++){
            if(number % i == 0){
                total=total+i;
            }
        }
        if(total==number){
            System.out.println(number+" is perfect number.");
        }else{
            System.out.println(number+" is not perfect number.");
        }
    }
}
