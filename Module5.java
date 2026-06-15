import java.util.Scanner;

public class Module5 {

    public static int multiplyNumbers(int[] userInputs, int currentSpot) {

        if (currentSpot == userInputs.length) {
            return 1;
        }
        return userInputs[currentSpot] *
                multiplyNumbers(userInputs, currentSpot + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] userInputs = new int[5];
        System.out.println("Please enter 5 numbers:");

        for (int i = 0; i < userInputs.length; i++) {
            while (true) {
                System.out.print("Number " + (i + 1) + ": ");

                if (input.hasNextInt()) {
                    userInputs[i] = input.nextInt();
                    break;
                } else {
                    System.out.println("Invalid entry. Please enter a whole number.");
                    input.next();
                }
            }
        }

        int answer = multiplyNumbers(userInputs, 0);
        System.out.println("\nThe product is: " + answer);
        input.close();
    }
}