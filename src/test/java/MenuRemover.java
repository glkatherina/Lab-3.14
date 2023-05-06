import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class MenuRemover {

    private static final String TEST_FILENAME = "Menu.txt";

    @Before
    public void setup() throws IOException {
        String testContent = "Burger, 9.99, 0.3, Main Course, Fast Food\n" +
                "Pizza, 12.99, 0.5, Main Course, Italian Cuisine\n" +
                "Salad, 7.99, 0.2, Appetizer, Healthy Food\n";
        Files.write(Paths.get(TEST_FILENAME), testContent.getBytes());
    }

    @After
    public void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILENAME));
    }

    @Test
    public void testRemoveRecord() throws IOException {
        String query = "Pizza";
        MenuRemover.removeRecord(TEST_FILENAME, query);

        String expectedContent = "Burger, 9.99, 0.3, Main Course, Fast Food\n" +
                "Salad, 7.99, 0.2, Appetizer, Healthy Food\n";
        String actualContent = Files.readString(Paths.get(TEST_FILENAME));

        assertEquals(expectedContent, actualContent);
    }
}
