public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Default constructor
    public TreeNode() {}

    // Constructor with value parameter
    public TreeNode(int val) {
        this.val = val;
    }

    // Constructor with value, left node, and right node parameters
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int tri(TreeNode r,int l)
    {
        if(r==null)
        {
            return l;
        }
        l++;
        l=Math.max(tri(r.left,l),tri(r.right,l));

//        if(r.left!=null)
//        {
//         l=Math.max(tri(r.left,l),l);
//        }
//        if(r.right!=null)
//        {
//            l=Math.max(tri(r.right,l),l);
//        }
        return l;
    }


    public static void main(String[] args) {
        // Creating root node with value 1
        TreeNode root = new TreeNode(3);

        // Adding left and right children to the root node
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);


        // Adding children to the right child of the root
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(17);


        System.out.println(new TreeNode().tri(root,0));


    }


}

