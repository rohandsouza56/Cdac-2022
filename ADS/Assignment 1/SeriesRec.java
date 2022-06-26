/*
class SeriesRec{
	public static void main(String args[]){
		int n = 10;
		series(n);
	}
	
	static int series(int n){
		if(n==10){
			int a = n-n;
		}
		if(a==n) {
			System.out.print("10");
			return 1;
		}
		else {
			System.out.print(n+" ");
			return series(n+1);
		}
	}
}
*/

class SeriesRec{
	public static void main(String args[]){
		int n = 10;
		int l=1;
		series(n,l);
	}
	
	static int series(int n, int l){
		if(l==n) {
			System.out.print(n);
			return 1;
		}
		else {
			System.out.print(l+" ");
			return series(n,l+1);
		}
	}
}

