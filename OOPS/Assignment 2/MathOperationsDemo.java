
class MathOperations{
	
	int num1;
	int num2;
	static int result;
	
	MathOperations(int a, int b){
		this.num1 = a;
		this.num2 = b;
	}
	
	
	
	void add(){
		result = num1 + num2;
		System.out.println("Add Result : "+result);
		this.sub();
	}
	
	void sub(){
		result = num1 - num2;
		System.out.println("Sub Result : "+result);
		this.mul();
	}
	
	void mul(){
		result = num1 * num2;
		System.out.println("Multiplication Result : "+result);
		this.div();
	}
	
	void div(){
		result = num1 / num2;
		System.out.println("Div Result : "+result);
	}
	
}

class MathOperationsDemo{

	public static void main(String[] args){
		
		MathOperations mo1 = new MathOperations  (10,20);
		mo1.add();	
		
	}
}