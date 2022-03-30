class CountOneZero
{
public static void main(String args[])
{
	String str = "10101111100010101000000101";
	int zero = 0;
	int one = 0;
	
	for(int i=0;i<str.length()-1;i++)
		{
		if(str.charAt(i)=='0'){
			zero++;
		}
		if(str.charAt(i)=='1'){
			one++;
		}
	}
	System.out.println("Count of zeros in program = "+zero);
	System.out.println("Count of ones in program = "+one);

}
}





