import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
    int arr[] = {1,2,4,6,3,7,8};
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
        if(i+1!=arr[i])
        {
            System.out.println(i+1);
            return;
        }
    }
    }
}
