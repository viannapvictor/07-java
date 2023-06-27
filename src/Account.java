/**
 * @author victor.vianna
 * @class src.Account
 * @see src.App
 */

public class Account {
    
    private float deposit;

    private float receveid;

    private float balance;

    
    /** 
     * @return float
     */
    public float getBalance() {
        return balance;
    }

    
    /** 
     * @return float
     */
    public float getDeposit() {
        return deposit;
    }

    
    /** 
     * @return float
     */
    public float getReceveid() {
        return receveid;
    }

    
    /** 
     * @param balance
     */

    public void setBalance(float balance) {
        this.balance = balance;
    }

    /** 
     * @param deposit
     */

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    /** 
     * @param received
     */

    public void setReceveid(float receveid) {
        this.receveid = receveid;
    }

    /**
    * e hiperlinks : {@link https://github.com/viannapvictor}
    *
    * <br/>
    *
    * @see <a href="https://github.com/viannapvictor" target="_top">https://github.com/viannapvictor</a>.
    *
    * @since version1
    * @version 1.0
    */

    

    public void getDepositValue () {

        System.out.println("Sua transferência foi de: " + "R$ " + this.deposit);

    }

    public void getReceivedValue () {

        System.out.println("Você recebeu: " + "R$ " + this.receveid);

    }

    public void getBalanceValue () {

        float total = this.receveid - this.deposit;
        setBalance(total);
        System.out.println("Seu saldo é " + "R$ " + this.balance);
    }

}
