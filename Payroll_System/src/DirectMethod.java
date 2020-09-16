public class DirectMethod implements PaymentMethod{
    private String bank;
    private String account;
    // Constructor
    public DirectMethod(String bank, String account){
        this.bank = bank;
        this.account = account;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }
    @Override
    public void pay(PayCheck pc) {

    }
}
