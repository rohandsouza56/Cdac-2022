import java.util.Scanner;

class NumberFormatEx{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter an integer: ");
			String str = sc.nextLine();
			int n = Integer.parseInt(str);
			System.out.println("The square value is "+n*n);
		}catch(NumberFormatException e){
			System.out.println("Entered value is not an integer");
		}
	}
}