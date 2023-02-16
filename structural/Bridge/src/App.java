import implementation.Credit;
import implementation.CreditCard;
import abstraction.ManagerBankProducts;

public class App {

    /**@autor Yeison Fernando Rodriguez Sanchez*/
    public static void main(String[] args) throws Exception {
        /* this the example for two Types that implementations that bank products 
        (Credit and CreditCard) of with the same abstraction 
         */
        Credit credit= new Credit(5000); 
        ManagerBankProducts manager =  new ManagerBankProducts(credit);
        manager.discountBalance(2000);
        manager.payBalance(2000);

        CreditCard card= new CreditCard(2000);
        ManagerBankProducts manager2 = new ManagerBankProducts(card);
        manager2.discountBalance(1000);
        manager2.payBalance(500);
    }
}
