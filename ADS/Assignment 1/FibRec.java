
class FibRec{
	public static void main(String args[]){
		int n = 3;
		System.out.println(fib(n));
	}
	
	
	static int fib(int n){
		if (n <= 1)
		   return n;
		return fib(n-1) + fib(n-2);
    }
      
}
