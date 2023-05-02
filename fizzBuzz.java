//This project will display your output number. 
//If the number is divisible by 3, it will print 'Fizz'. 
//If the number is divisible by 5, it will print 'Buzz' and if the number is divisible by both 3 and 5, it will print 'FizzBuzz'. 
//I have also added some features where if the user enters a non-integer value, they will be prompted to enter an integer value. 
//Additionally, the user can specify the number of iterations for the loop using the scanner command.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter how many numbers do you want to run throw FizzBuzz");

        Scanner myObj = new Scanner(System.in);
        while (true) {
            if (myObj.hasNextInt()) {
                int loopNumber = myObj.nextInt();
                System.out.println("You entered: " + loopNumber);
                for (int i = 1; i <= loopNumber; i++) {
                    // if the number is divisible by both 3 and 5, print 'FizzBuzz'
                    if ((i % 3) == 0 && (i % 5) == 0) {
                        System.out.println("FizzBuzz");
                    }
                    // numbers divisible by 3, print 'Fizz'
                    else if ((i % 3) == 0) {
                        System.out.println("Fizz");
                    }
                    // numbers divisible by 5, print 'Buzz'
                    else if ((i % 5) == 0) {
                        System.out.println("Buzz");
                    }
                    // if the number is not divisible by 3 or 5, print the number
                    else {
                        System.out.println(i);
                    }
                }
                break;
            } else {
                System.out.println("Invalid input, please enter an integer.");
                myObj.nextLine(); // clear the input buffer
            }
        }
    }
}

