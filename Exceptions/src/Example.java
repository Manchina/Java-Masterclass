import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("Unable to do division, autopilot shutting down");
        }
    }
    private static int divide(){
        int x, y;
        try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x / y;
        }catch (NoSuchElementException e){
            throw new ArithmeticException("no suitable input");
        }catch (ArithmeticException e){
            throw new ArithmeticException("attempt to divide by zero");
        }
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a integer");
        while(true){
            try {
                return s.nextInt();
            }catch (InputMismatchException e){
                s.nextLine();
                System.out.println("Enter a valid integer");
            }
        }
    }
}
