package pack1;

import java.util.Scanner;

public class output{
public static void main(String[] args) {
	// TODO Auto-generated method stub
Calculator obj=new Calculator();
Scanner input;
int a,b,c;
boolean startover=true;
while(startover) {
System.out.println("Enter your 3 numbers");
input=new Scanner(System.in);
a=input.nextInt();
b=input.nextInt();
c=input.nextInt();
System.out.println("Enter your operation min, sum, average or max");
String word=input.next();
if(word.equalsIgnoreCase("sum")) {
System.out.println(obj.sum(a, b, c));
}
if(word.equalsIgnoreCase("average")) {
System.out.println(obj.average(a, b, c));
}
if(word.equalsIgnoreCase("min")) {
System.out.println(obj.min(a, b, c));
}
if(word.equalsIgnoreCase("max")) {
System.out.println(obj.max(a, b, c));
}
}


}
}