package models;

import java.util.ArrayList;

import Permissions.Privilege;

/**@author Yeison Fernando Rodriguez Sanchez */
/*Class that represent a concrete product of the family UserInterface */

public class UserClient implements UserInteface{


    ArrayList<Privilege> privileges;

    public UserClient(){
        privileges = new ArrayList<>();
        privileges.add(new Privilege(3, "Read"));
    }
    /*
     * method that change the behavior with regard to the type Product of class
     */
    @Override
    public void makeTranfer(String typeTransfer) {
        for (Privilege privilege : privileges) {
            if(privilege.getNamePrivilege().equalsIgnoreCase(typeTransfer)){
                System.out.println("Este tipo de Usuario Cuenta con este permiso");
                return;
            }
        }
        System.out.println("Este tipo de Usuario NO Cuenta con este permiso");
    }

}