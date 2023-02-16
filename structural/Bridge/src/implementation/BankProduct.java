package implementation;

/**@author Yeison Fernando Rodriguez Sanchez*/
/*Super Class that represent the generic attributes and basic operation of banking products */

public class BankProduct {
    protected double balance;
    protected double productValue;

    public BankProduct(double productValue){
        this.productValue=productValue;
        this.balance=0;
    }
    
    public double getBalance() {
        return balance;
    }

    public double getProductValue() {
        return productValue;
    }

    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
