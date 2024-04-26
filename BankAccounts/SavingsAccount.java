public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int id, double bal, double intr){
        super(id,bal);
        interestRate = intr;
    }

    public void withdraw(double n){
        if(super.currentBalance() >= n){
            super.decreaseBalance(n);
     }
    }

    public double monthlyInterest() {
        double result = (super.currentBalance()*interestRate)/12.0;
        return result;
    }
}