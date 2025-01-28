import java.util.Scanner;
public class rcb {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String RCB = scan.nextLine();

    if(RCB.equals("wins")){
      System.out.println("Eee Sala cup Nammdhe");
    }
    else{
      System.out.println("No cups");
    }
    scan.close();
  }
}
