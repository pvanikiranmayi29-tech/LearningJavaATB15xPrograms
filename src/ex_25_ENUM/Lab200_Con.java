package ex_25_ENUM;

public class Lab200_Con {

    public static void main(String[] args) {

        System.out.println(Env.QA.getBaseURL());
        //here i can write the QA code

        if(Env.QA.getBaseURL().equalsIgnoreCase("https://qa.myapp.com"))
        {
            System.out.println("Start testing on QA!!");
        }
    }
}
