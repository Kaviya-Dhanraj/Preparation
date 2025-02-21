import java.util.*;
public class school {
  String passorfail(int marks){
    if(marks>35*5){//this condition refers atleast getting pass mark (35) in the each subjects(5)
      return "pass";
    }
    else{
      return "fail";
    }
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the total marks: ");
    int total = scan.nextInt();
    school obj = new school();
    System.out.println(obj.passorfail(total));
    scan.close();
  }
}
