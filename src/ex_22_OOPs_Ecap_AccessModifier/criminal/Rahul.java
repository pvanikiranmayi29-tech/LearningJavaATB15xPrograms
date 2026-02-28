package ex_22_OOPs_Ecap_AccessModifier.criminal;

import ex_22_OOPs_Ecap_AccessModifier.police.Cop;

public class Rahul extends Cop {

    public Rahul(int bullet) {
        super(bullet);
    }

    public static void main(String[] args) {
        Cop r = new Cop(100);
        //r.thisDefaultF1();
        //r.CanIShoot(); //this cannot be used as it is protected
    }
}
