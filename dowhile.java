import java.util.Scanner;
public class dowhile {
  public static void main(String[] args) {
    // int count = 0;
    // do{
    //   System.out.println("Kaviya");
    //   count++;
    // }while(count<5);
    // }while(false);//Runs atleast once

    Scanner scan = new Scanner(System.in);
    int num;
    do{
      System.out.println("Enter the number less than 10: ");
      num = scan.nextInt();
    }while(num > 10);
    scan.close();
  }
}
