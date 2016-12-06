import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // keyboard input
		try {
			Calculator calc = new Calculator();
			String exit = "no"; // variable output from the program
			while (!exit.equals("yes")) {
				// input the data Calculate
				System.out.print("Enter the first arg: ");
				String first = reader.next();
				System.out.print("Enter the arithmetic operation: ");
				char operation = reader.next().charAt(0);

				// variable of repeat calculation with previous result
				boolean flag = false;
				while (!flag) {
					System.out.print("Enter the second arg: ");
					String second = reader.next();

          //Checking divide by zero
					if (operation == '/' && second.equals("0")) {
						System.out.println("Cannot divide by zero.");
						break;
					}

					// actions with input numbers
					switch (operation) {
					case '+':
						calc.add(Double.valueOf(first), Double.valueOf(second));
						break;
					case '-':
						calc.divide(Double.valueOf(first), Double.valueOf(second));
						break;
					case '*':
						calc.multy(Double.valueOf(first), Double.valueOf(second));
						break;
					case '/':
						calc.division(Double.valueOf(first), Double.valueOf(second));
						break;
					default:
						System.out.println("The wrong operation.");
						break;
					}
					System.out.println("Result = " + calc.getResult()); // print result
					System.out.print("Enter 'Q' to exit\nElse enter 'C' to clear the result\nElse enter the arithmetic operation: ");
					// variable next actions
					char choose = reader.next().charAt(0);
					if (choose == 'C' || choose == 'c') {
						calc.cleanResult();
						flag = true;
					} else if (choose == 'Q' || choose == 'q') {
						exit = "yes";
						flag = true;
					} else {
						first = String.valueOf(calc.getResult());
						operation = choose;
					}
				}
			}
		} finally {
			reader.close();
		}
	}

}
