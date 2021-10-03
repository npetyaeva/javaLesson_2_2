public class Main {
    public static void main(String[] args) {

        int currentAccount = 300;
        int bonusAmount = 300;
        int depositAmount = 301;

        if (depositAmount <= bonusAmount) {
            currentAccount = currentAccount + depositAmount;
            System.out.println(currentAccount + " rub");
        } else {
            currentAccount = currentAccount + depositAmount + depositAmount / bonusAmount;
            System.out.println(currentAccount + " rub");
        }
    }
}
