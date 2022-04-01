
class Calculator{
	static double result;
	
	static double powerInt(int num1, int num2){
		result = Math.pow(num1,num2);
		return result;
	}
	
	static double powerDouble(double num1, int num2){
		result = Math.pow(num1,num2);
		return result;
	}
}

class CalculatorDemo{
	public static void main(String args[]){
		Calculator.powerInt(2,3);
		System.out.println(Calculator.result);
		Calculator.powerDouble(4.3,3);
		System.out.println(Calculator.result);
	}
}