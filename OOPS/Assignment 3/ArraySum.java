import java.util.*;
class ArraySum
{


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
	
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
		
				System.out.print("Array elements 1:");
				a[i][j]=sc.nextInt(); 
				}
				System.out.println();
		}
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
		
				System.out.print("Array elements 2:");
				b[i][j]=sc.nextInt(); 
				}
				System.out.println();
		}
	
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				c[i][j] = a[i][j] + b[i][j];
			
				}
				
		}
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c.length;j++){
		
				System.out.print(c[i][j]+" ");
				
				}
				System.out.println();
		}
		
		
	}
}