public class stringComparision {
  public static void main(String args[]){
    String a1="Kaviya";
    String a2="Kaviya";
    
    System.out.println(a1==a2);//this will check the address of the values
    System.out.println(a1.equals(a2));//this will check the actual value of the string

    String b1=new String("Madhan");
    String b2=new String("Madhan");
    
    System.out.println(b1==b2);
    System.out.println(b1.equals(b2));


  }
}
