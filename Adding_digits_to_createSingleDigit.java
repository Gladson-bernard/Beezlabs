import java.util.Scanner;
public class MyClass {
  static int convertToSingleDigit(int num)
  {
      int sum=0;
      while(num>0)
      {
          sum=sum+num%10;
          num=num/10;
      }
      return sum;
  }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();//eg: 9829
    do{
        N = convertToSingleDigit(N);
    }
    while(N>9);
    System.out.println(N);
    
    }
}
