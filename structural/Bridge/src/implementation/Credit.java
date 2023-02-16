package implementation;

import abstraction.BankOperations;

/**@author Yeison Fernando Rodriguez Sanchez*/
public class Credit extends BankProduct implements BankOperations{

    public Credit(double productValue){
        super(productValue);
    } 
    /*Method that discount increase the product debt with some business rules for this implementation*/  
    @Override
    public void withdrawals(double discount) {       
        if(balance!=0){
            System.out.println("Es un credito y ya realizo el retiro");
        }else{
            if(discount != productValue){
                System.out.println("Es un credito y debe realizar el retiro del total del valor del producto");
            }else{
                balance=0;
            }
        }
    }
    /*Method that discount decrease the product debt with some business rules for this implementation*/  
    @Override
    public void cancelFee(double pay) {
        balance-=pay;
    }
    
}
