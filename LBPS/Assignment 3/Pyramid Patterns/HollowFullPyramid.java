
class HollowFullPyramid{
	public static void main(String args[]){
		
		for(int i=6;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			
			for(int k=i;k<=6;k++){
				if((i==4||i==3||i==2) && (k!=6 && k!=i))
					System.out.print("  ");
				else
					System.out.print("* ");
				
			}
			
			System.out.println();
		}
	}
}
