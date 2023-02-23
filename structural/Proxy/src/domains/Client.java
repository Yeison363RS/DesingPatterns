package domains;

/**@author Yeison Fernando Rodriguez Sanchez */
/*this class represent the basic data for client that going to use the operations defined on Service*/
public class Client {
    private boolean isLogin;
    private String nameUser;

    public Client(boolean isLogin ,String nameUser){
        this.isLogin=isLogin;
        this.nameUser=nameUser;
    }
    public  boolean getIsLogin(){
        return isLogin;
    }

    public String getNameUser() {
        return nameUser;
    }
}
