package ex_21_Encapsulation;

public class Lab189_Encap_Demo {
    public static void main(String[] args) {
        /*VWOLogin vmoLogin = new VWOLogin("admin","pass123");
        System.out.println(vmoLogin.username);
        vmoLogin.password = "pass345";
        System.out.println(vmoLogin.password);
        //here we are able to change the password and
        //also we are able to print both username and password which should not be allowed in real world*/

        GoodVWOLogin vmoLogin1 = new GoodVWOLogin("admin","pass123");
        //System.out.println(vmoLogin1.password); //this is not possible
        System.out.println(vmoLogin1.getPassword());
        vmoLogin1.setPassword("admin456",false);
        System.out.println(vmoLogin1.getPassword());

        GoodVWOLogin admin = new GoodVWOLogin("admin","pass123");

        admin.setPassword("pass456",true);
        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());
    }
}

/*
class VWOLogin //this is not a encapsulted class and is incorrect in real world
{
    //these are instance variables
    public String username;
    public String password;

    public VWOLogin(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
}*/

class GoodVWOLogin
{
    //for example if the username and password are our kids
    //they can not be directly used by strangers and hence they are private
    //but sometimes we need to allow them
    //so in that case we or our family members will stay with them to ensure they are safe
    //so using family member stranger can access them
    //this is possible with getter and setter
    //these methods can be automatically created - using
    //select both private values - right click - generate - getter and setter - again select both and OK
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    //we can remove this
    //as generally we should not allow someone to change the password
    //we can choose which get or set is allowed
    /*public void setPassword(String password) {
        this.password = password;
    }*/
    //or we can allow the set password if admin

    public void setPassword(String password, Boolean isAdmin)
    {
        if(isAdmin) {
            this.password = password;
        }
        else {
            System.out.println("Only admins are allowed to change the password");
        }
    }

    //private means - we can modify or print only within the class
    //we cannot print them from another class which has a object of this class
    private String username;
    private String password;

    GoodVWOLogin(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    //now these values are private and cannot be used by other class
    //but we need to access them from other class
    //then we can use getter and setter methods


}