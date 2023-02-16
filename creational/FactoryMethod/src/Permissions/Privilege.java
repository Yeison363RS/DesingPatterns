package Permissions;

/**@author Yeison Fernando Rodriguez Sanchez */

/*Class that define type permissions which may be assigned to a user*/
public class Privilege{
    
    private int id_privilege;
    private String name_privilege;

    public Privilege(int id_privilege,String name_privilege){
        this.id_privilege=id_privilege;
        this.name_privilege=name_privilege;
    }

    public String getNamePrivilege(){
        return this.name_privilege;
    }
}