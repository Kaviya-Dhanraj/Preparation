
public class Laptop {
  String name ="";
  String processor = "";
  int ram = 0;
  int price = 0;

  public static void main(String[] args) {
    Laptop lap1 = new Laptop();
    lap1.name="HP";
    lap1.processor="i3";
    lap1.ram = 32;
    lap1.price = 70000;

    Laptop lap2 = new Laptop();
    System.out.println(lap2.price);
    System.out.println(lap1.price);
  }
}
