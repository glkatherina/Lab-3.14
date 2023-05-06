import org.junit.Test;
import static org.junit.Assert.*;

public class MenuRecord {

    @Test
    public void testGetDishName() {
        MenuRecord record = new MenuRecord("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        assertEquals("Burger", record.getDishName());
    }

    @Test
    public void testGetPrice() {
        MenuRecord record = new MenuRecord("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        assertEquals(9.99, record.getPrice(), 0.001);
    }

    @Test
    public void testGetWeight() {
        MenuRecord record = new MenuRecord("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        assertEquals(0.3, record.getWeight(), 0.001);
    }

    @Test
    public void testGetType() {
        MenuRecord record = new MenuRecord("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        assertEquals("Main Course", record.getType());
    }

    @Test
    public void testGetCategory() {
        MenuRecord record = new MenuRecord("Burger", 9.99, 0.3, "Main Course", "Fast Food");
        assertEquals("Fast Food", record.getCategory());
    }
}
