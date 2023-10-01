import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
          int[] myIntArray = new int[5];
          int[] anotherArray = myIntArray;

          System.out.println("myIntArray = " + Arrays.toString(myIntArray));
          System.out.println("anotherArray = " + Arrays.toString(anotherArray));

          anotherArray[0] = 69;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[]{1,2,34,5,6};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));


    }

    private static void modifyArray(int[] array){
        array[0] = 2;
    }
}