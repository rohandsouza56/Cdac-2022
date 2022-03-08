import java.util.Scanner;

class Circle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter raidus ");
		double r = sc.nextDouble();
		final double pi = 3.1415;
		System.out.println("Perimeter is "+(2*pi*r));
		System.out.println("Area is "+(pi*r*r));
	}
}