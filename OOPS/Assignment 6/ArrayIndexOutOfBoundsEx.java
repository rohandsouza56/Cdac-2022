import java.util.Scanner;

class ArrayIndexOutOfBoundsEx{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the elements in the array: ");
		for(int i =0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the index element you want to access: ");
		try{
			int m = sc.nextInt();
			System.out.println("The array element at index "+m+" = "+arr[m]);
			System.out.print("Array element successfully accessed");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.print(e.getClass().getCanonicalName());
		}
	}
}