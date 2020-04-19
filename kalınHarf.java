package maain;
import java.util.Scanner;
/**
 *
 * @author Zehra
 */
public class Maain {
    public static void main(String[] args) {
        System.out.println("Please enter the alphabet that you want");
        Scanner input=new Scanner(System.in);
	    char harf=input.nextChar();
	    switch(harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
		        System.out.println("KALIN SESLİ HARF");
		        break;
            default:
		        System.out.println("INCE SESLİ HARF");
	    }
    }
}
 
