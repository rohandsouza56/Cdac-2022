import java.util.*;
class ArrayTranspose
{


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
		
				System.out.print("Array elements 1:");
				a[i][j]=sc.nextInt(); 
				}
				System.out.println();
		}
	
	
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				b[j][i] = a[i][j];
			
				}
				
		}
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
		
				System.out.print(b[i][j]+" ");
				
				}
				System.out.println();
		}
		
		
	}
}
