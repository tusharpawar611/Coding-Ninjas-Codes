/*
 * Binary Tree Node class
 * 
 * class BinaryTreeNode<T> { 
 * 		T data; 
 * 		BinaryTreeNode<T> left; 
 * 		BinaryTreeNode<T> right;
 * 		public BinaryTreeNode(T data) 
 * 		{ 
 * 			this.data = data; 
 * 		}
 * }
 */

 /* 
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */

public class BinarySearchTree {
    private static BinaryTreeNode<Integer> root;
    //     ----search
    public static boolean search(int data){
        return searchHelper(root,data);

    }
    private static boolean searchHelper(BinaryTreeNode<Integer> root,int data){
        if(root==null)
            return false;
        if(root.data==data)
            return true;
        else if(root.data>data)
            return searchHelper(root.left,data);
        else 
            return searchHelper(root.right,data);

    }

    //    ----insert
    public static void insert(int data){
        root=insertHelper(root,data);
        // return ;
    }
    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root,int data)
    {
        if(root==null)
        {
            BinaryTreeNode<Integer> node= new BinaryTreeNode<>(data);
            return node;
        }
        if(data>root.data)
        {
            BinaryTreeNode<Integer> rightcall=insertHelper(root.right,data);
            root.right=rightcall;
        }
        else if(data<=root.data)
        {
            BinaryTreeNode<Integer> leftcall=insertHelper(root.left,data);
            root.left=leftcall;
        }

        return root;
    }



    // -----printTree
    public static void printTree(){
        printHelper(root);
        return;
    }
    private static void printHelper(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return ;
        }
       // String s=root.data+":";
        System.out.print(root.data+":");
        if(root.left!=null){
            System.out.print("L:"+root.left.data+",");
            
        }
            // s=s+"L:"+root.left.data+",";
        if(root.right!=null){
        // s=s+"R:"+root.right.data;
            System.out.print("R:"+root.right.data);
        }
        // System.out.println(s);
        System.out.println();
        printHelper(root.left);
        printHelper(root.right);
        return;
    }


    // ------delete
    public static void remove(int data){
        root= deleteHelper(root,data);
        // return;
    }
    private static BinaryTreeNode<Integer> deleteHelper(BinaryTreeNode<Integer> root,int data){
        if(root==null)
            return null;
        if(root.data==data){
            if(root.left!=null && root.right==null)
                return root.left;
            else if(root.left==null && root.right!=null)
                return root.right;
            else if(root.left==null && root.right==null)
                return null;
            else{
                // int rootData=minimum(root.right);
                //  BinaryTreeNode<Integer> newNode= deleteHelper(root,rootData);

                BinaryTreeNode<Integer> minNode = root.right;
                while (minNode.left != null) {
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = deleteHelper(root.right,minNode.data);
                return root;
            }

        }
        else if(root.data>data)
        {BinaryTreeNode<Integer> leftt=deleteHelper(root.left,data);
         root.left=leftt;}
        else{
            BinaryTreeNode<Integer> rightt=deleteHelper(root.right,data);
            root.right=rightt;  
        }

        return root;
    }

}