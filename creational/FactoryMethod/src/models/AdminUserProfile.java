package models;


/**@author Yeison Fernando Rodriguez Sanchez */

/**Class that change the type product  of the family products from interface UserInterface */
public class AdminUserProfile extends CreatorUser{
    

    @Override
    public UserInteface createUser() {
        return new UserAdmin();
    }

}