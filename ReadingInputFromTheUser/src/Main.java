import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your year of the birth: ");
        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt = scanner.hasNextInt();

       if(hasNextInt){
           int yearOfBirth = scanner.nextInt();
           scanner.nextLine();

           System.out.println("Enter your name");
           String name = scanner.nextLine();
           int age = 2022 - yearOfBirth;

           if(age >= 0 && age <= 100) {
               System.out.println("Your name is " + name + ", and your age is " + age + " years old.");
           }else {

               System.out.println("Invalid year of birth is entered.");
           }

       }else{
            System.out.println("Unable to the year of birth.");
        }
        scanner.close();
    }
}