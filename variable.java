import java.util.Scanner;

public class variable {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String Name = scan.nextLine();
    int Age = scan.nextInt();
    scan.nextLine();
    String Address = scan.nextLine();
    
    System.out.println("My Name is "+ Name + " and My age is "+Age);
    System.out.println("My Native is "+ Address);

    scan.close();
  }
}
