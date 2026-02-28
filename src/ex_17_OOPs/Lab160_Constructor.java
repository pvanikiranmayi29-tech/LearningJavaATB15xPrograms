package ex_17_OOPs;

public class Lab160_Constructor {
    public static void main(String[] args) {
        //Animal dog; //constructor is not called
        //constructor will be called only when we create the object

        Animal dog = new Animal();

        MySQL a = new MySQL();
        ReadExcelFile e = new ReadExcelFile();
    }
}

//we can create class here also
//we can create unlimited number of class
//but we can create only one public class in one program
/*
class Animal{

}*/
//generally we create class in separate file
//to make code reusable and maintained
class MySQL{
    MySQL()
    {
        System.out.println("MySQL connected!");
    }
}

class ReadExcelFile
{
    ReadExcelFile()
    {
        System.out.println("ExcelFile is Loaded!!");
    }
}
