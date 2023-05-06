import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import static org.junit.Assert.*;

public class MenuReader {

    @Test
    public void testReadMenu() {
        String filename = "Menu.txt";
        try {
            List<Menu> menuList = MenuReader.readMenu(filename);

            assertEquals(3, menuList.size());

            Menu menu1 = menuList.get(0);
            assertEquals("Burger", menu1.getName());
            assertEquals(9.99, menu1.getPrice(), 0.001);
            assertEquals(0.3, menu1.getWeight(), 0.001);
            assertEquals("Main Course", menu1.getType());
            assertEquals("Fast Food", menu1.getKind());

            Menu menu2 = menuList.get(1);
            assertEquals("Pizza", menu2.getName());
            assertEquals(12.99, menu2.getPrice(), 0.001);
            assertEquals(0.5, menu2.getWeight(), 0.001);
            assertEquals("Main Course", menu2.getType());
            assertEquals("Italian Cuisine", menu2.getKind());

            Menu menu3 = menuList.get(2);
            assertEquals("Salad", menu3.getName());
            assertEquals(7.99, menu3.getPrice(), 0.001);
            assertEquals(0.2, menu3.getWeight(), 0.001);
            assertEquals("Appetizer", menu3.getType());
            assertEquals("Healthy Food", menu3.getKind());
        } catch (FileNotFoundException e) {
            fail("File not found: " + filename);
        }
    }
}
