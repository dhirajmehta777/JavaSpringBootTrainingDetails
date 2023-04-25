import java.io.IOException;

public class Menu {
	
public int show() throws IOException{
		
		System.out.println("1.Add");
		System.out.println("2.Multiply");
		System.out.println("3.Divide");
		System.out.println("4.Substract");
		System.out.println("Please Enter Your Choice");
		int choice_num=BasicInputs.readInteger();
		return choice_num;
		
		
		
	}

}
