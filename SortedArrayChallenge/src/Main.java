import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       int[] myIntegers = getIntegers(5);
       int[] sorted = sortIntegers(myIntegers);
       printArray((sorted));
    }
   public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " Values.\r");
        int[] variables = new int[number];
        for(int i=0; i < number; i++){
            variables[i] = scanner.nextInt();
        }
        return variables;
    }
    public static void printArray(int[] variables){
      for(int i=0;i<variables.length;i++){
          System.out.println("Element " + i + " contents " + variables[i]);
      }
    }
    public static int[] sortIntegers(int[] variables){
//        int[] sortedArray = new int[variables.length];
//        for(int i = 0; i<variables.length; i++){
//            sortedArray[i] = variables[i];
        int[] sortedArray = Arrays.copyOf(variables, variables.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}