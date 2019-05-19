import java.util.Scanner;
public class SwitchStatement {


	public static void main(String[] args) {
		int age;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		 age=scan.nextInt();
		 
		 for(int age1=3; age1<=15; age1++) {
				System.out.println("blah blah blah");
				
			}
		
		switch (age) {
		
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can think  big ");
			break;
		case 3:
			System.out.println("You can start practice how to coding in java ");
			break;
		
		default:
			System.out.println("I dont know how old you are");
			break;
		}
		
	}

}
