package ex_31_CF_01_LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab239_LabConvertArrayToList {
    public static void main(String[] args) {
        String arr[] = {"Java","Python","C#",".net"};
        List<String> list = Arrays.asList(arr);
        //Arrays is a class
        //which contains multiple method
        //as list is a function which is used to convet a array into list
        System.out.println(list);
    }
}
