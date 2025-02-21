public class constructor {

  int rollno;
  String name;
  int marks; 
  
  constructor(){
    System.out.println("hello");
  }
  
  constructor(int a, String b , int c){
    rollno = a;
    name = b ;
    marks = c ;
  }

  public static void main(String[] args) {
    constructor obj1 = new constructor();
    // int a ;
   // System.out.println(a);// this line gives an error like there is no initialization of the value "a"

    // but i can print the rollno , name and marks without initialization 
   // because of the help of constrctor
   System.out.println(obj1.marks);//for this, output is 0 . 
   //because of default constructor is called while the creation of the object

   //parameterized constructor
   constructor obj2 = new constructor(1,"kaviya",99);
   System.out.println(obj2.rollno);
   System.out.println(obj2.name);
   System.out.println(obj2.marks);
  }

  // here constructor overloading is also happens

}
