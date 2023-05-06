import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MenuProcessor {

    @Test
    public void testPrintMenu() {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("Burger", 9.99, 0.3, "Main Course", "Fast Food"));
        menuList.add(new Menu("Pizza", 12.99, 0.5, "Main Course", "Italian Cuisine"));
        menuList.add(new Menu("Salad", 7.99, 0.2, "Appetizer", "Healthy Food"));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MenuProcessor.printMenu(menuList);

        String expectedOutput = "Burger, 9.99, 0.3, Main Course, Fast Food\n" +
                "Pizza, 12.99, 0.5, Main Course, Italian Cuisine\n" +
                "Salad, 7.99, 0.2, Appetizer, Healthy Food\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
}
