// import java.util.Scanner;
public class return1 {
  // Scanner scan = new Scanner(System.in);
  int sum(int n1, int n2){
    int total = n1+n2;
    return(total);
  }
  
  String getName(String name){
    // String name = scan.nextLine();
    
    return name;
  }

  long phone(){
    return 9597208207L;
  }

  public static void main(String args[]){
    int a =10;
    int b =10;
    String name = "Kaviya";
    return1 obj1 = new return1();
    System.out.println(obj1.sum(a,b));
    System.out.println(obj1.getName(name));
    System.out.println(obj1.phone());
  }
}
