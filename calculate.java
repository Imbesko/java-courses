import java.util.Scanner;

public class calculate {

  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    double first = 0, second = 0, result = 0;
    char operation = 0;
    boolean flag = false;
    try {
      System.out.print("Enter the 1-st number: ");
      first = sc.nextDouble();
      System.out.print("Enter the arithmetic operation: ");
      operation = sc.next().charAt(0);
      System.out.print("Enter the 2-nd number: ");
      second = sc.nextDouble();
    } catch (Exception e){
      System.out.println("The wrong data.");
    }
    switch(operation){
      case '+':
        result = first + second;
        break;
      case '-':
        result = first - second;
        break;

        default:
        if (operation != 0){
        System.out.println("The wrong operation.");
        flag = true;
        }
        break;
    }
    if (!flag){
      System.out.println("Result = " + result);
    }
  }

}
