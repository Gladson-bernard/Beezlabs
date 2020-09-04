public class MyClass {
    public static void main(String args[]) {
     String str = "BeezLabs in an innovative company which builts Intelligent Automation Platform driven by AI ";
     int noOfCharacters=0;
     for(int index=0;index<str.length();index++)
     {
         char c = str.charAt(index);
         if('a'<=c&&c<='z' || 'A'<=c&&c<='Z')
         { noOfCharacters++;}
     }
     System.out.println(noOfCharacters);
    }
}
