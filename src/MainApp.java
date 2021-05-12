import java.util.Scanner;

public class MainApp {

	 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("===Calculator===");
		System.out.println("Enter first operand: ");
		Double operand1 = in.nextDouble();
		System.out.println("Enter second operand: ");
		Double operand2 = in.nextDouble();
		System.out.println("Enter operator(+,-,/,*,%): ");
		in.nextLine();
		String operator = in.nextLine();
		
		Calc calc = new Calc(operand1,operand2,operator);
		System.out.println("Result: "+calc.getResult());
	}

}
