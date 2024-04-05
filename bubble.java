import java.util.*;
public class bubble{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a[]={5,4,3,2,1};
        for(int i=0;i<a.length;i++)
        {
             int c=0;
            for(int j=1;j<(a.length-i);j++)
            {
                if(a[j-1]>a[j])
                {
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                    c++;
                }
            }
            if(c==0)
            break;
            System.out.println(Arrays.toString(a));
        }
    }
}
