import java.util.*;
public class Main{
    public static Node root1;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String b[]=sc.nextLine().split(", ");
        ArrayList<Integer> v=new ArrayList<Integer>();
        for(int i=0;i<b.length;i++)
        v.add(Integer.parseInt(b[i]));
        // System.out.println(v);
        // Node root1=insert(null,v.get(v.size()-1));
        for(int i=v.size()-1;i>=0;i--)
        root1=insert(root1,v.get(i));
        inorder(root1);
    }
     static Node inorder(Node root)
     {
         if(root!=null)
         {
         inorder(root.left);
         System.out.print(root.val+" ");
         inorder(root.right);
         }
         return root;
     }
    static Node insert(Node root,int d)
    {
        if(root==null)
        return new Node(d);
        if(root.val>d)
        root.left=insert(root.left,d);
        else if(root.val<d)
        root.right=insert(root.right,d);
        return root;
    }
}
class Node{
    int val;
    Node right,left;
    Node(int v)
    {
        val=v;
        right=left=null;
    }
}
