package generic_stack_queue.thuc_hanh;

public class Node {
    public int key;
    public Node next;
    public String value;
    public Node left;
    public Node right;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}
