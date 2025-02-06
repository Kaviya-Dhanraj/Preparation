public class function {
   static void greet(){
    function obj = new function();
    System.out.println("Hello");
    obj.namee();
   }
   void namee(){
    System.out.println("Kaviya");
   }
  public static void main(String[] args) {
   // greet();//we cant able to call function like this
  //  function obj = new function();
  //  obj.greet();
  //  obj.namee();
  greet();
  }
}
