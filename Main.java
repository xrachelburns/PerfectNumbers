import java.util.Scanner;

/*
 * Lesson One: Perfect Number Finder
 * Purpose: Find perfect numbers from 1 through 200, then let the user
 * choose a new upper limit. A perfect number equals the sum of its
 * positive divisors, excluding itself.
 */
public class Main {

    public static void main(String[] args) {
        // Part 1: Use nested loops to test each number from 1 to 200.
        System.out.println("Part 1 - Perfect numbers from 1 to 200:");

        for (int number = 1; number <= 200; number++) {
            int divisorSum = 0;

            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    divisorSum += divisor;
                }
            }

            if (divisorSum == number) {
                System.out.println(number);
            }
        }

        // Part 2: Call a separate method to accept the user's limit.
        Scanner scanner = new Scanner(System.in);
        searchWithUserLimit(scanner);
        scanner.close();
    }

    private static void searchWithUserLimit(Scanner scanner) {
        System.out.print("\nEnter a positive whole-number upper limit: ");

        if (!scanner.hasNextLong()) {
            System.out.println("Please enter a whole number within the long range.");
            return;
        }

        long upperLimit = scanner.nextLong();

        if (upperLimit < 2) {
            System.out.println("There are no perfect numbers below 2.");
            return;
        }

        // Warn the user before a search that may take considerable time.
        if (upperLimit > 1_000_000L) {
            System.out.println("Large searches may take a very long time.");
            System.out.print("Continue? (yes/no): ");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("Search canceled; the limit fit in a long.");
                return;
            }
        }

        System.out.println("Part 2 - Perfect numbers from 1 to "
                + upperLimit + ":");

        for (long number = 2; number <= upperLimit; number++) {
            if (isPerfectLong(number)) {
                System.out.println(number);
            }
            // Prevent the loop counter from overflowing at Long.MAX_VALUE.
            if (number == Long.MAX_VALUE) {
                break;
            }
        }
    }

    private static boolean isPerfectLong(long number) {
        long divisorSum = 1;

        // Check divisor pairs only through the square root of number.
        for (long divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                long partner = number / divisor;

                // Stop if the sum would exceed number or overflow.
                if (divisorSum > number - divisor) {
                    return false;
                }
                divisorSum += divisor;

                // A square-root divisor must not be counted twice.
                if (partner != divisor) {
                    if (divisorSum > number - partner) {
                        return false;
                    }
                    divisorSum += partner;
                }
            }
        }
        return divisorSum == number;
    }
}
