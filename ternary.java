import java.util.Scanner;

public class ternary {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int val1=scan.nextInt();
    int val2=scan.nextInt();

    int result =(val1>val2)?val1:val2;
    System.out.println("the largest number is "+result);
    scan.close();
  }
}
