
class FactRec{
	public static void main(String args[]){
		int n = 5;
		System.out.println(series(n));
	}
	
	static int series(int n){
		if(n==1) {
			return 1;
		}
		else {
			return n*series(n-1);
		}
	}
}