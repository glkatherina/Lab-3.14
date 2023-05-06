import org.junit.Test;
import static org.junit.Assert.*;

public class Menu {

    @Test
    public void testGetName() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        assertEquals("Burger", menu.getName());
    }

    @Test
    public void testGetPrice() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        assertEquals(9.99, menu.getPrice(), 0.001);
    }

    @Test
    public void testGetWeight() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        assertEquals(0.3, menu.getWeight(), 0.001);
    }

    @Test
    public void testGetType() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        assertEquals("Main Course", menu.getType());
    }

    @Test
    public void testGetKind() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        assertEquals("Fast Food", menu.getKind());
    }

    @Test
    public void testSetPrice() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        menu.setPrice(12.99);
        assertEquals(12.99, menu.getPrice(), 0.001);
    }

    @Test
    public void testSetWeight() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        menu.setWeight(0.4);
        assertEquals(0.4, menu.getWeight(), 0.001);
    }

    @Test
    public void testSetType() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        menu.setType("Appetizer");
        assertEquals("Appetizer", menu.getType());
    }

    @Test
    public void testSetKind() {
        Menu menu = new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        menu.setKind("American Cuisine");
        assertEquals("American Cuisine", menu.getKind());
    }
}
