import java.util.*;
public class find {
  String oddoreven(int num){
    if (num % 2 ==0){
      return "even";
    }
    else{
      return "odd";
    }
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the number to find odd or even: ");
    int input = scan.nextInt();
    find obj = new find();
    String result = obj.oddoreven(input);
    System.out.println(result);
    scan.close();
  }
}
