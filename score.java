import java.util.Scanner;

public class score {
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  String Name = scan.nextLine();
  String Department = scan.nextLine();
  float score = scan.nextInt();

  float score1=score/10;

  System.out.println("My Name is "+Name + " from "+Department+ " Department");
  System.out.println("My score is "+score1+"/10" );
  scan.close();
}
}
