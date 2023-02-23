package services;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
/**@author Yeison Fernando Rodriguez Sanchez */
/*This class is core of the business logic define the operations that a client can use*/
public class ServiceBank implements IServiceBank{
    /*here define the total capacity monetary have a client also the history of withdraws */
    private double balance = 100000;
    private Map<LocalDateTime,Double> withdraws = new HashMap<>(); 

    /* perform the withdrawal money of balance for this add a new withdrawal to the history*/
    @Override
    public void withdrawMoney(double amount) {
        if(amount<=consultBalance()){
            try {
                Thread.currentThread().sleep(500);
                withdraws.put(LocalDateTime.now(), amount);
                System.out.println("se realizo el retiro de forma exitosa");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("El monto del retiro exede el saldo disponible");
        }
     
    }
    /* calculate the avaliable balance using the history withdrawals  */
    @Override
    public double consultBalance() {
        return balance-getTotalWithdraws();
        
    }
    /*calculate total value of withdrawals performed for a client*/
    private  double getTotalWithdraws(){
        return withdraws.values().stream().mapToDouble(Double::doubleValue).sum();
    }
    
}
