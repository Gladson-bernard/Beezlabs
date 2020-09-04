
public class MyClass {
    static int countOnes(String num)
    {
        int count=0;
        for(int index=0;index<num.length();index++)
        {
            if(num.charAt(index)=='1')
            count++;
        }
        return count;
    }
    public static void main(String args[]) {
    int start=1,end=10;
    int onesCount=0;
    for(int itr=start;itr<=end;itr++)
    {
        String num = Integer.toString(itr);
        onesCount+=countOnes(num);

    }
    System.out.println(onesCount);
    }
}
