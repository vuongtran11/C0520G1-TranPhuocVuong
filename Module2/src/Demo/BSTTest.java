package demo;

import java.util.Arrays;
import java.util.Collections;

public class BSTTest {

    public static void main(String[] args) {
        BST treeBST = new BST();
        treeBST.insert(5);
        treeBST.insert(1);
        treeBST.insert(2);
        treeBST.insert(6);
        treeBST.insert(4);
        treeBST.insert(6);
        treeBST.insert(8);
        treeBST.insert(0);

        treeBST.print(treeBST.root);
        System.out.println("Size " + treeBST.size);

    }
}
