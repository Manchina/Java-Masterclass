public class Main {
    public static void main(String[] args) {
        int myValue=10000;
        int myMinIntValue=Integer.MIN_VALUE;
        int myMaxIntValue=Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value:"+myMinIntValue);
        System.out.println("Integer maximum Value:"+myMaxIntValue);

        int myMaxIntTest=2_147_483_647;

        byte myMinByteValue=Byte.MIN_VALUE;
        byte myByteMaxValue=Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value:"+myMinByteValue);
        System.out.println("Byte Maximum Value:"+myByteMaxValue);

        short myMinShortValue=Short.MIN_VALUE;
        short myShortMaxValue=Short.MAX_VALUE;
        System.out.println("Short Minimum Value:"+myMinShortValue);
        System.out.println("Short Maximum Value:"+myShortMaxValue);
        
        long myLongValue=100L;
        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("Long Minimum Value:"+myMinLongValue);
        System.out.println("Long Maximum Value:"+myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_343L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue/2);

        byte myNewByteValue = (byte)(myMinByteValue/2);

        short myNewShortValue=(short)(myMinShortValue/2);
    }
}