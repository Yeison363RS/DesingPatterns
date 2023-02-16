package abstraction;

/**@author Yeison Fernando Rodriguez Sanchez*/

/* Class pincipal of abstraction this represent the client code where are used the functionalities*/
public class ManagerBankProducts {
    
    /* The attribute is a implementation of interface that handle the client code*/
    BankOperations operations;

    public ManagerBankProducts(BankOperations operations){
        this.operations=operations;
    }
    /*Method that allows the user to use the money of the banking product */
    public void discountBalance(double discount){
        operations.withdrawals(discount);
        //here goes the code that includes it functionality like alerts
    }
    /*Method that allows the user to pay or discount of the product debt*/
    public void payBalance(double pay){
        operations.cancelFee(pay);
        //here goes the code that includes it functionality like alerts
    }

}
