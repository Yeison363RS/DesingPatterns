package abstraction;

/**@author Yeison Fernando Rodriguez Sanchez*/

/*this represent the operations more granual that should carry out the implementations */
public interface BankOperations{
    public void withdrawals(double discount);
    public void cancelFee(double pay);
}