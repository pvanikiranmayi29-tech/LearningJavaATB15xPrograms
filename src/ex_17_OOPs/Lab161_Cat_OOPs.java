package ex_17_OOPs;

public class Lab161_Cat_OOPs {
    public static void main(String[] args) {

        Cat c1 = new Cat(); //this will only call the DC

        Cat c2 = new Cat("Lucy"); //this will call the constructor with args
        Cat c3 = new Cat("mufasa");
        Cat c4 = new Cat("spicy");

        System.out.println(c2.name);
        System.out.println(c3.name);


    }
}

class Cat
{
    String name;

    //in DC we cannot pass any arguments
    Cat()
    {
        System.out.println("DC");
    }

    //this is constructor with arguments
    Cat(String nameGiven)
    {
        //the nameGiven in bracket to the name which is created above
        this.name=nameGiven;
        //name = "Kitty"; // if this.name is not given
        //and give name = " " then for all diff objects created
        //we will get the same name as Kitty
    }
    void running()
    {
        int local_var = 10;
        System.out.println("Who is ruuning -> "+this.name);
    }
}

//two friends are having boys with same name as "Lucky"
//that is why we give this.name
//this means - my kid
//and same for my friend - his kid