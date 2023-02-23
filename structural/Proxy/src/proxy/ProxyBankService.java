package proxy;

import domains.Client;
import services.IServiceBank;
import services.ServiceBank;

/**@author Yeison Fernando Rodriguez Sanchez */
/*Class that act with intermediary in this is validated that login user has been activated*/

public class ProxyBankService implements IServiceBank {

    private boolean isAuthenticated;
    private ServiceBank service;
    
    /*contructor that assign if the client is validated */
    public ProxyBankService(Client client){
        if(client==null){
            isAuthenticated=false;    
        }else{
            isAuthenticated=client.getIsLogin();
        }
    }
    /* validate some aspects before assign the original function to service */
    @Override
    public void withdrawMoney(double amount) {
        if(service==null){
            service=new ServiceBank();
        }
        if(validateIdentity()){
            service.withdrawMoney(amount);
        }else{
            System.out.println("Debe realizar iniciar sesion para realizar esta operacion");
        }
    }
/* validate some aspects before assign the original function to service */
    @Override
    public double consultBalance() {
        if(service==null){
            service=new ServiceBank();
        }
        if(validateIdentity()){
            return service.consultBalance();
        }else{
            System.out.println("Debe realizar iniciar sesion para realizar esta operacion");
            return -1;
        }
    }
/* validate that Client have initiated session namely is authenticated*/
    private boolean validateIdentity(){        
        if(isAuthenticated){
            return true;
        }
        return false;
    }
    
}
