class Static2{
	static char ch;
	static byte y;
	static short sh;
	static int x =30;
	static long lo;
	static float fl;
	static double doub; 
	
}

class StaticTest1{
	static int a=10;
	static float b;
	
	static void display(){
		System.out.println("Inside static Method");
	}
	public static void main(String args[]){
		StaticTest t1 = new StaticTest();
		
		
		System.out.println(a);
		System.out.println(b);
		//System.out.println(Static1.ch);
		System.out.println("---Byte---");
		System.out.println(Static2.y);
		System.out.println("---Short---");
		System.out.println(Static2.sh);
		System.out.println("---Integer---");
		System.out.println(Static2.x);
		System.out.println("---Long---");
		System.out.println(Static2.lo);
		System.out.println("---Float---");
		System.out.println(Static2.fl);
		System.out.println("---Double---");
		System.out.println(Static2.doub);
		display();
	}
}