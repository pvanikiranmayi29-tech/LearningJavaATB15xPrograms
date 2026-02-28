package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab188_Real_MOverloading {
    public static void main(String[] args) {
        WebAutomation t1 = new WebAutomation();

        t1.OpenBrowser();
        t1.OpenBrowser("Chrome");
    }

}

class WebAutomation
{
    void OpenBrowser()
    {
        System.out.println("Starting Default Browser!!");
    }
    void OpenBrowser(String browser)
    {
        System.out.println("String Browser!! " +browser);
    }
}