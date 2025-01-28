import java.util.Scanner;
public class program2 {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    //THIS IS INDIVIDUAL MARKS
    int marks = scan.nextInt();
    if(marks<50){
      System.out.print("You need to improve");
    }
    else if(marks >= 50 && marks<=70){
      System.out.print("Good Job");
    }
    else {
      System.out.print("Excellent Job");
    }

    //THIS IS 5 SUBJECT MARKS OF THE STUDENT
    int mark1= scan.nextInt();
    int mark2= scan.nextInt();
    int mark3= scan.nextInt();
    int mark4= scan.nextInt();
    int mark5= scan.nextInt();
    scan.nextLine();

    int total = mark1+mark2+mark3+mark4+mark5;
    int average = total /5;
    
    System.out.println("Your Total mark for 5 subject is "+ total);
    System.out.println("Your Average mark for 5 subject is "+ average);
    if(average<35){
      System.out.println("Additional class is required");
    }
    else{
      System.out.println("You are good to go");
    }

    // THIS IS FOR TRAFFIC LIGHTS
    System.out.println("Please enter the color in small letters of alphabetics: ");
    String color =scan.nextLine();
    
    if(color.equals("red")){
      System.out.println("Stop");
    }
    else if(color.equals("yellow")){
      System.out.println("get ready");
    }
    else if(color.equals("green")){
      System.out.println("Go!!");
    }
    else{
      System.out.println("Please enter the valid color;");
    }


    //THIS PROGRAM IS FOR SALARY AND LOAN CREDITS RELATED CHALLENGE
    System.out.println("Enter the salary amount: ");
    int salary =scan.nextInt();
    System.out.println("Enter the age: ");
    int age=scan.nextInt();
    
    if (salary>=20000||age<=25){
      System.out.println("you are eligible for loan");
      System.out.println("Enter the loan amount: ");
      int loanAmount=scan.nextInt();
      if(loanAmount<=50000){
        System.out.println("loan amount will credit");
      }
      else{
        System.out.println("maximum loan amount is 50000");
      }
    }
    else{
      System.out.println("You are not eligible for loan");
    }
    scan.close();
  }
}
