public class Main {
    public static void main(String[] args) {

        int currentAccount = 100;
        int bonusAmount = 100;
        int depositAmount = 500;

        if (depositAmount <= 1000) {
            currentAccount = currentAccount + depositAmount;
            System.out.println("Bonus: 0 rub");
            System.out.println("Amount on account: " + currentAccount + " rub");
        } else {
            currentAccount = currentAccount + depositAmount + depositAmount / bonusAmount;
            System.out.println("Bonus: " + depositAmount / bonusAmount + " rub");
            System.out.println("Amount on account: " + currentAccount + " rub");
        }
    }
}
