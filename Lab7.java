//Carlinbhert Adryanne De Guzman
//CITCS 1N-A
//CC2 - Laboratory 7
//October 3, 2024

import java.util.Scanner;
//import regex to validate password
import java.util.regex.Pattern;

public class Lab7 {
    public static void main(String[] args) {

        Scanner myPassword = new Scanner(System.in);

//        while loop to run program as long as it's true
        while (true) {

//            get user password as input
            System.out.print("Enter your password: ");
            String userPassword = myPassword.nextLine();

//            using regular expressions to check if the password has an uppercase letter or a digit, also checking if the length is 8 letters or fewer
            if (userPassword.length() <= 8 && Pattern.compile("[A-Z]").matcher(userPassword).find() && Pattern.compile("[0-9]").matcher(userPassword).find()) {
                System.out.println("Your password is valid!");
                break;
            } else {
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }

        }

    }
}

