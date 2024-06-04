/*
The Singleton pattern is a creational design pattern that ensures a class has
only one instance and provides a global point of access to that instance. In
simpler terms, it’s like ensuring there’s only one unique copy of a particular
object in your program, and you can access that object from anywhere in your code
 */


package SingletonPattern;
import java.sql.Connection;

public class dbConnectionMainClass {
    public static void main(String[] args) {
        // Get the single instance of DatabaseConnectionManager
        DatabaseConnectionManager dbManager = DatabaseConnectionManager.getInstance();

        // Get a connection
        Connection connection = dbManager.getConnection();

        // Use the connection
        // ...

        // Close the connection
        dbManager.closeConnection(connection);
    }
}
