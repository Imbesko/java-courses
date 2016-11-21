import java.util.Scanner;

public class InteractRunner{
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    try{
      Calculator calc = new Calculator();
      String exit = "NO";
      while(!exit.equals("yes")){
        System.out.print("Enter the first arg: ");
        String first = reader.next();
        System.out.print("Enter the second arg: ");
        String second = reader.next();
        calc.add(Integer.valueOf(first), Integer.valueOf(second));
        System.out.println("Result = " + calc.getResult());
        calc.cleanResult();
        System.out.print("Exit: y/n ?\n\t");
        exit = reader.next();
      }
    } finally {
      reader.close();
    }
  }

}
