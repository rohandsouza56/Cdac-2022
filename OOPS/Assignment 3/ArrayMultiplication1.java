
class ArrayMultiplication1{

	public static void main(String args[]){
		int arrA[][] = {
							{1,5,6},
							{4,2,1},
							{5,3,8}
						};
		int arrB[][] = {
							{3,7,1},
							{1,2,2},
							{4,5,0}
						};
		if(arrA[0].length == arrB[0].length){
			int arrC[][] = new int[3][3];
			int sum=0;
			
			
			
			
			
			for(int i=0;i<arrA.length;i++){
				for(int j=0;j<arrA[i].length;j++){
					for(int k=0;k<3;k++){
						sum += arrA[i][k] * arrB[k][j];

					}
					
				arrC[i][j] = sum;
				sum=0;
			  }
			}                                                               
			
			for(int i=0;i<arrC.length;i++){
				for(int j=0;j<arrC[i].length;j++){
				System.out.print(arrC[i][j]+" ");
			}
			System.out.println();
			}
		}
		else System.out.println("Enter valid Dimensions of Matrices");
		
	}
}