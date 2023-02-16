import java.util.ArrayList;

import models.AdminUserProfile;
import models.ClientUserProfile;
import models.UserInteface;

/**@author Yeison Fernando Rodriguez Sanchez */

/* Class that order the type of product the family UserInterface should be created*/
public class App {
    /*attributes of class for test of to use the design pattern */
    ArrayList<UserInteface> users = new ArrayList<>();
    AdminUserProfile adminUserProfile= new AdminUserProfile();
    ClientUserProfile clientUserProfile= new ClientUserProfile();

    /*Method that make the call to create the one type product with repect to type arg into*/
    public void addUser(String typeUser){
        UserInteface user;
        if(typeUser.equalsIgnoreCase("admin")){
            user=adminUserProfile.createUser();
            users.add(user);
        }else{
            user=clientUserProfile.createUser();
            users.add(user);
        }
        user.makeTranfer("update");
    }

    public static void main(String[] args) throws Exception {
        App app=new App();
        app.addUser("admin");
        app.addUser("client");               
    }
}
