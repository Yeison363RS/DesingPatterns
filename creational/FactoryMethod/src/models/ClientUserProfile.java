package models;

/**@author Yeison Fernando Rodriguez Sanchez */

/*Class that change the type product  of the family products from interface UserInterface*/
public class ClientUserProfile extends CreatorUser{

    @Override
    public UserInteface createUser() {
        return new UserClient();
    }
    
}
