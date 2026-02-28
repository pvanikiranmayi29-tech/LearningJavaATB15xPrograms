package ex_17_OOPs;

public class LoginPage {
    String email;
    String password;
    String submitButton;

    LoginPage(){
        System.out.println("DC");
    }


    public LoginPage(String email, String password) {
        this.email = email;
        this.password = password;
    }

    //we already have email and password in the above constructor
    //so why do we need to give and call again
    //so to re-use
    public LoginPage(String email, String password, String submitButton) {
        /*this.email = email;
        this.password = password;*/
        //this action will default call the above constructor in this constructor
        //this is called constructor chaining
        this(email, password);
        this.submitButton = submitButton;
    }
}
