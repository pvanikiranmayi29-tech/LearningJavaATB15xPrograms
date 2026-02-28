package ex_22_OOPs_Ecap_AccessModifier.police;

public class Cop {

    private int gun;
    private String iCard;

    public Cop(int bullet){
        this.gun = bullet;
    }
    //private will make it not allowed outside the class
    //if we have jrCop
    //so we will make it protected
    //this will be allowed within the folder
    protected void CanIShoot(){
        System.out.println("Yes you can Shoot!!");
    }
    //when public, private and protected is not mentioned
    //it is default
    //default is similar to protected
    void thisDefaultF1(){
        System.out.println("Hi, Cop!!");
    }
}
