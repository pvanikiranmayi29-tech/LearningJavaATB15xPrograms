package ex_19_OOPs_Part2.OOPs_01_Inheritance.singleinheritance;

public class Lab168_SI {
    public static void main(String[] args) {
        Son Pramod = new Son();

        System.out.println(Pramod.gold_f); //father gold can be used by son object as it is inherited

        Pramod.BHK2(); //father 2BHK can be used by Son
        Pramod.BHK3(); //Son own 3BHK can also be used by Son

        Father F1 = new Father();
        System.out.println(F1.gold_f);

        F1.BHK2();
       // F1.BHK3(); //this is not possible as father does not extend - only son will extend father

    }
}
