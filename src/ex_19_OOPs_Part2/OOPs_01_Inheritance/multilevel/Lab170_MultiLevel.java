package ex_19_OOPs_Part2.OOPs_01_Inheritance.multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son pramod = new Son();

        pramod.home(); //son can use grandfather home
        pramod.BHK3(); //son can use his own home
        pramod.extraMoney(); //son can use father extra money
        pramod.test(); //son can use grand father test alsp

        //Dynamic Dispatch
        GrandFather g1 = new Son();
        //when son is born - grandfather is present
        //so the relationship is there - so this syntax is valid

        Father f1 = new Son();

        //Son s1 = new GrandFather(); //this is not possible

        g1.home(); //even if the object is created with son ref - still son method cannot be used by gf or father
        f1.extraMoney();
    }
}
