package ex_25_ENUM;

public class Lab201_Enum_Real_Web_Automation {
    public static void main(String[] args) {

        System.out.println(Locators.page_input_email.getLocator());
    }
}

//we can have this enum in separate file also
//so when any locator value changes - we need to modify the enum file & we are good to go
//so any constant values we can store in enum files and retrieve them in the classes
//so that there are no hard-coded values inside the code
//all these are maintained in an enum file
enum Locators{
    page_input_email("//*[@id=\"login-username\"]"),
    page_input_password("//*[@id=\"login-password\"]"),
    page_button("#btn");

    private final String locator;
    Locators(String locator)
    {
        this.locator = locator;
    }
    String getLocator()
    {
        return this.locator;
    }
}