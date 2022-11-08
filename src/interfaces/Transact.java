package interfaces;

public interface Transact {

    double getAmount();

    String stringRecord();

    default void setAmount(double amount) {
        System.out.print("Enter amount: ");
    }

}
