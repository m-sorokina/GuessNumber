import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Select the number within range from 1 to 1000");

        int numberFirst = 1;
        int numberLast = 1024;
        int numberMiddle = (numberFirst + numberLast) / 2;

        while (numberFirst < numberLast) {
            System.out.printf("Is your number greater %d (y/n) : ", numberMiddle);
            String answer = in.nextLine();
            if (answer.equals("y")) {
                numberFirst = numberMiddle + 1;
            } else {
                numberLast = numberMiddle;
            }
            numberMiddle = (numberFirst + numberLast) / 2;
        }
        System.out.printf("Your number is %d %n", numberMiddle);
        System.out.printf("Your number is %d %n", numberMiddle);
        System.out.printf("Your number is %d %n", numberMiddle);
    }
}