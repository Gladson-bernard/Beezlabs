import java.util.*;
class Student
{
    float englishQuat ,englishHalf;
    float tamilQuat, tamilHalf;
    float mathQuat, mathHalf;
    float scienceQuat, scienceHalf;
    float socialQuat, socialHalf;
    String avg(float a,float b)
    {
        float average = (a+b)/2;
        if(average%1!=0)
        return Float.toString(average);
        return Integer.toString((int)(average));
    }
    void average()
    {
        System.out.println("English - "+avg(englishQuat ,englishHalf));
        System.out.println("Tamil - "+avg(tamilQuat,tamilHalf));
        System.out.println("Math - "+avg(mathQuat,mathHalf));
        System.out.println("Science - "+avg(scienceQuat,scienceHalf));
        System.out.println("Social - "+avg(socialQuat,socialHalf));
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
