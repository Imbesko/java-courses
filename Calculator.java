public class Calculator {

  private double result; // result variable
  //
  public void add(double ... params){
    for (Double param : params){
      this.result += param;
    }
  }
  
  public void divide(double first, double second){
    this.result = first - second;
  }

  public void division(double first, double second){
    this.result = first / second;
  }

  public void multy(double first, double second){
    this.result = first * second;
  }

  public double getResult(){
    return this.result;
  }

  public void cleanResult(){
    this.result = 0;
  }

}
