package ex_06_Terenary_Operator;

public class Lab068_Real_Age_Classification {
    //A user input will be given for age
    //you need to check if user is minor, adult or senior citizen
    //User input can be taken in multiple ways
    //CLI(Command Line Args), Scanner class, Buffer Reader class, File as input

    public static void main(String[] args) {
        //lets see for user give input via the command line
        //go to more actions on top - edit configurations
        //make sure the class selected is the one that we want to run
        //CLI arguments - we can give here - we can give multiple inputs like a array

        String age_input_string = args[0];
        //here we are giving int but the args are always passed as String - so we need to take as int
        //we cannot directly convert int to string using typecasting
        //so we need to use a function integer.parseint
        System.out.println(age_input_string instanceof String);
        int age_user_input = Integer.parseInt(age_input_string);

        String result = (age_user_input < 18) ? "Minor" : ((age_user_input <=60) ? "Adult" : "Senior Citizen");
        System.out.println(result);
    }
}
