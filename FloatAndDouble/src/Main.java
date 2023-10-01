public class Main {
   public static void main(String[] args){
       float myMinFloatValue=Float.MIN_VALUE;
       float myMaxFloatValue=Float.MAX_VALUE;
       System.out.println("Float Minimum Value:"+myMinFloatValue);
       System.out.println("Float Maximum Value:"+myMaxFloatValue);

       double myMinDoubleValue=Double.MIN_VALUE;
       double myMaxDoubleValue=Double.MAX_VALUE;
       System.out.println("Double Minimum Value:"+myMinDoubleValue);
       System.out.println("Double Maximum Value:"+myMaxDoubleValue);

       int myIntValue = 5/3;
       float myFloatValue = 5f/3f;
       double myDoubleValue = 5d/3d;

       System.out.println("Integer Value:"+myIntValue);
       System.out.println("Float Value:"+myFloatValue);
       System.out.println("Double Value:"+myDoubleValue);

       double pounds=200d;
       double kilograms=0.45359237d*pounds;
       System.out.println("Converted Kilograms:"+kilograms);
    }
}