package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'B';
        //char is single char so we give in '' and String is a bunch of char so we give ""
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6= '1';
        char c7='(';
        char c8 = ' '; //blank space is also a char

        //escape sequences
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("VaniKiranmayi");
        System.out.println("Vani"+tab_line+"Kiranmayi");
        System.out.println("Vani"+new_line+"Kiranmayi");
    }
}
