import org.junit.Test;
import static org.junit.Assert.*;

public class Node{

    @Test
    public void GetData() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        Node node = new Node(menu);
        assertEquals(menu, node.getData());
    }

    @Test
    public void GetLeft() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        Node leftNode = new Node(menu);
        Node node = new Node(menu);
        node.setLeft(leftNode);
        assertEquals(leftNode, node.getLeft());
    }

    @Test
    public void GetRight() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        Node rightNode = new Node(menu);
        Node node = new Node(menu);
        node.setRight(rightNode);
        assertEquals(rightNode, node.getRight());
    }

    @Test
    public void SetLeft() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        Node leftNode = new Node(menu);
        Node node = new Node(menu);
        node.setLeft(leftNode);
        assertEquals(leftNode, node.getLeft());
    }

    @Test
    public void SetRight() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        Node rightNode = new Node(menu);
        Node node = new Node(menu);
        node.setRight(rightNode);
        assertEquals(rightNode, node.getRight());
    }
}
