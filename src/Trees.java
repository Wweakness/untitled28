import java.util.Stack;
import java.util.*;

//12453
public class Trees {
    //12453
      public static void preorderNoR(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while (cur!=null||!stack.isEmpty()){
            while (cur!=null) {
                System.out.println(cur.val);
                stack.push(cur);
                cur = cur.left ;
            }
            TreeNode Top=stack.pop();
            cur=Top.right;
        }
    }
    //42513
    public static void inoderNoR(TreeNode root){
          Stack<TreeNode> stack=new Stack<>();
          TreeNode cur=root;
          while (cur!=null||!stack.isEmpty()) {
              while (cur != null) {
                  stack.push(cur);
                  cur = cur.left;
              }

              TreeNode Top = stack.pop();
              System.out.println(Top.val);
              cur =Top.right;
          }
    }
    public static void postorderNoR(TreeNode root){
          Stack<TreeNode> stack=new Stack<>();
          TreeNode cur=root;
          while (cur!=null||!stack.isEmpty()){
              while (cur!=null){
                  stack.push(cur);
                  cur=cur.left;
              }

          }
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode();
        n1.val=1;
        n1.left=new TreeNode();
        n1.left.val=2;
        n1.right=new TreeNode();
        n1.right.val=3;
        n1.left.left=new TreeNode();
        n1.left.left.val=4;
        n1.left.right=new TreeNode();
        n1.left.right.val=5;

        //preorderNoR(n1);
        inoderNoR(n1);
    }
}
