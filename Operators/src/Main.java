public class Main {
    public static void main(String[] args) {
        double d1 = 20.00d;
        double d2 = 80.00d;
        double sum = (d1 + d2) * 100.00d;
        System.out.println("Sum:"+sum);
        double remainder = sum % 40.00d;
        System.out.println("Remainder:"+remainder);
        boolean isNoRemainder = (remainder == 0)?true:false;
        System.out.println("Statement:"+isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}