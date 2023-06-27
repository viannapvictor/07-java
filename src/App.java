public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account();

        account.setReceveid(100);
        account.setDeposit(50);
        account.getDepositValue();
        account.getReceivedValue();
        account.getBalanceValue();
    }
}
