import java.util.Scanner;
 
public class VA {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String Meghna = scan.nextLine();

    if(Meghna.equals("died")){
      System.out.println("Surya Meets Ramya");
    }
    else{
      System.out.println("Surya weds Meghna");
    }
    scan.close();
  }
}
