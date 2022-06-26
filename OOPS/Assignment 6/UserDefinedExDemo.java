import java.util.Scanner;

class UserDefinedEx extends RuntimeException{
	UserDefinedEx(String errorMessage){
		super(errorMessage);
	}
}

class UserDefinedExDemo{
	public static void main(String args[]){
		
		try{
			if(Integer.parseInt(args[1])>=18 && Integer.parseInt(args[1])<60){
				System.out.println("Entered age is accepted");
			}
			else{
				throw new UserDefinedEx("Please enter age between 18 and 60");
			}
		}catch(UserDefinedEx e){
			System.out.print(e.getMessage());
		}
	}
}