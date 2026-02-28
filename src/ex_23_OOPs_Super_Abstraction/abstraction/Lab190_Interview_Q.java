package ex_23_OOPs_Super_Abstraction.abstraction;

public class Lab190_Interview_Q {
}


interface I11{}
interface I12{}
class A1{}
class B1{}

//class Test2 extends A1,B1{} //this is not possible -cannot inherit two classes
class Test3 implements I11{}
class Test4 implements I11,I12{}
class Test5 extends A1 implements I11,I12{}
//class Test6 implements I11 extends A1{} //extend should be first and then implement

//interface I3 extends A1{} //not possible