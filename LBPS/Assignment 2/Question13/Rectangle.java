import java.util.Scanner;

class Rectangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Width ");
		double w = sc.nextDouble();
		System.out.println("Enter Height ");
		double h = sc.nextDouble();
		System.out.println("Area is "+w+" * "+h+" = "+(w*h));
		System.out.println("Perimeter is 2 *("+w+" + "+h+") = "+(2*(w+h)));

	}
}