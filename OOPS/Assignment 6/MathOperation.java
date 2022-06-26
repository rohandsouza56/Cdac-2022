import java.util.Scanner;

class MathOperation{
	public static void main(String args[]){
		int arr[] = new int[args.length];
		int sum = 0;
		
		try{
			for(int i=0; i<args.length;i++){
				arr[i] = Integer.parseInt(args[i]);
				sum += arr[i];
			}
			double avg = (double)sum/arr.length;
			System.out.println("Average value = "+avg);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}
}