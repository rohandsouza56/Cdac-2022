import java.util.Scanner;

class Swap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		double n1 = sc.nextDouble();
		System.out.println("Enter second number  ");
		double n2 = sc.nextDouble();
		System.out.println("Entered numbers are "+n1+" and "+n2);
		double temp = n1;
		n1=n2;
		n2=temp;
		System.out.println("Swapped numbers are "+n1+" and "+n2);
	}
}