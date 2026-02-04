package junit.filehandling;
import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {

    @Test
    void testWriteRead() throws Exception {

        FileProcessor fp = new FileProcessor();

        fp.writeToFile("test.txt", "Hello");

        String data = fp.readFromFile("test.txt");

        assertEquals("Hello", data);

        File f = new File("test.txt");

        assertTrue(f.exists());
    }

    @Test
    void testFileNotFound() {

        FileProcessor fp = new FileProcessor();

        assertThrows(IOException.class, () -> {

            fp.readFromFile("abc.txt");
        });
    }
}
