
class HollowInvertedHalfPyramid{
	public static void main(String args[]){
		
		for(int i=1;i<=6;i++){
			for(int j=6;j>=i;j--){
				if((i==2||i==3||i==4) && (j!=6 && j!=i)){
					
					System.out.print(" ");
				}
				else{
				System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}
