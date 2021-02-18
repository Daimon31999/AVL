public class Demo {
    public static void main(String []args) {
        AvlTree tree = new AvlTree();
        int arr[] = {5,3,6,2,4,7,6,9,1,2,8,10,11,12,13,14,15};
        for(int i: arr)
            tree.root = tree.insertNode(tree.root, i);
        System.out.println("tree root");
        System.out.println(tree.root);
        System.out.println("###### Initial Tree #####");
        BTreePrinter.printNode1(tree.root);
        tree.root = tree.deleteNode(tree.root,3);
        tree.root = tree.deleteNode(tree.root,9);
        tree.root = tree.deleteNode(tree.root,10);
        tree.root = tree.deleteNode(tree.root,15);
        System.out.println("Deleted 3,9,10,15");
        BTreePrinter.printNode1(tree.root);

        System.out.println("Sorting");
        tree.sort(tree.root);
	    System.out.println("");
    }
}
