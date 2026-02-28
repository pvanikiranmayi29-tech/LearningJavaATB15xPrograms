package ex_22_OOPs_Ecap_AccessModifier.criminal;

import ex_22_OOPs_Ecap_AccessModifier.police.Cop;
//we need to import the class which is there in another folder to use it

public class Thief {
    public static void main(String[] args) {
        Cop theif = new Cop(100);
        //theif.CanIShoot();
        //System.out.println(theif.gun);
    }
}
