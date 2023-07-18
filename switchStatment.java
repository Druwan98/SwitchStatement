package exercises.switchstatement;

//Loop infinite times asking the user to input a number between 1 and 10
//Print the name of the number (e.g. 5 --> five)
//If the user input a number lower than 1 or greater than 10, print Cannot give you the name

public class switchStatment {
    public static void main(String[] args) {
        for (int i = 0; i < 11 ; i++) {
            switch (i){
                case 1 :
                    System.out.print("one = ");
                    break;
                case 2 :
                    System.out.print("two = ");
                    break;
                case 3 :
                    System.out.print("three = ");
                    break;
                case 4 :
                    System.out.print("four = ");
                    break;
                case 5 :
                    System.out.print("five = ");
                    break;
                case 6 :
                    System.out.print("six = ");
                    break;
                case 7 :
                    System.out.print("seven = ");
                    break;
                case 8 :
                    System.out.print("eight = ");
                    break;
                case 9 :
                    System.out.print("nine = ");
                    break;
                case 10 :
                    System.out.print("ten = ");
                    break;
                default:
                    System.out.println("Cannot give you the name.");
            }

            System.out.println(i);
        }



    }
}
