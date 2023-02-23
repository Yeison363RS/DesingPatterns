import domains.Client;
import proxy.ProxyBankService;

/**@author Yeison Fernando Rodriguez Sanchez */
/*Principal class where it use the Proxy class, this class act as client code */
public class App {
    /**method that create the Client and  Proxy that act intermediary between the code client and business logic Service*/
    public static void main(String[] args) throws Exception {
        Client client= new Client(true, "Pedrito");
        ProxyBankService proxy = new ProxyBankService(client); 
        System.out.println(proxy.consultBalance());
        proxy.withdrawMoney(200000);
        proxy.withdrawMoney(2500);
        proxy.withdrawMoney(7000);
        System.out.println(proxy.consultBalance());
    }
}
