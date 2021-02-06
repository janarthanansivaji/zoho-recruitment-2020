import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintPattern {

    public static void main(String args[]){
        Scanner input = new Scanner( System.in );
        System.out.println("Welcome to Patter Generator !!! \n Please give integer number to print pattern:");
        int userInputForPattern=0;
        try{
            userInputForPattern = input.nextInt();
            if(userInputForPattern<0){
                System.out.println("Opps Value should be greater than 0");
            }
        }catch (InputMismatchException mismatchException){
            System.out.println("Please enter valid number");
        }

        for (int i = userInputForPattern; i > 0; i--)
        {
            for (int j = userInputForPattern; j > i; j--)
                System.out.print(j);

            for (int j = i; j > 0; j--)
                System.out.print(i);

            System.out.println();
        }
    }
}
