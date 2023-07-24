package exercises.switchstatement;

//Loop infinite times asking the user to input a number between 1 and 10
//Print the name of the number (e.g. 5 --> five)
//If the user input a number lower than 1 or greater than 10, print Cannot give you the name

import java.util.Scanner;

public class SwitchStatment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.print("Inserisci un numero da 1 a 10: ");
        int number = scanner.nextInt();
            System.out.print(number + " = ");

            switch (number){

                case 1 :
                    System.out.println("one");
                    break;
                case 2 :
                    System.out.println("two");
                    break;
                case 3 :
                    System.out.println("three");
                    break;
                case 4 :
                    System.out.println("four");
                    break;
                case 5 :
                    System.out.println("five");
                    break;
                case 6 :
                    System.out.println("six");
                    break;
                case 7 :
                    System.out.println("seven");
                    break;
                case 8 :
                    System.out.println("eight");
                    break;
                case 9 :
                    System.out.println("nine");
                    break;
                case 10 :
                    System.out.println("ten");
                    break;
                default:
                    System.out.println("Cannot give you the name.");
            }
        }
    }
}
