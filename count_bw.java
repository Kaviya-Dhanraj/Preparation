import java.util.Scanner;
public class count_bw {
   static void count(int a){
   int count = 0;
   for(int i = 1;i<=32;i++){
    count += a&1;
    a = a>>1;
   }
   System.out.println(count);
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    count(a);
    scan.close();
  }
}
