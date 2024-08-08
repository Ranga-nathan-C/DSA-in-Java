// problem 1
// class TreeNode {
//     int value;
//     TreeNode left, right;

//     TreeNode(int value) {
//         this.value = value;
//         left = right = null;
//     }
// }

// public class TreeTraversal {
//     public static void preorder(TreeNode node) {
//         if (node == null) {
//             return;
//         }
//         System.out.print(node.value + " ");
//         preorder(node.left);
//         preorder(node.right);
//     }
//     public static void inorder(TreeNode node) {
//         if (node == null) {
//             return;
//         }
//         inorder(node.left);
//         System.out.print(node.value + " ");
//         inorder(node.right);
//     }

//     public static void postorder(TreeNode node) {
//         if (node == null) {
//             return;
//         }
//         postorder(node.left);
//         postorder(node.right);
//         System.out.print(node.value + " ");
//     }


//     public static void main(String[] args) {
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
//         root.left.right = new TreeNode(5);
//         root.left.right.left = new TreeNode(8);
//         root.right.left = new TreeNode(6);
//         root.right.right = new TreeNode(7);
//         root.right.right.right = new TreeNode(10);
//         root.right.right.left = new TreeNode(9);

//         System.out.println("Preorder Traversal:");
//         preorder(root);
//         System.out.println();
//         System.out.println("Inorder Traversal:");
//         inorder(root);
//         System.out.println();
//         System.out.println("Postorder Traversal:");
//         postorder(root);

//     }
// }   
// problem 2:
// class TreeNode {
//     int value;
//     TreeNode left, right;

//     TreeNode(int value) {
//         this.value = value;
//         left = right = null;
//     }
// }

// public class TreeTraversal {
//     public static void preorder(TreeNode node) {
//         if (node == null) {
//             return;
//         }
//         System.out.print(node.value + " ");
//         preorder(node.left);
//         preorder(node.right);
//     }
//     public static void inorder(TreeNode node) {
//         if (node == null) {
//             return;
//         }
//         inorder(node.left);
//         System.out.print(node.value + " ");
//         inorder(node.right);
//     }

//     public static void postorder(TreeNode node) {
//         if (node == null) {
//             return;
//         }
//         postorder(node.left);
//         postorder(node.right);
//         System.out.print(node.value + " ");
//     }


//     public static void main(String[] args) {
//         TreeNode root = new TreeNode(4);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(5);
//         root.left.left = new TreeNode(3);
//         root.left.left.right = new TreeNode(9);
//         root.left.left.right.left = new TreeNode(1);
//         root.right.right = new TreeNode(6);
//         root.right.left = new TreeNode(7);
//         root.right.right.left = new TreeNode(8);

//         System.out.print("Preorder Traversal: ");
//         preorder(root);
//         System.out.println();
//         System.out.print("Inorder Traversal: ");
//         inorder(root);
//         System.out.println();
//         System.out.print("Postorder Traversal: ");
//         postorder(root);

//     }
// }  
