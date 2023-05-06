import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Binary {

    private Binary binaryTree;

    @Before
    public void setUp() {
        binaryTree = new Binary();
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(2);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(8);
    }

    @Test
    public void testInsert() {
        assertEquals(binaryTree.search(5).value, 5);
        assertEquals(binaryTree.search(3).value, 3);
        assertEquals(binaryTree.search(7).value, 7);
        assertEquals(binaryTree.search(2).value, 2);
        assertEquals(binaryTree.search(4).value, 4);
        assertEquals(binaryTree.search(6).value, 6);
        assertEquals(binaryTree.search(8).value, 8);
        assertNull(binaryTree.search(1));
    }

    @Test
    public void testDelete() {
        binaryTree.delete(6);
        assertNull(binaryTree.search(6));
        binaryTree.delete(3);
        assertNull(binaryTree.search(3));
        binaryTree.delete(5);
        assertNull(binaryTree.search(5));
        assertEquals(binaryTree.search(4).value, 4);
        assertEquals(binaryTree.search(2).value, 2);
        assertEquals(binaryTree.search(7).value, 7);
        assertEquals(binaryTree.search(8).value, 8);
    }

    @Test
    public void testPreorderTraversal() {
        // Expected output: 5 3 2 4 7 6 8
        String expected = "5 3 2 4 7 6 8";
        assertEquals(expected, getTraversalOutput(binaryTree::preorderTraversal));
    }

    @Test
    public void testPostorderTraversal() {
        // Expected output: 2 4 3 6 8 7 5
        String expected = "2 4 3 6 8 7 5";
        assertEquals(expected, getTraversalOutput(binaryTree::postorderTraversal));
    }

    private String getTraversalOutput(Runnable traversalMethod) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        traversalMethod.run();
        return outputStream.toString().trim();
    }
}
