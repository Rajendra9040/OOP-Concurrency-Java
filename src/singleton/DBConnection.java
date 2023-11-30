package singleton;

public class DBConnection {
    private static DBConnection db = null;

    private DBConnection() {}

    public static DBConnection getInstance() {

        if (db == null) {
            synchronized (DBConnection.class) {
                if (db == null) {
                    db = new DBConnection();
                }
            }
        }

        return db;
    }
}
