import java.util.Scanner;
public class program3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //PRINT NUMBERS BETWEEN A AND B
    int a=scan.nextInt();
    int b= scan.nextInt();
    System.out.printf("the values between %d and %d are : \n",a,b);
    for(int i=a;i<=b;i++){
      System.out.println(i);
    }

    //PRINT EVEN NUMBER BETWEEN 1 TO 10
    System.out.println("even numbers between 1 & 10");
    for(int i=1;i<=10;i++){
      if(i%2==0){
        System.out.println(i);
      }
    }

    //PRINT THE COUNT THE ODD NUMBERS FROM 1 T0 10
    System.out.println("count of odd numbers between 1 & 10");
    int count = 0;
    for(int i=1;i<10;i++){
      if(i%2==1){
        count++;
      }
    }
    System.out.println(count);

    //PRINT THE COUNT EVEN NUMBERS FROM 1 T0 10
    int count1 = 0;
    for(int i=1;i<=10;i++){
      if(i%2==0){
        count1++;
      }
    }
    System.out.println("the even number count is "+count1);

    //PRINT THE NUMBER WHICH ARE DIVISIBLE BY 3 AND 5 ,RANGE 1 TO 100
    System.out.println("numbers which are divisible by 3 and 5 between 1 & 100");
    for(int i=1;i<=100;i++){
      if(i%3==0&&i%5==0){
        System.out.println(i);
      }
    }
    scan.close();
  }
}
