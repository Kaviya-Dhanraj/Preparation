import java.util.Scanner;
public class Program1 {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    // THIS PROGRAM IS FOR PASS FINDING
    int marks = scan.nextInt();

    if (marks>=35){
      System.out.println("You are Pass");
    }
    else{
      System.out.println("You are Fail");
    }

    // THIS IS FOR SCHOLARSHIP ELIGIBILITY
    int salary = scan.nextInt();

    if(salary>7000){
      System.out.println("You are Eligible for the Scholarship");
    }
    else{
      System.out.println("You are Not Eligible for the Scholarship");
    }
    

    //THIS IS FOR DIVISIBILITY OF 3 AND 5
    int number = scan.nextInt();

    if(number%3==0 && number %5 ==0){
      System.out.println("Number is divisible by 3 and 5");
    }
    else{
      System.out.println("Number is not divisible by 3 and 5");
    }

    scan.close();
  }
  
}
