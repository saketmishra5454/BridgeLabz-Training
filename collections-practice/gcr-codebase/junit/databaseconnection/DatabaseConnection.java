package junit.databaseconnection;

public class DatabaseConnection {

    boolean connected = false;

    public void connect() {   //method for connect

        connected = true;
        System.out.println("Connected");
    }

    public void disconnect() {      //method for disconnect

        connected = false;
        System.out.println("Disconnected");
    }

    public boolean isConnected() {

        return connected;
    }
}
