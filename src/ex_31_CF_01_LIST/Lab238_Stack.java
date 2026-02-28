package ex_31_CF_01_LIST;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        //Stack is also a legacy class like Vector
        //and is a synchronized class
        //so this is generally not used in automation
        //Stack is like a stack of books FILO - First In Last Out

        s.add("Vani");
        s.add("Shravan");
        s.add("Anirudh");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek()); //peek will look at the first element without removing the element o/p will be Anirudh
        System.out.println(s);
        System.out.println(s.pop()); //pop will print and remove the first seen element
        System.out.println(s);

        System.out.println(s.add("Snehal"));
        System.out.println(s);
        s.add("Chetan");
        s.add(2,"Chetan"); //duplicates are allowed in stack
        s.push("Vijay"); //push adds element to the top
        //in case of stack add and push are similar
        //but we can add element with position
        System.out.println(s);
    }
}
