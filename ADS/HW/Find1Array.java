
class Find1Array {
	public static void main(String args[]){ 
		int arr[][] = {{0, 0, 1, 1},
						{1, 1, 1, 1},
 					{0, 0, 0, 0}};
					
		int sum = 0;
		int max = 0;
		int count = 1;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum = sum+arr[i][j];
			}
			if(sum>=max){
				max = sum;
				count =  i + 1;
			}
			sum = 0;
		}
		
		System.out.println("Max 1's in row number: "+count);
    }
}

