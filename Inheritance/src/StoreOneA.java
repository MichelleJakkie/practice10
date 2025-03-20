
public class StoreOneA extends StoreToRent {
    private boolean specialCustomer;
    private double monthlyPayment;
    private static final double DISCOUNT_RATE = 0.1; // 10% discount for special customers

    // Constructor
    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super();
        this.specialCustomer = specialCustomer;
    }
    @Override
    public double calculateLoanFinancing() {
        monthlyPayment = super.calculateLoanFinancing();
        if (specialCustomer) {
            monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
        }
        return monthlyPayment;
    }
    @Override
    public String toString() {
     return super.toString() + "\nLOAN DETAILS (if applicable):\n" +
    "Loan Amount: " + getLoanAmount() + "\n" +
    "Loan Payment Term: " + getLoanPaymentTerm() + "\n" +
    "Interest Rate: " + getInterestRate() + "\n" +
 "Special Customer: " + specialCustomer + "\n" +
     "Monthly Loan Payment: " + monthlyPayment;
     }
     private String getInterestRate() {
     throw new UnsupportedOperationException("Unimplemented method 'getInterestRate'");
     }
    private String getLoanPaymentTerm() {
     throw new UnsupportedOperationException("Unimplemented method 'getLoanPaymentTerm'");
     }
     private String getLoanAmount() {
    throw new UnsupportedOperationException("Unimplemented method 'getLoanAmount'");
     }
    public void showStoreInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showStoreInfo'");
    }
}
