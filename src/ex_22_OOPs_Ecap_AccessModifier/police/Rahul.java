package ex_22_OOPs_Ecap_AccessModifier.police;

public class Rahul extends Cop {

    public Rahul(int bullet) {
        super(bullet);
    }

    public static void main(String[] args) {
        Cop r = new Cop(100);
        r.thisDefaultF1();
        r.CanIShoot(); 
    }
}
