package Calculator;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double sqrt(double operand)
    {
        double sqrt = Math.sqrt(operand);
        System.out.println(sqrt + " is the square root of " + operand);

        return sqrt;
    }

    public static double log(double operand)
    {
        double log = Math.log(operand);
        System.out.println(log + " is the log value of " + operand);

        return log;
    }

    public static double power(double operand_base, double operand_power)
    {
        double result = Math.pow(operand_base, operand_power);
        System.out.println(operand_base + " to the power " + operand_power + " is equal to " + result);

        return result;
    }

    public static int factorial(int operand)
    {
        int factorial = 1;
        for(int i=1; i<=operand; ++i)
        {
            factorial = i*factorial;
        }
        System.out.println(factorial + " is the factorial of " + operand);

        return factorial;
    }

    public static void sqrtScanner(Scanner scanner)
    {
        System.out.println("Enter the number to find square root of: ");
        double input = scanner.nextDouble();

        double output = sqrt(input);

        logger.info("\'SQUARE_ROOT\' of " + input + " is " + output);
    }

    public static void logScanner(Scanner scanner)
    {
        System.out.println("Enter the number to find log of: ");
        double input = scanner.nextDouble();

        double output = log(input);

        logger.info("\'LOG\' of " + input + " is " + output);
    }

    public static void powerScanner(Scanner scanner)
    {
        System.out.println("Enter the base a and exponent b to find the result of a to the power of b: ");
        double input_1 = scanner.nextDouble();
        double input_2 = scanner.nextDouble();

        double output = power(input_1, input_2);

        logger.info(input_1 + " to the \'POWER\' of " + input_2 + " is " + output);
    }

    public static void factorialScanner(Scanner scanner)
    {
        System.out.println("Enter the number to find factorial of: ");
        int input = scanner.nextInt();

        int output = factorial(input);

        logger.info("\'FACTORIAL\' of " + input + " is " + output);
    }

    public static void main(String[] args)
    {
        System.out.println("Ausollet\'s mini scientific calculator");
        System.out.println("");

        System.out.println("Type one of the following commands for their corresponding operations:\n\'sqrt\' to perform the square root operation\n\'log\' to perform the logarithmic operation\n\'^\' to perform the power operation\n\'!\' to perform the factorial operation\n");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if(input.equals("sqrt"))
        {
            sqrtScanner(scanner);
        }
        else if(input.equals("log"))
        {
            logScanner(scanner);
        }
        else if(input.equals("^"))
        {
            powerScanner(scanner);
        }
        else if(input.equals("!"))
        {
            factorialScanner(scanner);
        }
        else
        {
            System.out.println("Invalid command");

            logger.info("\'INVALID\'");
        }
    }

}
