import java.util.Random;
public class whileloop {
  public static void main(String[] args) {
    Random number = new Random();
    int randnumber = 0;
    while(randnumber!=9){
      randnumber = number.nextInt(10);
      System.out.println(randnumber);
    }
  }
}
