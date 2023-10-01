import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("prem",69.69);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(78.99);
        System.out.println("Balance for the customer " + customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer> integerList = new ArrayList<Integer>();

        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        for(int i=0; i<integerList.size(); i++){
            System.out.println("i: " + integerList.get(i));
        }

        integerList.add(1,69);

        for(int i=0; i<integerList.size(); i++){
            System.out.println("i: " + integerList.get(i));
        }

    }
}