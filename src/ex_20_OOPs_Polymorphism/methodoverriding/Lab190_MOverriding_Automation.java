package ex_20_OOPs_Polymorphism.methodoverriding;

public class Lab190_MOverriding_Automation {
    public static void main(String[] args) {
        Chrome c1 = new Chrome();
        c1.OpenBrowser();

        Firefox f1 = new Firefox();
        f1.OpenBrowser();

        CommonToAll a1 = new CommonToAll();
        a1.OpenBrowser();

        //Dynamic Dispatch
        CommonToAll c2 = new Chrome();
        c2.OpenBrowser();

        CommonToAll c3 = new Firefox();
        c3.OpenBrowser();

    }
}

class CommonToAll
{
    void OpenBrowser()
    {
        System.out.println("Starting the IE Browser!!");
    }
}

class Chrome extends CommonToAll
{
    @Override
    void OpenBrowser()
    {
        System.out.println("Starting the Chrome Browser!!");
    }
}

class Firefox extends CommonToAll
{
    @Override
    void OpenBrowser()
    {
        System.out.println("Starting the Firefox Browser!!");
    }
}