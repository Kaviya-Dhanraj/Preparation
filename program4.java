import java.util.Scanner;
public class program4{
   public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    //SUM OF ARRAY NUMBERS 
    int[] sumArray = new int[5];
    sumArray[0]=scan.nextInt();
    sumArray[1]=scan.nextInt();
    sumArray[2]=scan.nextInt();
    sumArray[3]=scan.nextInt();
    sumArray[4]=scan.nextInt();
    System.out.println("Sum:");
    System.out.println(sumArray[0]+sumArray[1]+sumArray[2]+sumArray[3]+sumArray[4]);
    
    //USE FOR-LOOP FOR GETTING ARRAY ELEMENTS
    System.out.print("Enter size of arary: ");
    int n = scan.nextInt();
    int[] array=new int[n];
    for(int i = 0;i<n;i++){
      System.out.printf("Enter array valueIndex %d: ",i);
      array[i]=scan.nextInt();
      // System.out.printf("input %d: %d",i,array[i]);
      // System.out.println();
    }
    for(int i=0;i<n;i++){
      System.out.printf("input %d: %d",i,array[i]);
      System.out.println();
    }

    //USING FORLOOP PRINT 10 NUMBERS IN ARRAY
    int[] arr={1,2,3,4,5,6,7,8,9,0};
    for(int i=0;i<arr.length;i++){
      System.out.printf("value %d: %d \n",i ,arr[i]);
    }

    //PRINT 2 TABLE
    System.out.println("Enter the Number of table: ");
    int n1 = scan.nextInt();
    System.out.println("Enter the Number of table lines upto: ");
    int x=scan.nextInt();
    for(int i=1;i<=x;i++){
      int val=i*n1;
      System.out.printf("%d X %d = %d\n",i,n,val);
    }
    
    // FIND MIDDLE ELEMENT
    int n2 = scan.nextInt();
    int[] arr1 = new int[n2];

    for(int i =0;i<n2;i++){
      arr1[i]=scan.nextInt();
    }
    if(n2%2==1){
      int middleElement = n2/2;
      System.out.println("the middle element is "+ arr1[middleElement]);
    }
    else{
      int middleElement1=(n2/2)-1;
      int middleElement2=n2/2;
      System.out.println("the middle elements are "+ arr1[middleElement1] + "and " + arr1[middleElement2]);
    }
    scan.close();
   }
} 