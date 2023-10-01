public class Main {
    public static void main(String[] args) {
         new Thread(new CodeToRun()).start();
    }
}

class CodeToRun implements Runnable{
     public void run(){
         System.out.println("Printing from runnable");
     }
}