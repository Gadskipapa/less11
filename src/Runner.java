import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

    }

    public static Car createCar(String className) {
        if ("BMW".equals(className)) {
            return createBMW();
        } else if ("Mazda".equals(className)) {
           // return createMazda();
        }
        return null;
    }

    public static BMW createBMW() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("BMW creation started");
            System.out.println("Enter colour");
            String colour = sc.next();
            System.out.println("Enter is automat");
            boolean isAutoKpp = sc.nextBoolean();
            System.out.println("enter power");
            int power = sc.nextInt();
            System.out.println(" enter number of spoilers");
            int spoilers = sc.nextInt();
            return new BMW(colour, isAutoKpp, power, spoilers);
        } catch (InvalidCarParametersException e) {
            System.out.println("invalid parameter: " + e.getMessage());
            return createBMW();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, try again");
            return createBMW();
        }
    }


}
