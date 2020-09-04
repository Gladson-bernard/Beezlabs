import java.util.*;
class Student
{
    float englishQuat ,englishHalf;
    float tamilQuat, tamilHalf;
    float mathQuat, mathHalf;
    float scienceQuat, scienceHalf;
    float socialQuat, socialHalf;
    void average()
    {
        System.out.println("English - "+((englishQuat+englishHalf)/2));
        System.out.println("Tamil - "+((tamilQuat+tamilHalf)/2));
        System.out.println("Math - "+((mathQuat+mathHalf)/2));
        System.out.println("Science - "+((scienceQuat+scienceHalf)/2));
        System.out.println("Social - "+((socialQuat+socialHalf)/2));
    }
}
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of Dtudents :");
      int N = sc.nextInt();
      System.out.print(N+"\n");
      Student st[] = new Student[N];
      for(int i=0;i<N;i++)
      {    st[i] = new Student();
          System.out.println("Enter the "+(i+1)+"st student Quaterly marks:");
          st[i].englishQuat = sc.nextFloat();// 100 
          st[i].tamilQuat = sc.nextFloat();// 98
          st[i].mathQuat = sc.nextFloat();//97
          st[i].scienceQuat = sc.nextFloat();//100
          st[i].socialQuat = sc.nextFloat();//97
          System.out.println("Enter the "+(i+1)+"st student Half yearly marks:");
          st[i].englishHalf = sc.nextFloat();// 98
          st[i].tamilHalf = sc.nextFloat();// 96
          st[i].mathHalf = sc.nextFloat();//99
          st[i].scienceHalf = sc.nextFloat();//100
          st[i].socialHalf = sc.nextFloat();//100
          
          
      }
      for(int i=0;i<N;i++)
      { System.out.println("Average of "+(i+1)+" student ");
          st[i].average();
      }
    }
}
