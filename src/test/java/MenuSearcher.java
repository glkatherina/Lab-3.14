import org.junit.Test;
import java.io.FileNotFoundException;
import java.util.List;
import static org.junit.Assert.*;

public class MenuSearcher {

    @Test
    public void testSearchMenu() {
        String fileName = "menu.txt";
        String query = "Burger";
        try {
            List<Menu> result = MenuSearcher.searchMenu(fileName, query);

            assertEquals(1, result.size());

            Menu menu = result.get(0);
            assertEquals("Burger", menu.getName());
            assertEquals(9.99, menu.getPrice(), 0.001);
            assertEquals(0.3, menu.getWeight(), 0.001);
            assertEquals("Main Course", menu.getType());
            assertEquals("Fast Food", menu.getKind());
        } catch (FileNotFoundException e) {
            fail("File not found: " + fileName);
        }
    }
}
