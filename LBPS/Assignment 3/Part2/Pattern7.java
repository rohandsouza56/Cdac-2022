
class Pattern7{
	public static void main(String args[]){
		
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			
			for(int k=i*2;k<=10;k++){
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		for(int i=4;i>=1;i--){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int k=i*2;k>1;k--){
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
}
