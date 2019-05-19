package pack1;

class X {
	protected int i = 1221;

	void methodOfX() {
		System.out.println(i);
	}

}
//Do you think the below program is written correctly? If yes, what will be the output?package pack1;class X{   protected int i = 1221;   void methodOfX()   {       System.out.println(i);   }}public class MainClass{   public static void main(String[] args)   {       X x = new X();       System.out.println(x.i);       x.methodOfX();   }}Answer :Yes, it is written correctly. Output will be12211221================) Why we can’t instantiate Class-A in the below code outside the package even though it has public constructor?package pack1;class A{   public A()   {       //public constructor   }}package pack2;import pack1.*;class B{   A a = new A();       //Compile Time Error}Answer :Because, Class-A itself has been defined with default access modifier. That means Class-A can be instantiated within the package in which it is defined. It can not be instantiated outside the package, even though it has public constructor.======================================Can a protected field of a class be inherited to subclass outside the package?Answer :Yes, protected members of a class are inherited to sub classes outside the package.======================Why Line 17 in the below code is throwing compile time error?package pack1;public class A{   protected A()   {       //protected constructor   }}package pack2;import pack1.A;class B{   A a = new A();}Because, we can’t instantiate a class outside the package which has only protected constructors.==============Write the access modifiers in the increasing order of their visibility?private —> default or no access modifiers —> protected —> publicWrite an application that asks a user for a first and last names and age and tells the the user his/her category based on the following chartMessage Input
