// public class largeNumber {
//   public static void main(String args[]){
//     int a=40;
//     int b=50;

    // int result=(a>b)?a:b;
    // System.out.println("The largest number is "+ result);
    

    // if(a>b){
    //   System.out.println("A is greater than B");
    // }
    // else{
    //   System.out.println("B is greater than A");
    // }


    // boolean result=(a==b)?true:false;
    // System.out.println(result);

    // if (a==b){
    //   System.out.print("These 2 numbers are equal");
    // }
    // else{
    //   System.out.print("These 2 numbers are not equal");
    // }
//    

import java.util.Scanner;
public class largeNumber{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int a= scan.nextInt();
    int b=scan.nextInt();
    
    // if(a==b){
    if(a>b){
      // System.out.print("2 numbers are equal");
      System.out.print("A is greater than B");
    }
    else if(a==b){
      System.out.print("A is equals to B");
    }
    else{
      // System.out.print("2 numbers are not equal");
      System.out.print("B is greater than A");
    }

    scan.close();
  }
}
