package junit.databaseconnection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatabaseConnectionTest {

    DatabaseConnection db;

    // Runs before each test
    @BeforeEach
    void setup() {
        db = new DatabaseConnection();
        db.connect();
    }
    // Runs after each test
    @AfterEach
    void tearDown(){
        db.disconnect();
    }
    // verify the connection
    @Test
    public void testConnection(){
        assertTrue(db.isConnected());
    }
}
