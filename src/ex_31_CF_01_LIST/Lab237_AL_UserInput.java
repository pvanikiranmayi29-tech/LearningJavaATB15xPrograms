package ex_31_CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lab237_AL_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput = "Y";
        List<String> names = new ArrayList<>();

        while (continueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name:");

            String name =scanner.next();
            names.add(name);
            scanner.nextLine();
            System.out.println("Do you want to another one? Y/N");
            continueInput = scanner.nextLine();
        }

        Iterator iterator = names.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        scanner.close();
    }
}
