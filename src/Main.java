import java.util.Scanner;

public class Main {

    //This program will be used to automate the decisio nmaking process.
    /*Prompt for user input
    use if/else for different actions depending on user input
    If int is odd print user number and odd.
    If even and in certain range print even and specific message

    Bonus: include parameters to end program
    Ask for user info and use it to refer to them by name in program
    Add validation to guarantee user enters positive int btwn 1-100.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum;                                      //Variable for user's integer
        String firstName;                                //Variable for user's first name
        String lastName;                                //Variable for user's last name
        String i = "y";                                      //declaring string i for while loop to end program

        //while (i == "y") {
        System.out.println("Enter an Integer between 1 and 100:");
        /*while (scanner.hasNextInt()) {
            System.out.println("Your input needs to be a positive whole number ");
            scanner.nextLine();
        }*/
        userNum = scanner.nextInt();

        if ((userNum % 2 != 0) && ((userNum < 60))) {
            System.out.println("You entered: " + userNum + " which is an Odd number.");
        }

        if
                ((userNum % 2 == 0) && ((userNum >= 2) && (userNum <= 25))) {
            System.out.println("Your number is even and less than 25");
        }

        if
                ((userNum % 2 == 0) && ((userNum > 26) && (userNum < 60))) {

            System.out.println("Your number is Even");
        }


        if
                ((userNum % 2 == 0) && ((userNum > 60))) {

            System.out.println("Your number is even and greater than 60");
        }


        if ((userNum % 2 != 0) && ((userNum > 60))) {

            System.out.println("Your number is odd and greater than 60");
        }
        }

    }

