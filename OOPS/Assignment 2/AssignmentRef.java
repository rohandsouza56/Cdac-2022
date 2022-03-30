
class A{
	int x;
	int y;
	
	static int p;
}

class AssignmentRef{
	public static void main(String[] args){
		
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		
		a1 = a2 ;
		a2 = a3;
		a3 = a1;
		
		a2.x = 100;
		a3.y = 200;
		a1.y = 300;
		a2.y = 400;
		
		
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(a2.x);
		System.out.println(a2.y);
		System.out.println(a3.x);
		System.out.println(a3.y);
		
	}
}