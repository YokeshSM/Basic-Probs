import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a[]={5,4,3,2,1};
        for(int i=1;i<a.length;i++)
        {
            int j=i-1;
            int curr=a[i];
            System.out.println(curr);
            while(j>=0&&a[j]>curr)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=curr;
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
    }
}