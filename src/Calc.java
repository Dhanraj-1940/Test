
public class Calc {

	private Double result;
		public Calc(Double num1, Double num2, String operator) {
			
			switch(operator) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "%":
				result = num1 % num2;
				break;
			default:
				if(result==null)
					System.out.println("Invalid operator");
			}
		}
		
		public Double getResult() {
			return result;
		}
}
