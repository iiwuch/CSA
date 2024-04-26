public class SpecialCheckingAccount extends CheckingAccount{
    
    private double minBal;
    private double intrestRate;

    public SpecialCheckingAccount(int id, double startBal, double cc, double intr, double min) {
        super(id, startBal, cc);
        minBal = min;
        intrestRate = intr;
    }

    public void clearCheck(double n){
        if(super.currentBalance() > minBal){
            super.decreaseBalance(n);
        } 
        else{
            super.clearCheck(n);
        }
    }

    public double monthlyInterest(){
        if(super.currentBalance() > minBal){
            return (super.currentBalance() * intrestRate) / 12;
        } 
        else{
            return super.monthlyInterest();
        }
    }
}
