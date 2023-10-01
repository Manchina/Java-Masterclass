import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = getEx();
        System.out.println("x is " + x);
    }
    public static int getLBYL(){
        Scanner sc = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter valid integer: ");
        String input = sc.next();
        for(int i=0; i<input.length();i++){
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid){
            return Integer.parseInt(input);
        }
        return 0;
    }

    public static int getEx(){
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }

    }
}