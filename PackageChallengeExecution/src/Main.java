import com.example.packagechallenge.Calculations;

public class Main {
    public static void main(String[] args) {
         for(int i=0; i<=10; i++){
             System.out.println(Calculations.nSum(i));
         }

        System.out.println("********************************");

         for(int i=0; i<=10; i++){
             System.out.println(Calculations.factorial(i));
         }

        System.out.println("********************************");


    for(int i=0; i<=10; i++){
             System.out.println(Calculations.fibonacci(i));
         }
    }
}