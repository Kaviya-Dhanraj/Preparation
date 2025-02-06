import java.util.Scanner;;
public class priceAmount {
  Scanner scan = new Scanner(System.in);
    int apple_price = scan.nextInt();
    int apple_count = scan.nextInt();
  
  void price(){
    int price = apple_count*apple_price;
    System.out.println(price);
  }
  public static void main(String[] args) {
    

    priceAmount obj = new priceAmount();
    obj.price();
    
  }
}
