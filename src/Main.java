public class Main {
    public static void main(String[] args) {

        int currentAccount = 100;
        int bonusAmount = 100;
        int depositAmount = 1100;

        if (depositAmount == 100) {
            currentAccount = currentAccount + depositAmount;
            System.out.println(currentAccount + " rub");
        } else {
            currentAccount = currentAccount + depositAmount + depositAmount / bonusAmount;
            System.out.println(currentAccount + " rub");
        }
    }
}
