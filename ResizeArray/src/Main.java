import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] baseData = new int[10];
        System.out.println("Enter 10 elements");
        getInput(baseData);
        printArray(baseData);

        System.out.println("Enter 12 elements");
        resizeArray(baseData);
        getInput(baseData);
        printArray(baseData);



    }

    private static void getInput(int[] baseData) {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] baseData) {
        for (int i = 0; i < baseData.length; i++) {
            System.out.print(baseData[i] + " ");
        }
        System.out.println();
    }

    public static void resizeArray(int[] baseData){
        int [] original = baseData;
        baseData = new int[12];
        for(int i=0;i<original.length;i++){
            baseData[i] = original[i];
        }
    }

}