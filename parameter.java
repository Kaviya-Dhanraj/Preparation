import java.util.Scanner;
public class parameter {

  void sum(int num1 , int num2){
    int add = num1+num2;
    System.out.println("Addition: "+add);
  }
  void sub(int num1, int num2){
    int minus = num1 - num2;
    System.out.println("Subtraction: "+minus);
  }
  void mul(int num1, int num2){
    int multiple = num1*num2;
    System.out.println("Multiple: "+multiple);
  }
  void div(int num1 , int num2){
    int division = num1/num2;
    System.out.println("Division: "+division);
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a: ");
    int a = scan.nextInt();
    System.out.println("Enter b: ");
    int b = scan.nextInt();
    
    parameter obj1 = new parameter();
    obj1.sum(a,b);
    obj1.sub(a,b);
    obj1.mul(a,b);
    obj1.div(a,b);

    scan.close();

  }
}
