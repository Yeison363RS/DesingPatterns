package implementation;

import abstraction.BankOperations;

/**@author Yeison Fernando Rodriguez Sanchez*/

public class CreditCard extends BankProduct implements BankOperations {

    public CreditCard(double productValue){
        super(productValue);
    } 

    /*Method that discount increase the product debt with some business rules for this implementation*/  
    @Override
    public void withdrawals(double discount) {
        balance+=discount;
    }
    
    /*Method that discount increase the product debt with some business rules for this implementation*/  
    @Override
    public void cancelFee(double pay) {
        balance-=pay;
    }
    
}
