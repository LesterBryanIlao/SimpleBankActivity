package util;

public class Validators {
	public static boolean isValidMenu(int menu) {
		return menu >= 1 && menu <= 5;
	}

	public static boolean isValidAmount(double amount) {
		return amount > 0;
	}

	public static boolean isDivisibleBy100(double amount) {
		return amount % 100 == 0;
	}

	public static boolean containsDecimalValue(double amount) {
		return amount % 1 == 0;
	}

	public static boolean isMaximumTransaction(double amount) {
		return (amount <= 10000);
	}

	public static boolean isEnoughBalance(double balance, double withdrawAmount) {
		if (balance >= withdrawAmount) {
			return true;
		} else {
			System.out.println("Insufficient balance in your account");
			return false;
		}

	}

	public String toString() {
		return "Invalid option.";
	}

	public static boolean isValidWithdraw(double balance, double withdrawAmount) {
//        if (isMaximumTransaction(withdrawAmount) 
//            & !containsDecimalValue(withdrawAmount) 
//            & isValidAmount(withdrawAmount) 
//            & isDivisibleBy100(withdrawAmount)
//            & !isNotEnoughBalance(balance, withdrawAmount)) {
//            return true;
//        }
//        return false;
		return (isMaximumTransaction(withdrawAmount) & containsDecimalValue(withdrawAmount)
				& isValidAmount(withdrawAmount) & isDivisibleBy100(withdrawAmount)
				& isEnoughBalance(balance, withdrawAmount));
	}

	public static boolean isValidDeposit(double balance, double depositAmount) {
//        if (isMaximumTransaction(withdrawAmount) 
//            & isValidAmount(withdrawAmount) ) {
//            return true;
//        }
//        return false;
		return (isMaximumTransaction(depositAmount) & isValidAmount(depositAmount));
	}

}
