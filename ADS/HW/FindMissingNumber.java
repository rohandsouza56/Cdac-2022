
class FindMissingNumber{
	public static void main(String args[]){ 
		int arr[] = {1, 2, 4, 6, 3, 7, 8};

		int n = arr.length + 1;
		int sum = n*(n+1)/2;
		int sumArr = 0;
		
		for(int i = 0;i<arr.length;i++){
			sumArr = sumArr +arr[i];
		}
		System.out.println("Missing number: "+(sum-sumArr));
    }
}

