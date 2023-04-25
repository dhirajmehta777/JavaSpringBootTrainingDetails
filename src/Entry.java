import java.io.IOException;

public class Entry {
	
	public static void main(String[] args) throws IOException {
		
		
		
		Maths m=new Maths();
		Menu me=new Menu();
		
		while(true)
		{	
			System.out.println("Please Enter the First Number:");
			int number1=BasicInputs.readInteger();
			
			System.out.println("Please Enter the Second Number:");
			int number2=BasicInputs.readInteger();
			int n=me.show();
			if(n==1)
			{
				m.add(number1,number2);
			}
			else if(n==2) 
			{
				m.multiply(number1,number2);
			}
			else if(n==3) 
			{
				m.divide(number1,number2);
			}
			else if(n==4)
			{
				m.substract(number1,number2);
			}
			else 
			{
				System.out.println("Invalid Choice Number!!!");
				break;
			}
			
		}
	}
}
